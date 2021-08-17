package com.moses;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee>listEmployee = new Vector<>();

        listEmployee.add( new Employee( 100, "Moses","Alade"));
        listEmployee.add( new Employee( 101, "Toyin","Doe"));
        listEmployee.add( new Employee( 103, "Mary","Smith"));
        listEmployee.add( new Employee( 104, "Mike","Wilson"));


        listEmployee.forEach(employee ->  System.out.println(employee));
        System.out.println();
        System.out.println(listEmployee.get(0));
        System.out.println(listEmployee.isEmpty());
        System.out.println(listEmployee.size());
        listEmployee.set(1, new Employee(101, "James", "Adam"));
        listEmployee.forEach(employee -> System.out.println(employee));

        System.out.println(listEmployee.contains(new Employee(100, "Moses", "Alade")));
        System.out.println(listEmployee.indexOf(new Employee(100, "Moses", "Alade")));
    }
}
