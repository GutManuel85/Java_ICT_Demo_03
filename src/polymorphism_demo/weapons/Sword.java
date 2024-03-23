package polymorphism_demo.weapons;

public class Sword extends Weapon {

    public Sword(String name, int impact, int distance) {
        super(name, impact, distance);
    }

    @Override
    public void upgrade() {
        super.impact++;
        super.distance++;
    }

    public void stab() {
        System.out.println("⚔⚔⚔ Schwerthieb ⚔⚔⚔");
    }
}

