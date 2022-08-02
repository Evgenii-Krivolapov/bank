package practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DepositAccount extends BankAccount {
    protected Calendar lastIncome = new GregorianCalendar();
    protected Calendar calendar = new GregorianCalendar();

    @Override
    public void put(double amountToPut) {
            lastIncome.add(Calendar.MONTH, +1);
            super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        if (calendar.after(lastIncome)) super.take(amountToTake);
    }
}
