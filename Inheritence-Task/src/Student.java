class StudentModel {
    String name;
    int age;

    StudentModel(String name) {
        this.name = name;
        System.out.println("Student Constructor with 1 param");
    }

    StudentModel(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student Constructor with 2 params");
    }
}

class ZSGSStudent extends StudentModel {
    String course;

    ZSGSStudent(String name, int age, String course) {
        super(name, age); // Calls parent constructor
        this.course = course;
        System.out.println("ZSGSStudent Constructor");
    }
}

// Trying to use parent constructor to create child (invalid directly, but shown for experiment)
public class Student {
    public static void main(String[] args) {
        ZSGSStudent z = new ZSGSStudent("Ram", 22, "Java");
        // Student s = new ZSGSStudent("Ravi", 23, "Python"); // Valid polymorphism
        // ZSGSStudent z2 = new Student("Test"); // Invalid – cannot assign parent to child
    }
}
