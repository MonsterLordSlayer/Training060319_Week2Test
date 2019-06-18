package com.example.week2test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubString {
    static private Set<String> stringset=new HashSet<String>();
    public static void solving(String string){
        String sub;
        int i, c, length;
        if (string.isEmpty()) {

            return;
        }




        length = string.length();



        for (c = 0; c < length; c++)
        {
            for(i = 1; i <= length - c; i++)
            {
                sub = string.substring(c, c+i);
                char[] subarray = sub.toCharArray();
                stringset.add(String.valueOf(subarray));

                for (int j=0;j<subarray.length;j++){
                    StringBuilder str
                            = new StringBuilder();
                    for (int k=0;k<subarray.length;k++){

                        if (j==k){
                            continue;
                        }
                        str.append(subarray[k]);
                    }
                    solving(str.toString());

                }




            }
        }



    }
    public static void print(){
        for (String str:stringset){
            System.out.println(str);
        }
    }


    public static void main(String[] args)
    {
        solving("frog");
        print();
    }



}

