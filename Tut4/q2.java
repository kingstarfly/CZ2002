public class q2 {

    public static void main(String[] args) {
        try {
            throw new PowerFailureException("test");
        } catch (PowerFailureException e) {
            System.out.println("Text: " + e.getMessage());
        }
    }

    /**
     * PowerFailureException
     */
    public static class PowerFailureException extends Exception {

        public PowerFailureException() {
            super("Power Failure!");
        };
        public PowerFailureException(String msg) {
            super(msg);
        };
        
    }
    
}
