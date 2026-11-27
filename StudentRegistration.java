import java.util.ArrayList;

public class student {
    private String name;
    private int age;
    private double grade; 
    
    student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    double getGrade() {
        
    }
}

public class StudentRegistration {

    static ArrayList<student> Students = new ArrayList<>();

    public static void add(String name, int age, double grade) {

        student newStudent = new student(name, age, grade);

        if (name.isBlank()) { throw new IllegalArgumentException("Student must have a name"); }
        if (age < 5 || age > 90) { throw new IllegalArgumentException("Student must be of valid age"); }
        if (grade < 0 || grade > 100) { throw new IllegalArgumentException("Student must have a valid grade"); }
        for (int x = 0 ; x < Students.size() ; x++) {
            if (Students.get(x) == newStudent) { throw new IllegalArgumentException("Student already exists in the system"); }
        }

        Students.add(newStudent);

        System.out.println("Student Added!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void display() {

        for (String s : students) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        add("", -5, 150);
        add("John", 20, 85);
        add("John", 20, 85);

        display();
    }
}
