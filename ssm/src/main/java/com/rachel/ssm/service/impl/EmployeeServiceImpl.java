package com.rachel.ssm.service.impl;

import ch.qos.logback.classic.pattern.LineSeparatorConverter;
import com.rachel.ssm.mapper.EmployeeMapper;
import com.rachel.ssm.pojo.Employee;
import com.rachel.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Rachel
 * @date 2022/10/7 18:09
 * @desciption:
 * @status
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getEmployeeList() {
        return employeeMapper.getEmployeeList();
    }
}
