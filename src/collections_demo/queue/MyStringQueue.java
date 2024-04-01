package collections_demo.queue;

public class MyStringQueue {

    private final int capacity;
    private final String[] places;

    private int pointer;

    public MyStringQueue(int capacity) {
        this.capacity = capacity;
        this.places = new String[capacity + 1];
        this.pointer = 0;
    }

    public boolean add(String string) throws IllegalStateException {
        if (this.pointer < this.capacity) {
            places[pointer] = string;
            pointer++;
            return true;
        } else {
            throw new IllegalStateException("MyStringQueue is already full");
        }
    }

    public String poll() {
        String polledElement = places[0];
        for(int i = 0; i < this.pointer; i++){
            places[i] = places[i+1];
        }
        if(pointer > 0){
            pointer--;
        }
        return polledElement;
    }
}
