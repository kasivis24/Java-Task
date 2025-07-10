import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");

        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("three")) {
                iterator.set("THREE");
            }
        }

        System.out.println("Modified List: " + words);
    }
}
