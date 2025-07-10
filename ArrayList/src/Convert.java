import java.util.ArrayList;
import java.util.Arrays;

public class Convert {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // Convert ArrayList to Array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(fruitArray));

        // Convert Array back to ArrayList
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fruitArray));
        System.out.println("ArrayList: " + fruitList);
    }
}

