package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private int ID ;
    private String name ;
    private int experience ;
    private int age;

    private int salary;
    public Employee ( int ID, String name, int age ) {
        this .ID = ID ;
        this . name = name ;
        this . age = age ;
    }
    public Employee ( String name ) {
         this . name = name ;
         }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ID + "," + name + "," + experience + "," +age + "," + salary);
        return sb.toString();
    }

    public void setID (int newID ) {
        this . ID = (int ) ( Math . random () * newID ) ;
    }
    public void setSalary (int salary ) {
        this . salary = salary ;
    }
    public void setAge (int age) {
        this . age = age ;
    }

    public void setExperience ( Date joining ) {
        Calendar calendar = Calendar . getInstance ( Locale . US ) ;
        calendar . setTime ( joining ) ;
        LocalDateTime now = LocalDateTime . now () ;
        int years = now . getYear () - calendar . get ( Calendar . YEAR ) ;
        this . experience = years ;
    }
    public void setExperience ( int year ) {
        this.experience = year;
    }

    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    }


