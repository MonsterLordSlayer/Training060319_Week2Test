package com.example.week2test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static ArrayList<Integer> sort(ArrayList<Integer> list){
        ArrayList<Integer> result=list;
        Collections.sort(result);
        StringBuilder str=new StringBuilder();
        for(Integer i:result){
            str.append(i+" ");
        }
        System.out.println(str.toString());
        return result;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1,3, 1, 2));
        sort(ints);

    }
}
