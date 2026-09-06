import java.util.ArrayList;
import java.util.Arrays;

public class Task2_3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original List: " + numbers);

        // Insert two values together
        numbers.addAll(2, Arrays.asList(25, 27));
        System.out.println("After bulk insertion: " + numbers);

        // Remove a range from the middle
        numbers.subList(3, 5).clear();
        System.out.println("After range removal: " + numbers);

        // Update the first element
        numbers.set(0, 100);
        System.out.println("After updating first element: " + numbers);
    }
}