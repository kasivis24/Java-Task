import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        for (char c = 'A'; c <= 'J'; c++) {
            characters.add(c);
        }

        System.out.println("Index of 'E': " + findIndex(characters, 'E'));
        System.out.println("Index of 'Z': " + findIndex(characters, 'Z'));
    }

    public static int findIndex(ArrayList<Character> list, char target) {
        return list.indexOf(target); // returns -1 if not found
    }
}
