package com.company;

public class Programmer extends Person {
    private String companyName;


    Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println(getName()+" is coding new project");

    }
    public String toString (){
    return "Name: "+getName()+"\nCompany name is: "+companyName+"\nDesignation is: "+getDesignation();
    }

}