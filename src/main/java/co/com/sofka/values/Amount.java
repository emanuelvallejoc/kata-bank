package co.com.sofka.values;


import java.util.Objects;

public class Amount  {

    private final Integer amount;

    private Amount(Integer amount) {
        this.amount = Objects.requireNonNull(amount);

    }

    public static Amount  of(int amount){
        return new Amount(amount);
    }

    public Integer value(){
        return amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "amount=" + amount +
                '}';
    }
}
