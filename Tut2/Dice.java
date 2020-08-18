public class Dice {
    private int valueOfDice;

    public Dice(int value){
        this.valueOfDice = value;
    };

    public void setDiceValue(int val) {
        this.valueOfDice = val;
    }

    public int getDiceValue() {
        return this.valueOfDice;
    }

    public void printDiceValue() {
        System.out.printf("Current value is %d\n", this.getDiceValue());
    }
    
}