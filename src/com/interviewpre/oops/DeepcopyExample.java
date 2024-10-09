// Address class implementing Cloneable for deep copy
public class Address implements Cloneable {
    private String city;

    // Constructor
    public Address(String city) {
        this.city = city;
    }

    // Override clone() to allow deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy is fine for Address as it only contains immutable fields
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address: " + city;
    }
}

// Person class implementing Cloneable for deep copy
 class Person  {
    private String name;
    private Address address;

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Override clone() to perform deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone(); // Shallow copy of Person
        cloned.address = (Address) address.clone(); // Deep copy of Address
        return cloned;
    }

    // Getter for address
    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", " + address;
    }
}

// Main class to test deep copy
public class DeepcopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create an Address object
        Address address = new Address("New York");

        // Create a Person object with the address
        Person person1 = new Person("John", address);

        // Clone the person1 (deep copy)
        Person person2 = (Person) person1.clone();

        // Change the address of person2
        person2.getAddress().clone(); // Deep copy ensures separate Address objects

        // Print both persons to see if they have independent addresses
        System.out.println(person1); // Output: Person: John, Address: New York
    }}
