package polymorphism_demo.gameCharacters;

import polymorphism_demo.weapons.Weapon;

public abstract class GameCharacter {

    private final String name;
    private int amountLives;
    private Position position;
    private Weapon weapon;

    public GameCharacter(String name, int amountLives, Position position, Weapon weapon) {
        this.name = name;
        this.amountLives = amountLives;
        this.position = position;
        this.weapon = weapon;
    }

    public void goForwards() {
        float actualPosition = position.getPositionX();
        this.position.setPositionX(actualPosition++);
    }

    public void goBackwards() {
        float actualPosition = position.getPositionX();
        this.position.setPositionX(actualPosition--);
    }

    public String getName() {
        return name;
    }

    public int getAmountLives() {
        return amountLives;
    }

    public Position getPosition() {
        return position;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "GameCharacter{" + "name='" + name + ", amountLives=" + amountLives + ", position=" + position + "," +
                " weapon=" + weapon + '}';
    }
}

