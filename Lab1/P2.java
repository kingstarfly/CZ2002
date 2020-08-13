import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get salary
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();


        // get merit points
        System.out.print("Enter your merit points: ");
        int mp = sc.nextInt();

        char grade = 'C';

        // general cases
        if ( salary >= 700 && salary <= 899) {
            grade = 'A';
        }

        if ( salary >= 600 && salary <= 799) {
            grade = 'B';
        }

        if ( salary >= 500 && salary <= 649) {
            grade = 'C';
        }
        
        // specific cases
        if ( salary > 600 && salary < 649) {
            if (mp < 10) {
                grade = 'C';
            } else {
                grade = 'B';
            }
        }

        if ( salary > 700 && salary < 799 ){
            if (mp < 20) {
                grade = 'B';
            } else {
                grade = 'A';
            }
        }

        


        // display grade
        System.out.printf("Your grade is: %c", grade);
        sc.close();
    }
}