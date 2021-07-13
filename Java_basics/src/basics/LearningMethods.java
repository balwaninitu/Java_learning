package basics;

import basics2.ExampleClass;

public class LearningMethods {

    public static void main(String[] args) {
        System.out.println("heheh");
        System.out.println(MyUtils.printSomeStuff("I am string"));
//       String str =  MyUtils.printSomeStuff(55);
//        System.out.println(str);
        MyUtils.printSomeStuff(55);
        MyUtils.sumTwoNumbers(5,7);
        int myVar = MyUtils.add10(99)+1000-50;
        System.out.println(myVar);

        ExampleClass.sayHello();




    }


}
