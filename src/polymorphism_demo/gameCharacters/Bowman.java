package polymorphism_demo.gameCharacters;

import polymorphism_demo.weapons.Bow;

public class Bowman extends GameCharacter{

    public Bowman(String name, int amountLives, Position position, Bow bow) {
        super(name, amountLives, position, bow);
    }
}
