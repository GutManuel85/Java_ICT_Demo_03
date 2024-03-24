package collections_demo.array;

import java.util.Arrays;

public class LoopThroughArrayDemo {

    public static void main(String[] args) {


        String[] countries = {"Switzerland", "Germany", "Austria", "Italy", "France", "Lichtenstein"};

        // Classic for loop
        System.out.println("********** Classic for loop **********");
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Element " + i + " is " + countries[i]);
        }

        // For each loop
        System.out.println("********** For each loop **********");
        for (String element : countries) {
            System.out.println("Element is " + element);
        }

        // Stream
        System.out.println("********** Stream **********");
        Arrays.stream(countries).forEach(e -> System.out.println("Element is " + e));
    }
}
