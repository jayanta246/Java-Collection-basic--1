package org.jayanta.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructure {
    public static void main(String[] args){
        Queue<Person> people =new LinkedList<>();
        people.add(new Person("jayanta1", 23));
        people.add(new Person("jayanta2", 24));
        people.add(new Person("jayanta3", 25));
        System.out.println(people.peek());
        //remove element form queue
        people.remove();
        System.out.println(people );
    }

    public static record Person(String name, int age){

    }
}
/*
Queue follow FIFO
 */