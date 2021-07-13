package basics;

public class MyUtils {

    public static String printSomeStuff(String argument){
        return argument;
        //System.out.println("Gibberish bla bla " + argument);
    }
    public static void printSomeStuff(int argument){
        System.out.println(argument);
    }

    public static void sumTwoNumbers(int firstNum, int secondNum){
        System.out.println(firstNum+secondNum);
    }

    public static int add10(int someNum){
       int result = someNum + 10;
       return result;

    }
}
