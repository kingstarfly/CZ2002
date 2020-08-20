import java.util.Scanner;

public class VendingMachine {
    // constructor
    public VendingMachine() {
        System.out.println("VendingMachine created");
    }

    // initialize drinks
    private static Drink beer = new Drink("Beer", 3);
    private static Drink coke = new Drink("Coke", 1);
    private static Drink greenTea = new Drink("Green Tea", 5);

    // Scanner
    Scanner sc = new Scanner(System.in);

    // get drink selection, return cost of drink
    public double selectDrink() {
        System.out.println("===== Vending Machine =====");
        System.out.printf("|1. Buy %s ($%.2f)       |\n", beer.getName(), beer.getCost());
        System.out.printf("|2. Buy %s ($%.2f)       |\n", coke.getName(), coke.getCost());
        System.out.printf("|3. Buy %s ($%.2f)  |\n", greenTea.getName(), greenTea.getCost());
        System.out.println("===========================");
        System.out.println("Please enter selection:");

        int opt;
        do {
            opt = sc.nextInt();
            if (opt == 1) return beer.getCost();
            else if (opt == 2) return coke.getCost();
            else if (opt == 3) return greenTea.getCost();
            else continue;
        } while (opt < 1 || opt > 3);

        return 1;
    }

    // insert coins and returns total amt inserted
    public double insertCoins(double drinkCost) {
        System.out.println("========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input    |");
        System.out.println("|Enter 'T' for twenty cents input |");
        System.out.println("|Enter 'F' for fifty cents input  |");
        System.out.println("|Enter 'N' for dollar cents input |");
        System.out.println("========== Coins Input ===========");
        System.out.println("============================");
        
        char opt2;
        double totalInserted = 0;

        while (totalInserted < drinkCost) {
            opt2 = sc.next().charAt(0);
            switch (opt2) {
                case 'Q':
                    totalInserted += 0.1;
                    break;
                case 'T':
                    totalInserted += 0.2;
                    break;
                case 'F':
                    totalInserted += 0.5;
                    break;
                case 'N':
                    totalInserted += 1.0;
                    break;
                default:
                    break;
            }
            System.out.printf("Current balance: $%.2f\n", totalInserted);
        }
        return totalInserted;
    }

    // check the change and printt the change on screen
    public void checkChange(double amount, double drinkCost) {
        double change = amount - drinkCost;
        System.out.printf("Change: $%.2f\n", change);
        printReceipt();
    }

    // print receipt and collect drink
    public void printReceipt() {
        System.out.println("Please collect your drink!");
        System.out.println("Thank you !!");
    }
}