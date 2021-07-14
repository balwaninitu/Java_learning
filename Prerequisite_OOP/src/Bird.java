public class Bird extends Animal {


    public Bird(String name, String gender, int age, double weight) {
        super(name, gender, age, weight);
    }

    @Override
    public void move() {
        System.out.println("The bird is flying");
    }

/*
Any class that that implements that interface it becomes compulsory for
that class to implements method that defined in the interface
 */


}
