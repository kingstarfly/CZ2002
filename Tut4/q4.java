import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator is on");
        c1.tellResult();
        char operator = '+';
        double num;

        while (operator != 'q' || operator != 'Q') {
            operator = sc.next().charAt(0);
            num = sc.nextDouble();
            try {
                switch (operator) {
                    case '+':
                        c1.add(num);
                        c1.tellResult();
                        break;
                    case '-':
                        c1.subtract(num);
                        c1.tellResult();
                        break;
                    case '*':
                        c1.multiply(num);
                        c1.tellResult();
                        break;
                    case '/':
                        c1.divide(num);
                        c1.tellResult();
                        break;
                    default:
                        throw new UnknownOperatorException();
                }
            } catch (UnknownOperatorException e){
                System.out.println(e.getMessage());
                continue;
            }
        }
        
    }

    public static class UnknownOperatorException extends Exception {
        public UnknownOperatorException() {
            super("Please re-enter your input...");
        }
    }

    private static class Calculator {
        private double result = 0.0;

        public void tellResult() {
            System.out.printf("result = %.1f\n\n", this.result);
        }

        public double add(double e) {
            return this.result += e;
        }

        public double subtract(double e) {
            return this.result -= e;
        }

        public double multiply(double e) {
            return this.result *= e;
        }

        public double divide(double e) {
            return this.result /= e;
        }
    }
}
