import java.util.LinkedList;

public class Task1_1 {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Isuru");
        students.add("Kushan");
        students.add("Asala");
        students.add("Samoshi");
        students.add("Maleesha");

        System.out.println("Original List: " + students);

        students.add(2, "Nimal");
        System.out.println("After inserting Nimal: " + students);

        students.removeFirst();
        System.out.println("After removing first student: " + students);

        students.removeLast();
        System.out.println("After removing last student: " + students);
    }
}