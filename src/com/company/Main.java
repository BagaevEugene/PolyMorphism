package com.company;

public class Main {

    public static void main(String[] args) {

        Animals DogA = new Dogs();
        DogA.eat();

        DogA.setName("hkk");
        DogA.Speak();

        System.out.println(" Amount of legs : " + DogA.getAmountOfLegs());

        for (int i=0; i< 10; i++) {

            Animals thisCat = new Cats();

            thisCat.setName("Cat №" + i);
            thisCat.Speak();
         //   System.out.println(" Amount of cats : " + Animals.getAmountOfAnimals());

        }


        // write your code here
    }
}
