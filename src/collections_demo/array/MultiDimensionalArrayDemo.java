package collections_demo.array;

public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {

        int[][] twoDimensionalArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printOut(twoDimensionalArray);
        System.out.println("*************************");

        setToZero(twoDimensionalArray);
        printOut(twoDimensionalArray);

        System.out.println("*************************");

        // One in the middle
        twoDimensionalArray[1][1] = 1;
        printOut(twoDimensionalArray);



    }

    private static void printOut(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void setToZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
    }
}
