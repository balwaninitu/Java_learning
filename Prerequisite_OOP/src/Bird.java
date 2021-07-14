public class Bird extends Animal {


    public Bird(String name, String gender, int age, double weight) {
        super(name, gender, age, weight);
    }

    public void fly(){
        System.out.println("I am flying...");
    }
}
