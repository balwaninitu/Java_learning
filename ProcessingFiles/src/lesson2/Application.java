package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>();
        //populate animals
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println(animals.get(i));
//        }

        /*another approach to use "For Each Loop" introduced in java5,
        first thing need its data type and then define variable, this variable is use to
        iterate over collection

         */
//        for (String value : animals) {
//            System.out.println(value);
//        }
        /**
         * LinkedList has removeFirst method
         * ArrayList doesnt have removeFirst method
         */

        //ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
       // LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
        List<Vehicle> vehicles = new LinkedList<Vehicle>();

        //two approach to initialize, first has variable as vehicle1
        Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 15000, false);

        //below approach has no variable
        vehicles.add(new Vehicle("Honda", "accord", 12000, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

       // for (Vehicle car : vehicles) {
//            System.out.println(car.getMake());
//            System.out.println(car.getModel());
//            System.out.println(car.getPrice());
       //     System.out.println(car);
      //  }
        printElements(vehicles);
        printElements(animals);


    }
//List is interface for array and linkedlist
    public static void printElements(List someList){
        for (int i = 0; i <someList.size(); i++){
            System.out.println(someList.get(i));

        }
    }
}
