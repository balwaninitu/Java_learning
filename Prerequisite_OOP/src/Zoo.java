public class Zoo {


    public static void main(String[] args) {

        Animal sparrow1 = new Sparrow("Chinu", "f", 2, 6);
        sparrow1.move();

        Animal fish1 = new Fish("Dory", "f", 7,3);
        fish1.move();

        moveAnimals(fish1);
        moveAnimals(sparrow1);

    }

    public static void moveAnimals(Animal animal){
        animal.move();
    }
}



