package co.com.sofka.values;

public class Total implements ObjectValueI<Integer> {

    private int total;


    private Total(Integer total) {
        this.total = total;
    }

    public static Total of(Integer total){
        return new Total(total);
    }


    @Override
    public Integer value() {
        return total;
    }

    @Override
    public String toString() {
        return "Total{" +
                "total=" + total +
                '}';
    }
}
