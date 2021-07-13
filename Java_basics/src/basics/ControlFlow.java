package basics;

public class ControlFlow {

    public static void main(String[] args) {

        boolean hungry = true;

        if (hungry) {
            System.out.println("I am starving..");
        } else {
            System.out.println("I am not Hungry");
        }


        int hungerRating = 5;
        if (!(hungerRating < 6)) {
            System.out.println("Not Hungry");

        } else {
            System.out.println("I'm starving..");
        }

        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if (favoriteTemp == currentTemp) {
            if (currentTemp < favoriteTemp - 30) {
                opinion = "Its pretty darn cold ...";
            } else if (currentTemp < favoriteTemp - 20) {
                opinion = "Its cold";
            } else if (currentTemp > favoriteTemp + 10) {
                opinion = "Its hot out";
            } else {
                opinion = "its a beautiful day";
            }

        } else {
            opinion = "unknown temp";
        }
        System.out.println(opinion);


    }

    }



