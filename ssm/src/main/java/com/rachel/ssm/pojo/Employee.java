package com.rachel.ssm.pojo;

/**
 * @author Rachel
 * @date 2022/10/7 18:08
 * @desciption:
 * @status
 */
public class Employee {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private String email;

    public Employee() {
    }

    public Employee(Integer empId, String empName, Integer age, String gender, String email) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
