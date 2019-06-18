package com.example.week2test.Animal;

public abstract class Animal {
    protected int energy=0;
    protected String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    abstract public int getInstance_number();






    public int getEnergy(){
        return energy;
    }
    public void sound() {
        energy -= 3;
        if (energy <= 0) energy = 0;
    }
    public void eat(String food){
        energy+=5;
    }
    public void sleep(){
        energy+=10;
    }


}
