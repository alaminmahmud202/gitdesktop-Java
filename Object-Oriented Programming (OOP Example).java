class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display info
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        person1.display();
    }
}
