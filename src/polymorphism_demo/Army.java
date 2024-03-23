package polymorphism_demo;

import polymorphism_demo.gameCharacters.*;
import polymorphism_demo.weapons.Bow;
import polymorphism_demo.weapons.Sword;

import java.util.ArrayList;

public class Army {

    ArrayList<Bowman> bowmen;
    ArrayList<CavalryRider> cavalryRiders;

    public Army(int bowmanAmount, int cavalryRiderAmount){
        this.bowmen = this.createBowmen(bowmanAmount);
        this.cavalryRiders = this.createCavalryRiders(cavalryRiderAmount);
    }

    public ArrayList<Bowman> createBowmen(int bowmanAmount){
        ArrayList<Bowman> bowmen = new ArrayList<>();
        for(int i = 0; i < bowmanAmount; i++){
            bowmen.add(new Bowman(String.valueOf(i), 5, new Position(0,i),
                    new Bow("Longbow0",2, 50 , 10)));
        }
        return bowmen;
    }

    public ArrayList<CavalryRider> createCavalryRiders(int cavalryRidersAmount) {
        ArrayList<CavalryRider> cavalryRiders = new ArrayList<>();
        for (int i = 0; i < cavalryRidersAmount; i++) {
            Horse horse = switch (i % 4) {
                case 0 -> Horse.CHARGER;
                case 1 -> Horse.COURSER;
                case 2 -> Horse.ROUNCEY;
                default -> Horse.DESTRIER;
            };
            cavalryRiders.add(new CavalryRider(String.valueOf(i), 10, new Position(1, i),
                    new Sword("One hand sword", 10, 2), horse));
        }
        return cavalryRiders;
    }

    public ArrayList<Bowman> getBowmen() {
        return bowmen;
    }

    public ArrayList<CavalryRider> getCavalryRiders() {
        return cavalryRiders;
    }

    @Override
    public String toString() {
        return "Army{" +
                "bowmen=" + bowmen +
                ", cavalryRiders=" + cavalryRiders +
                '}';
    }
}
