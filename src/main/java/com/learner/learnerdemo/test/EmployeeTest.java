package com.learner.learnerdemo.test;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("张三","1001",new Date());
        Date date = employee.getHireDate();

        System.out.println(employee.getHireDate());
        double seconds = 10*365.25*24*60*60;
        date.setTime((long) (date.getTime() - seconds));
        System.out.println(employee.getHireDate());


    }
}
