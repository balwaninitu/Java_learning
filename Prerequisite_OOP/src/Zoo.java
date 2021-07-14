public class Zoo {


    public static void main(String[] args) {
//objects are runtime concept, they dont exist untill application runs
        //animal1 is instance variable which has memory address for object which get created based

        Animal animal1 = new Animal("Dog", "F", 11, 12.76);
        Animal animal2 = new Animal("Cat", "M", 4, 4.5);
        Animal animal3 = new Animal("Cow", "F", 10, 80.35);


        animal1.description();
        System.out.println(animal1.sound("BowBow"));

        animal2.description();
        System.out.println(animal1.sound("Meow"));

        animal3.description();
        System.out.println(animal1.sound("Moo"));


        Bird bird1 = new Bird("Cukku", "F", 2,1.5);
        bird1.fly();
        bird1.description();

        Fish fish1 = new Fish("Dory", "M", 3,6.7);
        fish1.eat();
        fish1.swim();

        Chicken chicken1 = new Chicken("chick", "m", 2,34);
        chicken1.fly();


    }
}



