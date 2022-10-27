package org.jayanta.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapStructure {
    public static void main(String[] args){
        Map<Integer, People> map =new HashMap<>();
        map.put(1, new People("jayanta"));
        map.put(3, new People("lahkar"));

        //if key are same and value are different the latest entry will override the valye
        map.put(10, new People("jorhat"));
        map.put(10, new People("jorhat1"));

        map.put(5, new People("golaghat"));
        System.out.println(map);

        System.out.println("size of the map");
        System.out.println(map.size());
        System.out.println("get particular value using key");
        System.out.println(map.get(1));
        System.out.println("checking if a key is present");
        System.out.println(map.containsKey(444));
        System.out.println("get all value se");
        System.out.println(map.entrySet());
        System.out.println("get all key sets");
        System.out.println(map.keySet());

//        System.out.println("get all key value pair");
//        map.entrySet().forEach(x-> System.out.println(x.getValue() +" " + x.getKey()));
//
        map.forEach((key, person) ->{
            System.out.println(key + " - " + person);
        });
    }

    public static record People(String name){}

}

/*
Map is a key value pair
a map cannot contain duplicate key
each key map to at most one value
if key is same and value is same it doesn't affect anything
if key is same and value is different the value the latest inserted key value will override

map.put(1, "jayanta")
hash function take the key in this case it is 1 and produces the hashcode, and it stores the value with that unique hashcode

 */