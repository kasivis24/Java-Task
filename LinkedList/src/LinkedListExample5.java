import java.util.LinkedList;
import java.util.Collections;

public class LinkedListExample5 {
    public static void main(String[] args) {
        LinkedList<Character> chars = new LinkedList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');

        reverseList(chars);
        System.out.println("Reversed List: " + chars);
    }

    public static void reverseList(LinkedList<Character> list) {
        Collections.reverse(list);
    }
}
