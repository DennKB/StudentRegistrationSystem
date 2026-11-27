import java.util.ArrayList;

public class StudentRegistration {

    static ArrayList<String> students = new ArrayList<>();

    public static void add(String n, int a, double g) {

        students.add(n);

        System.out.println("Student Added!");
        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
        System.out.println("Grade: " + g);
    }

    public static void display() {

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        System.out.println("--- Registered Students (" + students.size() + ") ---");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    public static void main(String[] args) {

        add("", -5, 150);
        add("John", 20, 85);
        add("John", 20, 85);

        display();
    }
}
