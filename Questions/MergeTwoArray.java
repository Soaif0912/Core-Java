
package Questions;


public class MergeTwoArray{

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Merging two Person objects
        Person mergedPerson = person1.mergeWith(person2);

        // Printing the original and merged Person objects
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Merged Person: " + mergedPerson);
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to merge two Person objects
    public Person mergeWith(Person other) {
        String mergedName = (this.name != null ? this.name : "") + 
                            (other.name != null ? " & " + other.name : "");
        int mergedAge = this.age + other.age; // Define your merging logic

        // Create and return a new Person object
        return new Person(mergedName.trim(), mergedAge);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}