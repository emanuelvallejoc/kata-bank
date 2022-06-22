package co.com.sofka;

import co.com.sofka.values.Amount;
import co.com.sofka.values.Date;
import co.com.sofka.values.MovementType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statement {


    private final List<Movement> movements;
    private final Balance balance;

    public Statement(){
        movements = new ArrayList<>();
        balance = new Balance();
    }


    public void addTransaction(Amount amount, Date date){
        this.balance.sumBalance(amount);
        movements.add(new Movement(amount, date, this.balance.total(), MovementType.of(MovementType.Types.CREDITO)));


    }

    public void substraction(Amount amount, Date date){
        this.balance.substractionBalance(amount);
        movements.add(new Movement(amount, date, this.balance.total(), MovementType.of(MovementType.Types.DEBITO)));

    }

    public String movements(){
        Collections.reverse(movements);
        var sb = new StringBuilder();
        movements.forEach(movement -> {
            addLine(sb, movement);
        });

        return sb.toString();
    }


    public void addLine(StringBuilder sb, Movement movement){

        sb.append(movement.date()).append("|")
                .append(Boolean.TRUE.equals(isCredit(movement))?movement.amount():"\t").append("|")
                .append(Boolean.FALSE.equals(isCredit(movement))?movement.amount():"\t").append("|")
                .append(movement.total()).append("\n");

    }

    public Boolean isCredit(Movement movement){
        return movement.type().equals(MovementType.Types.CREDITO);
    }



}
