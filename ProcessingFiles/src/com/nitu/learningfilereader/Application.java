package com.nitu.learningfilereader;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        // ArrayList collection framework
        /*string in angle brackets is type of generic collection, it
        is called parameterization and is introduced java5 onwards
         */
        ArrayList <String> words = new ArrayList();
        words.add("Hello");
        words.add("there");

        // words.remove(0);

        //String item1 = (String) words.get(0)
        //Object item1 = words.get(0);
        // Object item2 = words.get(1);
       // int item1 = (int) words.get(2);
        String item1 =  words.get(0);
        System.out.println(item1);


    }

}


