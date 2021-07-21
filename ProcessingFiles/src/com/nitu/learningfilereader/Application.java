package com.nitu.learningfilereader;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {

        // ArrayList collection framework
        /*string in angle brackets is type of generic collection, it
        is called parameterization and is introduced java5 onwards,

         */
        ArrayList<String> words = new ArrayList();
        words.add("Hello");
        words.add("there");

        // words.remove(0);

        //String item1 = (String) words.get(0)
        //Object item1 = words.get(0);
        // Object item2 = words.get(1);
        // int item1 = (int) words.get(2);
        String item1 = words.get(0);
        System.out.println(item1);

        /*
        In Linked list primitive data can not assign within angle bracket
        only data type of class can add or complex data type so instead of int can add
        wrapper classes Integer, doubles, floats, wrapper class provide the mechanism to convert primitive into object and object
        into primitive
         */
        // LinkedList <int>
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(10);
        numbers.add(34);
        numbers.add(100);
        numbers.remove(2);
        //empty bracket will remove first element
        //numbers.remove();
       numbers.removeFirst();
        for (int number : numbers) {
            System.out.println(number);

        }

    }

}


