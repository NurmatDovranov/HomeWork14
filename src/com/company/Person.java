package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println(name+" is learnig English");

    }
    public void walk (){
        System.out.println(name +" is walk 10km per day ");

    }
    public void eat(){
        System.out.println(name+" is eat 400kkal per day ");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
