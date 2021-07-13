package basics;

public class LearningArrays {

    public static void main(String[] args) {
        int []values = new int[5];
        values [0]= 8;
        System.out.println(values[0]);


        //double accepts float and whole number
        double []nums = new double[100];
        nums[0]=78.90;
        nums[2]=23;
        nums[3]=12.1;


        System.out.println(values[1]);
        //System.out.println(values[99]);
        //System.out.println(values[100]);

        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        String []words = new String[] {"My", "name", "is"};

        System.out.println(words[2]);
        System.out.println(words[0]);

        //once new array created then there will be no old values available to it
        words = new String[10];

        System.out.println(words[0]);


    }
}
