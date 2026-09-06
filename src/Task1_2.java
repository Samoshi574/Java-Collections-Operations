import java.util.LinkedList;

public class Task1_2 {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        numbers.addFirst(5);
        System.out.println("After adding 5 at the beginning: " + numbers);

        numbers.addLast(60);
        System.out.println("After adding 60 at the end: " + numbers);

        int middleIndex = numbers.size() / 2;
        numbers.remove(middleIndex);

        System.out.println("After removing middle element: " + numbers);
    }
}
