import java.util.Scanner;

public class CalculatorEx {
    private double result;
    
    public CalculatorEx() {
        System.out.println("Calculator is on");
    };

    public double resultValue() {
        return this.result;
    }
    
    public double evaluate(char op, double n1, double n2) throws UnknownOperatorException {
       
        switch (op) {
            case '+':
                return n1+n2;
            case '-':
                return n1-n2;
            case '*':
                return n1*n2;
            case '/':
                return n1/n2;
            default:
                throw new UnknownOperatorException(op);
        }
        
    }

    public double handleUnknownOpException() {
        System.out.println("Please re-enter! ");
        return 1.0;
    }

    public void showResult() {
        System.out.printf("updated result = %.1f\n", this.result);
    }
    
    public void doCalculation() {
        Scanner sc = new Scanner(System.in);
        char op = '+';
        double num;

        while (true) {
            op = sc.next().charAt(0);
            if (op == 'q' || op == 'Q') {
                this.showResult();
                System.out.println("End of Program");
                sc.close();
                return;
            }
            num = sc.nextDouble();
            try {
                this.result = evaluate(op, this.resultValue(), num);
                System.out.printf("result %c %.1f = %.1f\n", op, num, this.result);
                this.showResult();                

            } catch (UnknownOperatorException e) {
                System.out.println(e.getMessage());
                this.handleUnknownOpException();
                this.showResult();
                continue;
            }
        }
    }
    public static void main(String[] args) {
        CalculatorEx c1 = new CalculatorEx();
        System.out.println("result = 0.0");
        c1.doCalculation();        
    }
}
