public class Concepts {

    /*In stack there will be one space assign to main method
    and local variable in the main method will get some space within that area
    main method will be at the bottom of stack
     */
    public static void main(String[] args) {
        int age;
        age = 12;

        /*car is local reference variable in main method whose memory will also
        reserve in frame of main method, this variable is pointing to actual object
        object car which get generated will be in heap memory area so myCar variable in stack memory will point to the
        object created in the heap memory. myCar variable is memory address of object available
        in the heap memory
         */
        Car myCar;
//object get created here
        myCar = new Car();

        /*when again variable create object then this time newCar variable will
        point to new object which get created in the heap memory here first object will
        lost the connection because variable now refering to new object which get created in the heap
        memory, here comes the role of garbage collection which looks for object who doest have any variable
        and delete them from the heap memory
         */
        myCar = new Car();

        //object and instance are same terminology can use interchangeably
        Car my2Car = new Car();
        my2Car.hp = 120;

        //another object get created in the heap
        Car my3Car = new Car();
        my3Car.hp = 1200;

      //  Engine bigEngine = new Engine;


        //my3Car.myEngine = bigEngine;

    }

    /*doWork method will have another space in the memory stack
    and local variable in this method will have some space within that area
    below method will be on the top of main method, interpreter go one by one
    over main method and once method given there done will get remove from the stack
    after main got over whole stack will get clear and memory will be available for
    another programme to run
     */
    public void doWork() {
        double weight = 20.30;

        /*inside method doWork method there can be more method like below
        and this method will be on the top of above method in the stack and
        local variables will have special reservation there
         */
       // public void doMoreWork();


    }
}
