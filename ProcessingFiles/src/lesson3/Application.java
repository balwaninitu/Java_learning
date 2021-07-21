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

        for (String strs : str){
            System.out.println(strs);
        }

        HashSet<Animal> animals = new HashSet<Animal>();

        Animal animal1 = new Animal("Dog", 12);
        Animal animal2 = new Animal("Cat", 10);
        Animal animal3 = new Animal("Bird", 9);
        Animal animal4 = new Animal("Dog", 12);
        Animal animal5 = new Animal("Bear", 7);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        System.out.println(animal1.equals(animal4));

        System.out.println(animal1.hashCode());
        System.out.println(animal4.hashCode());


        for (Animal animal : animals){
            System.out.println(animal);
        }







    }
}
