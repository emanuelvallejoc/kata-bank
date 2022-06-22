package co.com.sofka.values;

import java.util.Objects;

public class Date  {

    private final String date;

    private Date(String date) {
        this.date = Objects.requireNonNull(date);
    }

    public static Date of(String date){
        return new Date(date);
    }


    public String value(){
        return date;
    }

    @Override
    public String toString() {
        return "Date{" +
                "date='" + date + '\'' +
                '}';
    }
}
