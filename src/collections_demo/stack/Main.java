package collections_demo.stack;

public class Main {

    public static void main(String[] args) {

        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.printOut();
        System.out.println(myStack.pop());
        myStack.printOut();

    }
}
