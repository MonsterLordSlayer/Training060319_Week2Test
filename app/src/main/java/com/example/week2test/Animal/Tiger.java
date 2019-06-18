package com.example.week2test.Animal;

public class Tiger extends Animal {
    public Tiger(){
        instance_number+=1;
    }
    @Override
    public int getInstance_number(){
        return instance_number;
    }

    @Override
    public void eat(String food){
        if (food=="grain"){
            energy+=0;
        }
        else  {
            energy+=2;
        }
    }
    @Override
    public void sleep(){
        energy+=5;
    }
    private static int instance_number=0;





}
