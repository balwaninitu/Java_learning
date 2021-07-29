package client;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

/*below is example of polymorphism, Object is grand daddy
of class and rest all other dataTypes are its child

 */
        Object myObject = new Object();
        String myVar = "Hello";
        myObject = myVar;
//
//        Employee emp = new Employee();
//        Accountant acc = new Accountant();
//        emp = acc;

        ArrayList<Object> employees = new ArrayList<Object>();
        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        //not allowed below
        //employees = accountants;

        //wild card((?, dataType can be any type in wild card), it is allowed
        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Accountant> accountants2 = new ArrayList<Accountant>();
        employees2 = accountants2;

        //provide flexibility in generics
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<Accountant>();
        employees3 = accountants3;



    }
}
