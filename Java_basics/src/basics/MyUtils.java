package basics;

public class MyUtils {

    public static void printSomeStuff(String argument){
        System.out.println("Gibberish bla bla " + argument);
    }
    public static void printSomeStuff(int argument){
        System.out.println("Integer parsed in " + argument);
    }

    public static void sumTwoNumbers(int firstNum, int secondNum){
        System.out.println(firstNum+secondNum);
    }

    public static int add10(int someNum){
       int result = someNum + 10;
       return result;

    }
}
