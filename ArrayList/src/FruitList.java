import java.util.ArrayList;

public class FruitList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Retrieve and print the third fruit (index 2)
        System.out.println("Third fruit: " + fruits.get(2));
    }
}

