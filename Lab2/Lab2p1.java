import java.util.Random;
import java.util.Scanner;

public class Lab2p1 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.println(divide(4,7));
                    System.out.println(divide(7,7));
                    System.out.println(divide(25,7));

                    break;
                case 3:
                    System.out.println(modulus(4,7));
                    System.out.println(modulus(7,7));
                    System.out.println(modulus(25,7));
                    break;
                case 4:
                    System.out.println(countDigits(-12));
                    System.out.println(countDigits(123));
                    System.out.println(countDigits(121456));
                    break;
                case 5:
                    System.out.println(position(12345, 3));
                    System.out.println(position(123, 4));
                    System.out.println(position(12145, 1));
                    break;
                case 6:
                    System.out.println(extractOddDigits(12345));
                    System.out.println(extractOddDigits(54123));
                    System.out.println(extractOddDigits(246));
                    System.out.println(extractOddDigits(-12));
                    break;
                case 7:
                    System.out.println("Program terminating...");
            }
            
        } while (choice < 7);
        sc.close();
    }

    // other functions
    public static void mulTest() {
        final int NUM_OF_Q = 5;
        Random rn = new Random();
        int n1;
        int n2;
        int ans;
        int attempt;
        int nCorrect = 0;
        for (int i=0; i<NUM_OF_Q; i++) {
            n1 = rn.nextInt(9)+1;
            n2 = rn.nextInt(9)+1;
            ans = n1 * n2;
            System.out.printf("How much is %d times %d ? ", n1, n2);
            attempt = sc.nextInt();
            if (attempt == ans) {
                nCorrect++;
            }
            System.out.println();
        }
        System.out.println("------");
        System.out.printf("%d answers out of %d are correct\n\n", nCorrect, NUM_OF_Q);
    }

    public static int divide(int m, int n) {
        // m is defined to be always the larger number
        int quotient = 0;
        while (m >= n) {
            m = m - n;
            quotient++;
        }
        return quotient;
    }

    public static int modulus(int m, int n) {
        while (m >= n) {
            m = m - n;
        }
        return m;
    }

    public static int countDigits(int n) {
        if (n<=0) {
            System.out.println(n + " is not a positive integer");
            return -1;
        }
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;

    }

    public static int position(int num, int digit) {
        // start counting from right and start from count of 1
        int lastDigit;
        int pos = 1;
        do {
            lastDigit = num % 10;
            if (lastDigit == digit) return pos; 
            num = num / 10;
            pos++;
        } while (num != 0);

        return -1;
    }

    public static long extractOddDigits(long num) {
        if (num<=0) {
            System.out.println(num + " is not a positive integer");
            return -1;
        }
        long lastDigit;
        long factor = 1;
        long ans = 0;
        do {
            lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                ans += lastDigit * factor;
                factor *= 10;
            } 
            num = num / 10;
        } while (num != 0);

        return ans==0 ? -1 : ans;
    }
}