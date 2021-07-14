public class Zoo {


    public static void main(String[] args) {

        Flyable flyingBird = new Sparrow("pinu", "f", 4,2);
        flyingBird.fly();

        Animal sparrow1 = new Sparrow("Chinu", "f", 2, 6);
        //sparrow1.move();

        Animal fish1 = new Fish("Dory", "f", 7,3);
       // fish1.move();

        moveAnimal(fish1);
        moveAnimal(sparrow1);

    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}



