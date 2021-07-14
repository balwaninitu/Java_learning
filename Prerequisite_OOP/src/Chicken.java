public class Chicken extends Bird {

    public Chicken(String name, String gender, int age, double weight) {
        super(name, gender, age, weight);
    }

    //overriding the method defined in Bird
    // means replacing method which this class is inheriting
    public void fly(){
        System.out.println("Not able to fly...");
    }
}
