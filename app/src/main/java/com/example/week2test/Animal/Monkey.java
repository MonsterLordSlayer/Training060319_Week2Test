package com.example.week2test.Animal;

public class Monkey extends Animal {
    public Monkey(){
        instance_number+=1;
    }
    @Override
    public int getInstance_number(){
        return instance_number;
    }

    @Override
    public void eat(String food){
        energy+=2;
    }
    @Override
    public void sound(){
        energy-=4;
        if (energy <= 0) energy = 0;
    }

    public void play(){
        if (energy>=8){
            energy-=8;
            System.out.println("Oooo Oooo Oooo");
            sound();

        }
        else {
            System.out.println("Monkey is too tired ");
            sound();
        }
    }
    private static int instance_number=0;



}
