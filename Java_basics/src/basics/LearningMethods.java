package basics;

public class LearningMethods {

    public static void main(String[] args) {
        System.out.println("heheh");
        printSomeStuff(55);

    }

    public static void printSomeStuff(String argument){
        System.out.println("Gibberish bla bla " + argument);
    }
    public static void printSomeStuff(int argument){
        System.out.println("Integer parsed in " + argument);
    }
}
