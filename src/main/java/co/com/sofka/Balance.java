package co.com.sofka;

import co.com.sofka.values.Amount;
import co.com.sofka.values.Total;


public class Balance {

    private Total total;

    public Balance(){
        this.total = Total.of(0);
    }


   public void sumBalance(Amount amount){
       this.total = Total.of(this.total.value()+amount.value());
   }

    public void substractionBalance(Amount amount){
        this.total = Total.of(this.total.value()-amount.value());
    }

    public Total total(){
       return total;
    }
}
