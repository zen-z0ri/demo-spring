package com.example.demospring.guava;

import static java.lang.System.out;

public class DemoTest {

    public static void main(String[] args){
        Student student = new Student();
        student.setName("tom");
        student.setAge(30);
        DemoTest demoTest = new DemoTest();
        demoTest.validateAge(student);
        out.println(demoTest.validateAge(student));
        out.println(demoTest.validateAge(student));
        out.println(demoTest.validateAge(student));
        out.println(demoTest.validateAge(student));

    }

    public  boolean validateAge(Student student){
        if(student.getAge() > 20){
            student.setAge(student.getAge() - 3);
            return false;
        }
        return true;
    }
}



class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}