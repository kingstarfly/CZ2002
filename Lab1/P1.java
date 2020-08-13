import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.println("Enter a choice (A, B, C or D)");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);

        // convert choice to lowercase
        choice = Character.toLowerCase(choice);

        switch (choice) {
            case 'a':
                System.out.println("Action movie fan");
                break;
            case 'c':
                System.out.println("Comedy movie fan");
                break;
            case 'd':
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");;
        }

        sc.close();

   } 
}