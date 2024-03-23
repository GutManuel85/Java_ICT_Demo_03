package ships;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Ship> ships = new ArrayList<>();

        WarShip warShip1 = new WarShip(30, 5000, "War1", 100000,
                10, false);

        WarShip warShip2 = new WarShip(30, 5000, "War1", 100000,
                10, false);

        System.out.println(warShip1.equals(warShip2));

        ships.add(warShip1);
        ships.add(warShip2);

        printShips(ships);


    }

    public static void printShips(ArrayList<Ship> ships){
        ships.forEach(System.out::println);
    }
}