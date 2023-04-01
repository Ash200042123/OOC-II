package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeDB {
    List<Employee> emp= new ArrayList<>();
    public void save(Employee employee) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("myfile.txt", true);
            fw.write(employee.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // this code will give error if there is no file
//    public void anotherSave() {
//        try {
//            Files.write(Paths.get(" myfile.txt "), " the text ".getBytes(),
//                    StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = null;


        try {
            Scanner sc = new Scanner(new File("myfile.txt"));

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                String[] data = line.split(",");

                Integer ID = Integer.parseInt(data[0]);
                String name = data[1];
                Integer experience = Integer.parseInt(data[2]);
                Integer age = Integer.parseInt(data[3]);
                Integer salary = Integer.parseInt(data[4]);

                employee = new Employee(name);
                employee.setID(ID);
                employee.setAge(age);
                employee.setExperience(experience);
                employee.setSalary(salary);
                employees.add(employee);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return employees;

    }

    //Pure function
    public void addEmployee ( Employee employee ) {
         emp.add ( employee ) ;
         }

         //Pure function because output doesnt change for same input
    public List < Employee > add( List < Employee > employees , Employee employee ) {
         employees . add ( employee ) ;
         return employees ;
         }
    public List<Employee> ageFilter(int age){
        return getEmployees().stream().filter(employee -> employee.getAge() ==age).collect(Collectors.toList());
    }

    public List < Employee > employeeWithHighSalaries ( double salary ) {
        return getEmployees().stream(). filter ( e -> e.getSalary()> salary ). collect ( Collectors . toList () ) ;
        }
}
