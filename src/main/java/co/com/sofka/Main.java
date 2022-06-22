package co.com.sofka;

import co.com.sofka.values.Amount;
import co.com.sofka.values.Date;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(amountOf(1000), date("10/01/2021"));
        account.deposit(amountOf(2000), date("13/01/2021"));
        account.withdraw(amountOf(500), date("14/01/2021"));

        account.printStatements(System.out);
    }

    private static Date date(String date) {

        return Date.of(date);
    }

    private static Amount amountOf(int amount) {
        return Amount.of(amount);
    }
}
