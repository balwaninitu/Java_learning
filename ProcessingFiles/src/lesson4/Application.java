package lesson4;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(23);
        list1.add(74);
        list1.add(89);
        list1.add(56);
        list1.add(10);
        list1.add(10);
        list1.add(10);

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(10);
        newList.add(89);
        newList.add(12);

        // list1.addAll(newList);
        // list1.removeAll(newList);
        //list1.clear();
        //boolean  hasValue = list1.contains(1000);

       // boolean hasValue = list1.isEmpty();

        boolean  hasValue = list1.retainAll(newList);

        System.out.println(list1);
        System.out.println(hasValue);


    }
}
