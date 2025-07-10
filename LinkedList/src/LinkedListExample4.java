import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample4 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");

        queue.poll(); // removes "Alice"
        queue.poll(); // removes "Bob"

        System.out.println("Remaining in queue: " + queue);
    }
}
