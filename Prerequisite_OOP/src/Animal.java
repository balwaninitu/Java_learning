public class Animal {
    String name;
    String gender;
    int age;
    double weight;

//constructor method
    public Animal(String name, String gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public void description(){

        System.out.println("This is " +name);
        System.out.println("Its gender is  " +gender);
        System.out.println("Its age is " +age);
        System.out.println("Its weight is " +weight);
    }

    public void eat(){
        System.out.println("I am eating...");
    }

    public String sound(String argument){
        String str = "Its sound is ";
        return str + argument;

    }




}