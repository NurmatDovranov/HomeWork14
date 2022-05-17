package com.company;

public class Singer extends Person {
    private String bandName;

    Singer(String name, String designation, String bandName){
        super(name, designation);
        this.bandName = bandName;

    }

    public void singing() {
        System.out.println(getName()+" is singing rap");

    }

    public void playGitar() {
        System.out.println(getName()+" is playing electrogitar");

    }
    public String toString(){
        return "Name is "+getName()+"\nBand name is: "+bandName+"\nDesignation is: "+getDesignation();
    }
}
