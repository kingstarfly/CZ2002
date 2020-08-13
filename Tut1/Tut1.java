import java.util.Scanner;
import java.util.Arrays;

public class Tut1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Integer elements to be sorted: ");        
        int n = sc.nextInt();

        int[] array = new int[n];

        for ( int i=0; i<n ; i++) {
            
            System.out.printf("\nEnter Integer value for element with index number <%d> : ", i);
            array[i] = sc.nextInt();
            System.out.println();

        }
        bubblesort(array);

        System.out.println("\nSortind Completed.\nThe sorted array:");
        System.out.print(Arrays.toString(array));
        sc.close();
    
        
    };
    public static void bubblesort(int[] array) {
        for (int indOfLastUnsorted = array.length-1; indOfLastUnsorted >= 0; indOfLastUnsorted--) {
            for (int curInd = 0; curInd <= indOfLastUnsorted - 1; curInd++) {
                if (array[curInd] > array[curInd + 1]) {
                    swap(array, curInd, curInd+1);
                }
            }
        }

    };
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    };
}