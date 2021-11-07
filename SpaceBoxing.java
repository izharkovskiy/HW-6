import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int planet;
        double weightFuture, weight;

        System.out.println("Please enter your current earth weight:");
        weight = keyboard.nextDouble();

        System.out.println(" ");
        System.out.println("I have information for the following planets:/n");

        System.out.println("1. Venus" + " " + " " + "2. Mars" + " " + " " + "3. Jupiter");
        System.out.println("4. Saturn" + " " + " " + "5. Uranus" + " " + " " + "6. Neptune");

        System.out.println("Which planet are you visiting?");
        planet = keyboard.nextInt();

        System.out.println();
        /*
         * if (planet == 1) { weightFuture = weight * 0.78;
         * System.out.println("Your weight would be" + " " + weightFuture + " " +
         * "pounds on that planet."); } if (planet == 2) { weightFuture = weight * 0.39;
         * System.out.println("Your weight would be" + " " + weightFuture + " " +
         * "pounds on that planet."); } if (planet == 3) { weightFuture = weight * 2.65;
         * System.out.println("Your weight would be" + " " + weightFuture + " " +
         * "pounds on that planet."); } if (planet == 4) { weightFuture = weight * 1.17;
         * System.out.println("Your weight would be" + " " + weightFuture + " " +
         * "pounds on that planet.");
         *
         * } if (planet == 5) { weightFuture = weight * 1.05;
         * System.out.println("Your weight would be" + " " + weightFuture + " " +
         * "pounds on that planet.");
         *
         * } if (planet == 6) { weightFuture = weight * 1.23;
         * System.out.println("Your weight would be" + " " + weightFuture + " " +
         * "pounds on that planet.");
         *
         * } else {
         *
         * System.out.println("Not a valid planet."); }
         */

        switch (planet) {
        case 1:
            weightFuture = weight * 0.78;
            System.out.println("Your weight would be" + " " + weightFuture + " " + "pounds on that planet.");
            break;
        case 2:
            weightFuture = weight * 0.39;
            System.out.println("Your weight would be" + " " + weightFuture + " " + "pounds on that planet.");
            break;
        case 3:
            weightFuture = weight * 2.65;
            System.out.println("Your weight would be" + " " + weightFuture + " " + "pounds on that planet.");
            break;
        case 4:
            weightFuture = weight * 1.17;
            System.out.println("Your weight would be" + " " + weightFuture + " " + "pounds on that planet.");
            break;
        case 5:
            weightFuture = weight * 1.05;
            System.out.println("Your weight would be" + " " + weightFuture + " " + "pounds on that planet.");
            break;
        case 6:
            weightFuture = weight * 1.23;
            System.out.println("Your weight would be" + " " + weightFuture + " " + "pounds on that planet.");
            break;

        }

        keyboard.close();

    }

}