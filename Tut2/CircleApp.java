import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {

        // default radius of 0
        Circle c1 = new Circle(0);

        System.out.println("==== Circle Computation ====");
        System.out.println("|1. Create a new circle    |");
        System.out.println("|2. Print Area             |");
        System.out.println("|3. Print Circumference    |");
        System.out.println("|4. Quit                   |");

        Scanner sc = new Scanner(System.in);

        int opt;

        do {
            System.out.println("Choose option (1-3): ");
            opt = sc.nextInt();
            if (opt == 1) {
                System.out.println("Enter the radius to compute the area and the circumference");

                double rad = sc.nextDouble();

                c1 = new Circle(rad);
                
                System.out.println("A new circle is created");
            }

            else if (opt == 2) {
                c1.printArea();
            }

            else if (opt == 3) {
                c1.printCircumference();
            }

            else if (opt == 4) {
                System.out.println("Thank you!!");
                return;
            }

            else continue;

        } while (opt >= 1 && opt <= 4 );

        sc.close();
    }
}