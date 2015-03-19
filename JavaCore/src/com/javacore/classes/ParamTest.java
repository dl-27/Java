/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacore.classes;

/**
 *
 * @author Daria
 */
public class ParamTest {
    public static void main (String[] args){
        //1.methods can not change numbers
        System.out.println("tripleValue");
        double percent = 10;
        System.out.println("before: "+percent);
        tripleValue(percent);
        System.out.println("After: "+percent);
        
        //2.methods can change states of objects in param.
        System.out.println("tripleSalary");
        EmployeeP harry = new EmployeeP("Harry", 50000);
        tripleSalary(harry);
        System.out.println("After: "+harry.getSalary());
        
        //3.methods can not change objects by refferences in param.
        System.out.println("swap");
        EmployeeP a = new EmployeeP("name1", 70000);
        EmployeeP b = new EmployeeP("name2", 60000);
        swap(a, b);
        System.out.println("a After: "+a.getName());
        System.out.println("b After: "+b.getName());
    }
    public static void tripleValue(double x){
        x = 3*x;
        System.out.println("after: "+x);
    }
    public static void tripleSalary(EmployeeP e){
        e.raiseSalary(200);
        System.out.println("after: "+e.getSalary());
    }
    public static void swap(EmployeeP x, EmployeeP y){
        EmployeeP temp = x; x = y; y = temp;
        System.out.println("Emp1 after: "+x.getName());
        System.out.println("Emp2 after: "+y.getName());
    }
    
}
class EmployeeP {
    public EmployeeP (String n, double s){
        name = n;
        salary = s;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    
    private String name;
    private double salary;
}