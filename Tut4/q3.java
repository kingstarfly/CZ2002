public class q3 {
    public static void main(String[] args) {
        try {
            sampleMethod(0);
        } catch (Exception e) {
            System.out.println("Caught in main.");
        }
    }
    
    /**
     * NegativeNumberException
     */
    public static class NegativeNumberException extends Exception {
    
        public NegativeNumberException() {
            super("Negative Number Exception!");
        }

        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static void sampleMethod(int n) throws Exception {
        try {
            if (n > 0) throw new Exception();
            else if (n < 0) throw new NegativeNumberException();
            else System.out.println("No Exception");
            System.out.println("Still in sampleMethod func");
        } catch (NegativeNumberException e) {
            System.out.println("Caught in sampleMethod");
        } finally {
            System.out.println("In finally block");
        }
        System.out.println("After finally block");
    }
}
