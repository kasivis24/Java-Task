import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        System.out.println("First Element: " + numbers.getFirst());
        System.out.println("Last Element: " + numbers.getLast());
    }
}
