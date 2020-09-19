/**
 * q1
 */
public class q1 {

    public static void main(String[] args) {
        int waitTime = 46;

        try {
            System.out.println("Try block entered");
            if (waitTime > 30) {
                throw new Exception("Time Limit Exceeded");
            }
            System.out.println("Leaving try block");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("After catch block");
    }
}