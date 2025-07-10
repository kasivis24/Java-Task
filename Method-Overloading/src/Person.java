public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor 1: only name
    public Person(String name) {
        this.name = name;
    }

    // Constructor 2: name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor 3: name, age, and address
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + (age != 0 ? age : "N/A"));
        System.out.println("Address: " + (address != null ? address : "N/A"));
        System.out.println("-------------------------");
    }
}
