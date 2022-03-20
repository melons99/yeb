package com.melons.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.melons.server.mapper.DepartmentMapper;
import com.melons.server.pojo.Department;
import com.melons.server.pojo.RespBean;
import com.melons.server.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author melons
 * @since 2021-10-17
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {


    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepatrments() {
        return departmentMapper.getAllDepartments(-1);
    }

    @Override
    public RespBean addDep(Department dep) {
        dep.setEnabled(true);
        departmentMapper.addDep(dep);
        if(dep.getResult() == 1){

            return RespBean.success("添加成功！").setObj(dep);
        }
        return RespBean.error("添加失败！");
    }

    @Override
    public RespBean deleteDep(Integer id) {
        Department dep = new Department();
        dep.setId(id);
        departmentMapper.deleteDep(dep);
        if(dep.getResult() == -2){
            return RespBean.error("该部门下还有子部门，删除失败！");
        }
        if(dep.getResult() == -1){
            return RespBean.error("该部门下还有员工，删除失败！");
        }
        if(dep.getResult() == 1){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }
}
