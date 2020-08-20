public class VendingMachineApp {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();
        double drinkCost = vm1.selectDrink();
        double totalInserted = vm1.insertCoins(drinkCost);
        vm1.checkChange(totalInserted, drinkCost);
    }
}