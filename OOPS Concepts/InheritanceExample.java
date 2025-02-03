//Create a class Employee with attributes name and salary. Then, create a subclass Manager that extends Employee and adds an additional attribute bonus. Implement a method to calculate the total salary of a manager.

// Base class (Parent)
class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class (Child)
class Manager extends Employee {
    double bonus;

    // Constructor
    public Manager(String name, double salary, double bonus) {
        super(name, salary); // Calling the parent class constructor
        this.bonus = bonus;
    }

    // Method to calculate total salary
    public double getTotalSalary() {
        return salary + bonus;
    }

    // Overriding displayInfo method to include bonus
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class method
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + getTotalSalary());
    }
}

// Main class to test inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        emp.displayInfo();

        System.out.println("\nManager Details:");
        Manager mgr = new Manager("Bob", 70000, 15000);
        mgr.displayInfo();
    }
}
