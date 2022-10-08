package com.rachel.spirng_ioc_xml.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Rachel
 * @date 2022/8/4 13:35
 * @desciption: 学生类
 * @status
 */

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Clazz clazz;
    private String[] hobbies;
    private Map<String, Teacher> teacherMap;



    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Student(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Clazz getClazz() {
        return clazz;
    }
    public void setClazz(Clazz clazz) { this.clazz = clazz;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(Integer id, String name, Integer age, String sex, Clazz clazz, String[] hobbies, Map<String, Teacher> teacherMap) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.clazz = clazz;
        this.hobbies = hobbies;
        this.teacherMap = teacherMap;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", clazz=" + clazz +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
