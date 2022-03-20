package com.melons.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.melons.server.pojo.Employee;
import com.melons.server.pojo.RespBean;
import com.melons.server.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author melons
 * @since 2021-10-17
 */
public interface IEmployeeService extends IService<Employee> {

    RespPageBean getEmployeePage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    RespBean maxWorkID();

    RespBean addEmp(Employee employee);

    List<Employee> getEmployee(Integer id);

    RespPageBean getEmployeeWithSalary(Integer currentPage, Integer size);
}
