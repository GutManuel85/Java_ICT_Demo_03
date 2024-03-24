package collections_demo.array;

public class BasicArrayDemo {

    public static void main(String[] args) {

        // Generics like <T> can only be used with Objects and not with primitive data types. Therefor Integer instead int
        Integer[] basicIntegerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] basicStringArray = {"BMW", "Opel", "Audi", "Mercedes"};

        // Generics like <T> can only be used with Objects and not with primitive data types. Therefor Character instead char
        Character[] basicCharacterArray = {'a', 'b', 'c', 'd', 'd'};


        printGenericElements(basicIntegerArray);
        printGenericElements(basicStringArray);
        printGenericElements(basicCharacterArray);

        printLength(basicIntegerArray);
        printLength(basicStringArray);
        printLength(basicCharacterArray);

    }

    private static <T> void printGenericElements(T[] array) {
        for (T element : array) {
            System.out.println("Das Element ist: " + element);
        }
    }

    private static <T> void printLength(T[] array) {
        int length = array.length;
        System.out.println("Die Länge des Arrays ist " + length);
    }
}
