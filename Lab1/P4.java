import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        System.out.println("Please enter a height: ");
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        sc.close();

        if (height == 0 ){
            System.out.println("Error input");
            return;
        }
        System.out.println();
        for (int i=1; i<=height; i++) {
            makeLine(i);
        }
        
    }

    public static void makeLine(int height) {

        String setA = "AA";
        String setB = "BB";

        while (height > 0) {
            if (height % 2 != 0) {
                System.out.print(setA);
            } else {
                System.out.print(setB);
            }
            height--;
        }
        System.out.println();
    }
}