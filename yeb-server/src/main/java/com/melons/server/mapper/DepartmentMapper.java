package com.melons.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.melons.server.pojo.Department;
import com.melons.server.pojo.RespBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author melons
 * @since 2021-10-17
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

    List<Department> getAllDepartments(Integer parentId);

    void addDep(Department dep);

    void deleteDep(Department dep);
}
