public class Earth {

    public static void main(String[] args) {

        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();

        human1.speak();
        human2.speak();
        human3.speak();

//created variable of type human
        //tom is instance variable
        Human tom;

//assign variable to new human object
        //call human type constructor
        //tom is object
        //tom is variable and object is created when application run
        //tom is also refer to reference variable
        //object get created here
        tom = new Human();

        //assign values to the class fields
        tom.age = 5;
        tom.eyeColor = "hazel";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabooo";

        tom.speak();

        //create another object
//        Human joe;
//        joe = new Human();

        Human joe = new Human();

        joe.name = "Joe Tan";
        joe.heightInInches = 67;
        joe.eyeColor = "brown";
        joe.age = 12;

        joe.speak();
    }


}
