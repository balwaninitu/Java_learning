public class Zoo {


    public static void main(String[] args) {

        Animal animal1 = new Animal("Dog", "F", 11, 12.76);
        Animal animal2 = new Animal("Cat", "M", 4, 4.5);
        Animal animal3 = new Animal("Cow", "F", 10, 80.35);


        animal1.description();
        System.out.println(animal1.sound("BowBow"));

        animal2.description();
        System.out.println(animal1.sound("Meow"));

        animal3.description();
        System.out.println(animal1.sound("Moo"));


        Bird bird1 = new Bird("Humming", "F", 2,2);
        Bird bird2 = new Bird("Cukkoo", "M", 4,2);
        bird1.fly();

        Fish fish1 = new Fish("Dory","f", 4,7.8);
        fish1.swim();



    }
}



