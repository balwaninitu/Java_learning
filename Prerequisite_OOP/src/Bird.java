public class Bird {
    String name;
    String gender;
    int age;
    double weight;


    public Bird(String name, String gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public void fly(){
        System.out.println("I am flying...");
    }
}
