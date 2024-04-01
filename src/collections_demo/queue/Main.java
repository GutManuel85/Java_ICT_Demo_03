package collections_demo.queue;

public class Main {
    public static void main(String[] args) {
        MyStringQueue queue = new MyStringQueue(5);
        System.out.println(queue.add("eins")); // true
        queue.add("zwei");
        queue.add("drei");
        System.out.println(queue.poll()); // eins
        queue.add("vier");
        queue.add("fünf");
        queue.add("sechs");
        try {
            queue.add("zuviel"); // MyStringQueue is already full
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        System.out.println(queue.poll()); // zwei
        System.out.println(queue.poll()); // drei
        System.out.println(queue.poll()); // vier
        System.out.println(queue.poll()); // fünf
        System.out.println(queue.poll()); // sechs
        System.out.println(queue.poll()); // null
    }
}
