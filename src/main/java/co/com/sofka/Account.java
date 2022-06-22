package co.com.sofka;


import co.com.sofka.values.Amount;
import co.com.sofka.values.Date;

import java.io.PrintStream;

public class Account {

    private  final Statement statement;

    public Account(Statement statement) {
        this.statement = statement;
    }

    void deposit(Amount amount, Date date) {

        statement.addTransaction(amount, date);
    }
    void withdraw(Amount amount, Date date){
        statement.substraction(amount, date );
    }
    void printStatements(PrintStream out) {
        out.println(statement.movements());

    }
}
