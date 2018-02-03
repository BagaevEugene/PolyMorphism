package com.company;

import java.util.LinkedList;




public  abstract class Animals {

    private static int AmountOfAnimals = 0;

    public String Name;

    public void setName(String Soname) {
        Name = Soname;
    }



   public void eat(){

    System.out.println("Eating...");
   };

   public void Speak(){
        System.out.println("RRR...");
    };


    public String getAmountOfLegs(){

        LinkedList<String> Nlegs = new LinkedList<String>();
        Nlegs.add("four");


        return Nlegs.get(0);
    };


    public Animals() {

    AmountOfAnimals++;

        System.out.println(" Total animals : " + Animals.getAmountOfAnimals());


    }


    public static int getAmountOfAnimals(){


        return AmountOfAnimals;
    };


}
