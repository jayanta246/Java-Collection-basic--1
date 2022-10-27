package org.jayanta.dataStructure;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDataStructure {
    public static void main(String[] args){

        LinkedList<People> linkedList = new LinkedList<>();
        linkedList.add(new People("jayanta1", 10));
        linkedList.add(new People("jayanta2", 20));
        linkedList.add(new People("jayanta3", 30));
        ListIterator<People>peopleListIterator = linkedList.listIterator();
        while (peopleListIterator.hasNext()){
            System.out.println(peopleListIterator.next());
        }
        System.out.println();
        while (peopleListIterator.hasPrevious()){
            System.out.println(peopleListIterator.previous());
        }


    }

    public static record People(String name, int age){}
}
