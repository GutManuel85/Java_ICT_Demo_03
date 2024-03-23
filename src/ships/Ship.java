package ships;

import java.util.Objects;

public abstract class Ship {

    int length;
    int ps;
    String name;
    int costs;

    Ship(int length, int ps, String name, int costs){
        this.length = length;
        this.ps = ps;
        this.name = name;
        this.costs = costs;
    }


    @Override
    public String toString() {
        return "ships.Ship{" +
                "length=" + length +
                ", ps=" + ps +
                ", name='" + name + '\'' +
                ", costs=" + costs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return length == ship.length && ps == ship.ps && costs == ship.costs && Objects.equals(name, ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, ps, name, costs);
    }
}
