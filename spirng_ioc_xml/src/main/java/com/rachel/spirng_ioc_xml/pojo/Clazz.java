package com.rachel.spirng_ioc_xml.pojo;

import java.util.List;

/**
 * @author Rachel
 * @date 2022/8/5 11:25
 * @desciption:
 * @status
 */
public class Clazz {
    private Integer clazzId;
    private String clazzName;
    private List<Student> students;

    public Clazz() {
    }

    public Clazz(Integer clazzId, String clazzName, List<Student> students) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId=" + clazzId +
                ", clazzName='" + clazzName + '\'' +
                ", students=" + students +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getClazzId() { return clazzId;
    }
    public void setClazzId(Integer clazzId) { this.clazzId = clazzId;
    }
    public String getClazzName() { return clazzName;
    }
    public void setClazzName(String clazzName) { this.clazzName = clazzName;
    }

}
