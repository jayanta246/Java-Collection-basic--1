package org.jayanta.dataStructure;

import java.util.ArrayList;
import java.util.List;

public class JavaList {
    public static void main(String[] args){
        List<String> colors = new ArrayList();
        colors.add("blue");
        colors.add("black");
        System.out.println(colors);

        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }
}

/*
List allow duplicate
list id not fixed it is dynamic
it is fast
lIst is an interface with lots of implementations
 */