package org.example;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(123,"Ash",22);

        employee.setID(23);
        //employee.setExperience(4);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date date = formatter.parse("23-11-2018");
            employee.setExperience(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(employee);

        EmployeeDB empdb = new EmployeeDB();
        employee.setID(1);
        employee.setSalary(1000);
        employee.setAge(22);
        empdb.save(employee);
        List<Employee> e= empdb.getEmployees();


    }
}