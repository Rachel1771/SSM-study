package com.rachel.ssm.controller;

import com.rachel.ssm.pojo.Employee;
import com.rachel.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Rachel
 * @date 2022/10/7 18:07
 * @desciption:
 * @status
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployeeList(Model model){
        List<Employee> list = employeeService.getEmployeeList();
        model.addAttribute("list", list);
        return "employee_list";
    }

}
