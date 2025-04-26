// Example of Encapsulation in Java

class Person {
    // Private data members (fields)
    private String name;
    private int age;

    // Public setter method to set name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method to get name
    public String getName() {
        return name;
    }

    // Public setter method to set age
    public void setAge(int age) {
        this.age = age;
    }

    // Public getter method to get age
    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Person
        Person p = new Person();

        // Set data using setter methods
        p.setName("Nishat");
        p.setAge(23);

        // Get data using getter methods
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}