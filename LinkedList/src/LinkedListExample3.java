import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        list.remove(2); // remove 3rd element (index 2)
        list.removeLast(); // remove last element

        System.out.println("Modified List: " + list);
    }
}
