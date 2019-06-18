package com.example.week2test.Animal;

public class Snake extends Animal {
    public Snake(){
        instance_number+=1;
    }
    @Override
    public int getInstance_number(){
        return instance_number;
    }
    private static int instance_number=0;






}
