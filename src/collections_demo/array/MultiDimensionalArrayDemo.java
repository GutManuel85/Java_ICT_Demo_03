package collections_demo.array;

public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {

        System.out.println("#################### Two-dimensional array #################");
        char[][] twoDimensionalArray = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};

        printOut(twoDimensionalArray);
        System.out.println("*************************");

        setToA(twoDimensionalArray);
        printOut(twoDimensionalArray);

        System.out.println("*************************");

        // One in the middle
        twoDimensionalArray[1][1] = 'x';
        printOut(twoDimensionalArray);


        System.out.println("#################### Three-dimensional array #################");
        char[][][] threeDimensionalArray = {{{'a', 'b'}, {'d', 'e'}}, {{'g', 'h'},{'i', 'j'}}};
        printOut(threeDimensionalArray);

    }

    private static void printOut(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    // Method Overloading
    private static void printOut(char[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("Coordinates: (" + i + "/" + j + "/" + k + ") | Value: " + array[i][j][k]);
                }
            }
        }
    }

    private static void setToA(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 'a';
            }
        }
    }
}
