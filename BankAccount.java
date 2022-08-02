package practice;

public class BankAccount {

  protected double clientAccount = 0.0;

  public double getAmount() {
    return clientAccount;
  }

  public void put(double amountToPut) {
    if(amountToPut > -1) clientAccount += amountToPut;
  }

  public void take(double amountToTake) {
    if (amountToTake <= clientAccount) clientAccount -= amountToTake;
    }
}
