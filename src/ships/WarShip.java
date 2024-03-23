package ships;

import java.util.Objects;

public class WarShip extends Ship{

    private int amountCannons;
    private boolean hasHelicopter;

    public WarShip(int length, int ps, String name, int costs,
                   int amountCannons, boolean hasHelicopter){
        super(length, ps, name, costs);
        this.amountCannons = amountCannons;
        this.hasHelicopter = hasHelicopter;

    }


    @Override
    public String toString() {
        return "ships.WarShip{" +
                "amountCannons=" + amountCannons +
                ", hasHelicopter=" + hasHelicopter +
                ", length=" + length +
                ", ps=" + ps +
                ", name='" + name + '\'' +
                ", costs=" + costs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WarShip warShip)) return false;
        if (!super.equals(o)) return false;
        return amountCannons == warShip.amountCannons && hasHelicopter == warShip.hasHelicopter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountCannons, hasHelicopter);
    }
}
