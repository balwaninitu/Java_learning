
public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    //constructor method has same name as class name
    //this method use to construct human object
    //constructor is intended to provide instruction how the object of the class constructed
    public Human(){

    }

    //methods
    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void work(){
        System.out.println("working...");
    }


}
