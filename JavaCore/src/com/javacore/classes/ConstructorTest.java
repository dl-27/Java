/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacore.classes;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Daria
 */
public class ConstructorTest {
    public static void main (String[] args){
        EmployeeC[] staff = new EmployeeC[3];
        staff[0] = new EmployeeC("name1", 10000);
        staff[1] = new EmployeeC(20000);
        staff[2] = new EmployeeC();
        
        for (EmployeeC e : staff)
            System.out.println(e.getName()+"  "+e.getSalary()+"  "+e.getId());
    }
    
}

class EmployeeC{
    public EmployeeC (String n, double s){
        name = n; salary = s; 
    }
    public EmployeeC (double s){
        this("Id"+nextId, s);
    }
    public EmployeeC (){
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
    private static int nextId;
    private int id;
    private String name = "";
    private double salary;
    
    static{
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }
    {
        id = nextId;
        nextId++;
    }
}