import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Press <key> to roll the first die");
        int first = sc.nextInt();
        Dice d1 = new Dice(first);
        d1.printDiceValue();

        System.out.println("Press <key> to roll the second die");
        int second = sc.nextInt();
        Dice d2 = new Dice(second);
        d2.printDiceValue();

        System.out.printf("Your total number is: %d", d1.getDiceValue()+d2.getDiceValue());

        sc.close();

    }
}