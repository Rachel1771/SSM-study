package com.chen.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.ename
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    private String ename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.deptno
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    private Integer deptno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sal
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    private Double sal;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.ename
     *
     * @return the value of emp.ename
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.ename
     *
     * @param ename the value for emp.ename
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.deptno
     *
     * @return the value of emp.deptno
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.deptno
     *
     * @param deptno the value for emp.deptno
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sal
     *
     * @return the value of emp.sal
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    public Double getSal() {
        return sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sal
     *
     * @param sal the value for emp.sal
     *
     * @mbggenerated Sat Jul 30 19:50:33 CST 2022
     */
    public void setSal(Double sal) {
        this.sal = sal;
    }
}