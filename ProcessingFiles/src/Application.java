import java.io.File;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        for (int i=0; i <=3; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter some text: ");
            String enteredText = input.nextLine();
            System.out.println(enteredText);
        }


    }
}
