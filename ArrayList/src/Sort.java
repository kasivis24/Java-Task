import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1); // 1 to 100
        }

        System.out.println("Original list: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
    }
}
