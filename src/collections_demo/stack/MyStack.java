package collections_demo.stack;

import java.util.Arrays;

public class MyStack {

    private int pointer;
    private final int[] array;

    public MyStack(int size) {
        this.array = new int[size];
        this.pointer = 0;
    }

    public void push(int number) {
        this.array[this.pointer] = number;
        this.pointer++;
    }

    public int pop() {
        if (this.pointer >= 0) {
            this.pointer--;
            int result =  this.array[this.pointer];
            this.array[this.pointer] = 0;
            return result;
        }
        return -1;
    }

    public void printOut() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "pointer=" + pointer +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
