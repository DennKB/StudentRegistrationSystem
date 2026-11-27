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
        return grade;
    }
}
