package com.rachel.ssm.service;

import com.rachel.ssm.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rachel
 * @date 2022/10/7 18:08
 * @desciption:
 * @status
 */

public interface EmployeeService {
    List<Employee> getEmployeeList();

}
