package com.company;

import com.company.Animals;

import java.util.ArrayList;
import java.util.LinkedList;

public class Dogs extends Animals {

    public String Name;

    public void setName(String Soname) {
        Name = Soname;
    }

/*
public String getName() {
return Name;
}
*/


    public void Speak(){

        System.out.println("bark..."+ "My name is " + this.Name);
    };


    public String getAmountOfLegs(){

        LinkedList <String> Nlegs = new LinkedList<String>();
        Nlegs.add("four");
        Nlegs.add("three");


        return Nlegs.get(1);
    };



}
