// Write a program that creates an object of a person. User can state how many people to create
//
// Use the object to create multiple persons with the following attributes based on the user's input
// - Name
// -Age
// - Hair color
// add a method in a separate class called Average and put in a method
// to collate the average of people based on the number of people entered.
// Main, Average, Person

import java.util.Scanner;

public class Person {

    private String NAME;
    private String HAIRCOLOR;
    public double AGE;
    public int numberOfPpl;


    public Person (String name, double age, String hairColor) {
        this.NAME = name;
        this.HAIRCOLOR = hairColor;
        this.AGE = age;
    }

    public void setNAME (String name) {
        this.NAME = name;
    }

    public void setAGE (double age) {
        this.AGE = age;
    }

    public void setHAIRCOLOR (String haircolor) {
        this.HAIRCOLOR = haircolor;
    }



}
