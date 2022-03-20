package com.melons.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.melons.server.pojo.Department;
import com.melons.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author melons
 * @since 2021-10-17
 */
public interface IDepartmentService extends IService<Department> {

    List<Department> getAllDepatrments();

    RespBean addDep(Department dep);

    RespBean deleteDep(Integer id);
}
