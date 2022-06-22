package co.com.sofka.values;

public class MovementType implements ObjectValueI<MovementType.Types>{

    private final Types types;

    private MovementType(Types types) {
        this.types = types;
    }

    public static MovementType of (Types type){
        return new MovementType(type);
    }

    @Override
    public Types value() {
        return types;
    }


    @Override
    public String toString() {
        return "MovementType{" +
                "types=" + types +
                '}';
    }

    public enum Types {
        DEBITO,
        CREDITO

    }
}
