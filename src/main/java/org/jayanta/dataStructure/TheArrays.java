package org.jayanta.dataStructure;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args){
        String[] colors = new String[5];
        colors[0] = "black";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));

        System.out.println("printing in reverse order");
        for(int i=colors.length-1 ; i>=0; i--){
            System.out.println(colors[i]);
        }

        System.out.println("printing array using enhance for loop");
        for(String color:colors){
            System.out.println(color);
        }

        System.out.println("Printing elements using java streams");
        Arrays.stream(colors).forEach(System.out::println);
    }
}
