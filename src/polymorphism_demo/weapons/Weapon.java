package polymorphism_demo.weapons;

public abstract class Weapon {

    String name;
    int impact;
    int distance;


    public Weapon(String name, int impact, int distance) {
        this.name = name;
        this.impact = impact;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", impact=" + impact +
                ", distance=" + distance +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getImpact() {
        return impact;
    }

    public int getDistance() {
        return distance;
    }

    public abstract void upgrade();

}
