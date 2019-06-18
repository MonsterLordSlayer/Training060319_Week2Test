package com.example.week2test;

import com.example.week2test.Animal.Animal;
import com.example.week2test.Animal.Monkey;
import com.example.week2test.Animal.Snake;
import com.example.week2test.Animal.Tiger;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jungle {
    private ArrayList<Animal> animals=new ArrayList<>();
    public void addanimal(Animal animal){
        animals.add(animal);

    }
    public void report_number(){
        for (Animal animal:animals){
            System.out.println((animal.getName())+": there are "+animal.getInstance_number()+" of my kind including me");

        }
    }
    public void feeding_all(){
        for (Animal animal:animals){
            animal.eat("meat");
        }
    }
    public void feeding_allgrain(){
        for (Animal animal:animals){
            animal.eat("grain");
        }
    }
    public void playformonkeys(){
        for (Animal animal:animals){
            if (animal.getClass()==Monkey.class){
                System.out.println(animal.getName()+" play");
                ((Monkey)animal).play();
            }
        }
    }

    public void soundoff(){
        for (Animal animal:animals){
            animal.sound();
            System.out.println(animal.getName()+"have "+animal.getEnergy());
        }
    }
    public static void main(String[] args){
        Animal tiger1=new Tiger();
        tiger1.setName("kitty boi1");


        Animal snake1=new Snake();
        snake1.setName("long boi1");
        Animal snake2=new Snake();
        snake2.setName("long boi2");


        Animal monkey1= new Monkey();
        monkey1.setName("handy boi1");
        Animal monkey2= new Monkey();
        monkey2.setName("handy boi2");



        Jungle jungle=new Jungle();
        jungle.addanimal(tiger1);
        jungle.addanimal(snake1);
        jungle.addanimal(snake2);
        jungle.addanimal(monkey1);
        jungle.addanimal(monkey2);
        jungle.report_number();
        jungle.feeding_all();
        jungle.feeding_all();
        jungle.feeding_all();
        jungle.feeding_all();
        jungle.soundoff();


        jungle.feeding_allgrain();
        jungle.feeding_allgrain();
        jungle.feeding_allgrain();

        jungle.soundoff();

        jungle.playformonkeys();

        jungle.feeding_allgrain();
        jungle.feeding_allgrain();
        jungle.feeding_allgrain();
        jungle.feeding_allgrain();

        jungle.playformonkeys();


    }
}
