package lesson2;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();
        //populate animals
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

        /*another approach to use "For Each Loop" introduced in java5,
        first thing need its data type and then define variable, this variable is use to
        iterate over collection

         */
        for (String value : animals) {
            System.out.println(value);
        }


    }
}
