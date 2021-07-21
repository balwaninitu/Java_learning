package com.nitu.learningfilereader;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

    // ArrayList collection framework
    ArrayList words = new ArrayList();
    words.add("Hello");
    words.add("there");
    words.add(10);
        words.add(9);
    words.add(12.00);
    words.add('H');
   // words.remove(0);

   //String item1 = (String) words.get(0)
        //Object item1 = words.get(0);
   // Object item2 = words.get(1);
    int item1 = (int) words.get(2);
        int item2 = (int) words.get(3);
        System.out.println(item1 + item2);


    }

}


