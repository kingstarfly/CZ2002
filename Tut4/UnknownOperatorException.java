public class UnknownOperatorException extends Exception {
    public UnknownOperatorException(){};
    public UnknownOperatorException(char op){
        super(String.format("%c is an unknown operator", op));
    };
    public UnknownOperatorException(String message){
        super(message);
    };
}
