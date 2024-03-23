package polymorphism_demo.gameCharacters;

import polymorphism_demo.weapons.Sword;

public class CavalryRider extends GameCharacter {

    private final Horse horse;

    public CavalryRider(String name, int amountLives, Position position, Sword sword, Horse horse) {
        super(name, amountLives, position, sword);
        this.horse = horse;
    }

    public Horse getHorse() {
        return horse;
    }

    @Override
    public String toString() {
        return "CavalryRider{" +
                "horse=" + horse +
                '}';
    }
}
