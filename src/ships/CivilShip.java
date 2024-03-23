package ships;

import java.util.Objects;

public class CivilShip extends Ship {

    private int amountGuests;


    public CivilShip(int length, int ps, String name, int costs,
                   int amountGuests){
        super(length, ps, name, costs);
        this.amountGuests = amountGuests;
    }

    @Override
    public String toString() {
        return "ships.CivilShip{" +
                "amountGuests=" + amountGuests +
                ", length=" + length +
                ", ps=" + ps +
                ", name='" + name + '\'' +
                ", costs=" + costs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CivilShip civilShip)) return false;
        if (!super.equals(o)) return false;
        return amountGuests == civilShip.amountGuests;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountGuests);
    }

    public int getAmountGuests() {
        return amountGuests;
    }
}
