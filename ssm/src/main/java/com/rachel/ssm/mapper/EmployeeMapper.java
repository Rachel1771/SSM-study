package com.rachel.ssm.mapper;

import com.rachel.ssm.pojo.Employee;

import java.util.List;

/**
 * @author Rachel
 * @date 2022/10/7 18:07
 * @desciption:
 * @status
 */
public interface EmployeeMapper {
    List<Employee> getEmployeeList();
}
