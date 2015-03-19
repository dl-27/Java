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
public class EmployeeTestStatic {
    public static void main (String[] args){
        EmployeeSt[] staff = new EmployeeSt[3];
        staff[0] = new EmployeeSt("name1", 10000);
        staff[1] = new EmployeeSt("name2", 20000);
        staff[2] = new EmployeeSt("name3", 30000);
        
        for (EmployeeSt e : staff){
            e.setId();
            System.out.println(e.getName()+"  "+e.getSalary()+"  "+e.getId());
        }
        int n = EmployeeSt.getNextId();
        System.out.println("Next id: "+n);
    }
    
}

class EmployeeSt{
    public EmployeeSt (String n, double s){
        name = n; salary = s; 
        id = 0;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }    
    public int getId(){
        return id;
    }
    public void setId(){
        id = nextId;
        nextId++;
    }
    public static int getNextId(){
        return nextId;
    }
    private String name;
    private double salary;
    private int id;
    private static int nextId = 1;
}