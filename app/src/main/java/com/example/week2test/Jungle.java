package com.example.week2test;

import com.example.week2test.Animal.Animal;
import com.example.week2test.Animal.Monkey;
import com.example.week2test.Animal.Snake;
import com.example.week2test.Animal.Tiger;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jungle {
    ArrayList<Animal> animals=new ArrayList<>();
    public void addanimal(Animal animal){
        animals.add(animal);

    }
    public void report_number(){
        for (Animal animal:animals){
            System.out.println((animal.getClass()).toString()+": "+animal.getInstance_number());

        }
    }
    public static void main(String[] args){
        Animal tiger1=new Tiger();



        Animal snake1=new Snake();
        Animal snake2=new Snake();


        Animal monkey1= new Monkey();
        Animal monkey2= new Monkey();



        Jungle jungle=new Jungle();
        jungle.addanimal(tiger1);
        jungle.addanimal(snake1);
        jungle.addanimal(snake2);
        jungle.addanimal(monkey1);
        jungle.addanimal(monkey2);
        jungle.report_number();


    }
}
