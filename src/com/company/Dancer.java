package com.company;

public class Dancer extends Person{
    private String groupName;

    Dancer(String name, String designation, String groupName){
        super(name, designation);
        this.groupName = groupName;

    }
     public void dancing(){
         System.out.println(getName()+" is dancing kara jorgo");

     }
     public String toString(){
        return "Name is: "+getName()+"\nGroup name is: "+groupName+"\nDesignation is: "+getDesignation();
     }

}
