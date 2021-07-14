public class Sparrow extends Bird implements Flyable{
    public Sparrow(String name, String gender, int age, double weight) {
        super(name, gender, age, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high...");

    }
}
