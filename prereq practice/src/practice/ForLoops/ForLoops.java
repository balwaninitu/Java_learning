package practice.ForLoops;

public class ForLoops {

    public static void main(String[] args) {

String name = "fsdgfdghdfhfghghghghdfgioi:";
        for (int i = name.length()-1 ; i >= 0; i--){
            System.out.println("char: "+ name.charAt(i));
        }
//print even numbers
        for (int i = 0; i <= 100; i+=2){
            System.out.println("i:"+i);
        }

        //debugging loop
        int counter = 0;
        for (int i= 0; i <= 100; i=i+1){
            System.out.println(i);
            int temp = counter +1;
            counter = temp;
        }
        int counter1 =0;
        for (int idx=0; idx<100; idx++){

            for (int j=0; j<10; j++){
                for (int i=0; i <100; i++)
                System.out.println("the value of idx was "+idx + "------" +j + "----"+i);
                counter1++;

            }

        }
        System.out.println("Counter1" + counter1);

    }

    }

