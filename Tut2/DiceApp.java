import java.util.Random;
import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randInt;
        String inp;
        
        System.out.println("Press <enter> to roll the first die");
        sc.nextLine();
        Dice d1 = new Dice();
        randInt = rand.nextInt(6) + 1;
        d1.setDiceValue(randInt);

        d1.printDiceValue();

        System.out.println("Press <enter> to roll the second die");
        sc.nextLine();
        Dice d2 = new Dice();
        randInt = rand.nextInt(6) + 1;
        d2.setDiceValue(randInt);

        d2.printDiceValue();

        System.out.printf("Your total number is: %d", d1.getDiceValue()+d2.getDiceValue());

        sc.close();

    }
}