package com.stackroute.domain;

public class Actor {

    private String name;
    private String gender;
    private int age;
    public void studentInfo() {
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Gender is : "+gender);
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
}
