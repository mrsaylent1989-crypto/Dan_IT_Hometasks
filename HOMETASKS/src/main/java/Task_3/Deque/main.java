package Task_3.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class main {
    public static void main(String[] args) {
        Deque<String> stringDeque = new ArrayDeque<>();
        //Adding an item to the beginning and end of a collection
        stringDeque.addFirst("Vitaha");
        stringDeque.addFirst("Alex");
        stringDeque.addLast("Borya");
        stringDeque.addFirst("Alex");
        stringDeque.addLast("Borya");
        stringDeque.addLast("Vitek");

        //Show the first item at the beginning and end of the collection
        System.out.println(stringDeque.getFirst());
        System.out.println(stringDeque.getLast());
        //Returns the first and end element without removing it from the collection. If the collection is empty, returns null.
        System.out.println(stringDeque.peekFirst());
        System.out.println(stringDeque.peekLast());
        //Returns the first and end element, removing it from the collection.
        System.out.println(stringDeque.pollFirst());
        System.out.println(stringDeque.pollLast());
        //Remove the first or last specified repeating element
        System.out.println(stringDeque.removeFirstOccurrence("Alex"));
        System.out.println(stringDeque.removeLastOccurrence("Borya"));
    }
}
