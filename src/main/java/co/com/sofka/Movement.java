package co.com.sofka;

import co.com.sofka.values.Amount;
import co.com.sofka.values.Date;
import co.com.sofka.values.MovementType;
import co.com.sofka.values.Total;

public class Movement {

    private final Amount amount;
    private final Date date;

    private final Total total;

    private final MovementType type;




    public Movement(Amount amount, Date date, Total total, MovementType type) {
        this.amount = amount;
        this.date = date;
        this.total = total;
        this.type = type;
    }



    public Integer amount(){
        return amount.value();
    }

    public String date(){
        return date.value();
    }

    public int total(){
        return total.value();
    }

    public MovementType.Types type(){
       return type.value();
    }


    @Override
    public String toString() {
        return "Movement{" +
                "amount=" + amount +
                ", date=" + date +
                ", total=" + total +
                ", type=" + type +
                '}';
    }
}
