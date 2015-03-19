/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacore.classes;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Daria
 */
public class EmployeeTest {
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("name1", 10000, 1996, 12, 12);
        staff[1] = new Employee("name2", 20000, 1995, 6, 30);
        staff[2] = new Employee("name3", 30000, 1992, 3, 24);
        
        for (Employee e : staff)
            e.raiseSalary(5);
        
        for (Employee e : staff)
            System.out.println(e.getName()+"  "+e.getSalary()+"  "+e.getHireDay());
    }
    
}

class Employee{
    public Employee (String n, double s, int year, int month, int day){
        name = n; salary = s; 
        GregorianCalendar calendar = new GregorianCalendar(year, month=1, day);
        hireDay = calendar.getTime();
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }    
    public Date getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    
    private String name;
    private double salary;
    private Date hireDay;
}