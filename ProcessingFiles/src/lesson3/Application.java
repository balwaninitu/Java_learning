package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

    public static void main(String[] args) {
        /*set is used to prevent duplicates, if there is duplicate value
        it will going to print only once if it get changed to arrayList all
        duplicates will get printed. Set is unordered, ordered can be maintaine
        by LinkedHasSet
         */
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(12);
        values.add(22);
        values.add(43);
        values.add(67);
        values.add(12);

        for(Integer value : values){
            System.out.println(value);
        }

        LinkedHashSet<String> str = new LinkedHashSet<String>();
        str.add("Hi");
        str.add("Hola");
        str.add("Bonjour");
        str.add("Hola");
        str.add("Hello");
        str.add("Namaste");
        str.add("Namaste");
        System.out.println(str);


    }
}
