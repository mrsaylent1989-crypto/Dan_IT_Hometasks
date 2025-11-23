package Task_3.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");

        //returns the first element without removing it from the collection
        System.out.println(queue.element());
        //Returns the first element without removing it from the collection. If the collection is empty, returns null.
        System.out.println(queue.peek());
        //Returns the first element, removing it from the collection. If the collection is empty, returns null.
        System.out.println(queue.poll());
        //Returns the first element, removing it from the collection.
        System.out.println(queue.remove());
        //Shows the length of the collection
        System.out.println(queue.size());
    }
}
