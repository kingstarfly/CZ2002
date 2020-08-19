import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("starting: ");
        int starting = sc.nextInt();
        System.out.print("ending: ");
        int ending = sc.nextInt();
        System.out.print("increment: ");
        int increment = sc.nextInt();

        if (ending <= starting) {
            System.out.println("Error input!");
            sc.close();
            return;
        }
        String header = "US$    S$\n------------";

        System.out.println("\nFOR LOOP");
        System.out.println(header);
        // for loop        
        for (int i=starting; i<=ending; i+=increment) {
            System.out.format("%-7d%-7.2f\n", i, i*1.82);
        }

        // while loop
        System.out.println("\nWHILE LOOP");
        System.out.println(header);
        int value = starting;
        while (value <= ending) {
            System.out.format("%-7d%-7.2f\n", value, value*1.82);
            value += increment;
        }   

        // do-while loop
        System.out.println("\nDO-WHILE LOOP");
        System.out.println(header);
        int us = starting;
        do {
            System.out.format("%-7d%-7.2f\n", us, us*1.82);
            us+=increment;
        } while (us <= ending);

        sc.close();
    }
}