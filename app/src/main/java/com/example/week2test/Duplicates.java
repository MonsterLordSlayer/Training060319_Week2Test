package com.example.week2test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Duplicates {

    public static Map<Character, ArrayList<Location>> duplicate(char[][] char_board){
        Map<Character, ArrayList<Location>> mapofloaction=new HashMap<>();
        for(int i=0;i<char_board.length;i++){
            for(int j=0;j<char_board[i].length;j++){
                if (mapofloaction.containsKey(char_board[i][j])==false){
                    ArrayList<Location> tempLocations=new ArrayList<>();
                    tempLocations.add(new Location(i,j));
                    mapofloaction.put(char_board[i][j],tempLocations);
                }
                else{
                    ArrayList<Location> tempLocations=mapofloaction.get(char_board[i][j]);
                    tempLocations.add(new Location(i,j));
                    mapofloaction.put(char_board[i][j],tempLocations);
                }
            }
        }
        return mapofloaction;
    }
    public static void main(String[] args)
    {
        char[][] testboard={{'a','b','c'},{'a','b','c'},{'a','b','d'}};
        Map<Character, ArrayList<Location>> mapofloaction=duplicate(testboard);
        ArrayList<Location> final_list_location=new ArrayList<>();
        for (char k:mapofloaction.keySet()){

            if ((mapofloaction.get(k).size()>1)){
                for(Location l:mapofloaction.get(k)){
                    final_list_location.add(l);
                }
            }

        }
        Collections.sort(final_list_location);
        StringBuilder str=new StringBuilder();
        for(Location l:final_list_location){
            str.append(l.toString()+"|");
        }
        if (str.length()>1){
            str.delete(str.length()-1,str.length());
        }
        System.out.println(str.toString());







    }


}

class Location implements Comparable{
    public Location(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x+","+y;
    }



    public int x;
    public int y;

    @Override
    public int compareTo(Object o) {
        if (this.getX()>((Location)o).getX()){
            return 1;
        }
        else if (this.getX()<((Location)o).getX()){
            return -1;
        }
        else if (this.getX()==((Location)o).getX()){
            if (this.getY()>((Location)o).getY()){
                return 1;
            }
            else if (this.getY()<((Location)o).getY())
                return -1;

        }
        return 0;
    }
}
