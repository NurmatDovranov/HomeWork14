package com.company;

public class Main {

    public static void main(String[] args) {
    Programmer programmer = new Programmer("Pasha", "IT specialist","InfoCom");
    System.out.println(programmer);
    programmer.coding();
    programmer.learn();
    programmer.eat();
    programmer.walk();
        System.out.println("\n");
    Dancer dancer = new Dancer("Damir", "Group instruktor", "BoysBand");
        System.out.println(dancer);
        dancer.dancing();
        dancer.eat();
        dancer.walk();
        dancer.learn();
        System.out.println("\n");
        Singer singer = new Singer("Sanjar","Vocalist","BackStreetBoys");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        singer.walk();
        singer.eat();
        singer.learn();
    }
}
