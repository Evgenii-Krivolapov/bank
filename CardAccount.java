package practice;

public class CardAccount extends BankAccount {
    private double percent = 0.0;
    @Override
    public void take(double amountToTake) {
            percent += (1 * amountToTake) / 100;
            super.take(amountToTake+percent);
    }
}