import java.util.ArrayList;

public class StudentRegistration {

    static ArrayList<Student> students = new ArrayList<>();

    public static void add(String name, int age, double grade) {

        Student newStudent = new Student(name, age, grade);

        if (name.isBlank() || name = null) { throw new IllegalArgumentException("Student must have a name"); }
        if (age < 5 || age > 90) { throw new IllegalArgumentException("Student must be of valid age"); }
        if (grade < 0 || grade > 100) { throw new IllegalArgumentException("Student must have a valid grade"); }
        for (int x = 0 ; x < students.size() ; x++) {
            if (students.get(x).getName().equalsIgnoreCase(name) && students.get(x).getAge() == age && students.get(x).getGrade() == grade) { throw new IllegalArgumentException("Student already exists in the system"); }
        }

        students.add(newStudent);

        System.out.println("Student Added!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void display() {

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        System.out.println("--- Registered Students (" + students.size() + ") ---");
        for (int i = 0; i < students.size(); i++) {
            student currentStudent = students.get(i);
            System.out.printf("%d. Name: %s | Age: %d | Grade: %.2f%n",
                    (i + 1),
                    currentStudent.getName(),
                    currentStudent.getAge(),
                    currentStudent.getGrade());
        }
    }

    public static void main(String[] args) {

        add("", -5, 150);
        add("John", 20, 85);
        add("John", 20, 85);

        display();
    }
}
