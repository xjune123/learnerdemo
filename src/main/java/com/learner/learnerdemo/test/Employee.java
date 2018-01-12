package com.learner.learnerdemo.test;

import java.util.Date;

public class Employee {

    private String employeeName;
    private String employeeNum;
    private Date hireDate;

    public Employee(String employeeName, String employeeNum, Date hireDate) {
        this.employeeName = employeeName;
        this.employeeNum = employeeNum;
        this.hireDate = hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
