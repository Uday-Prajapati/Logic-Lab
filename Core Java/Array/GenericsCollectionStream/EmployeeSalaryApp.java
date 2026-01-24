package GenericsCollectionStream;
import java.util.*;              // Imports Collection classes like List, ArrayList
import java.util.stream.*;       // Imports Stream API

// Generic Employee class
// T extends Number ensures salary can be Integer, Double, etc.
class Employee<T extends Number> {

    private int id;              // Stores employee id
    private String name;         // Stores employee name
    private T salary;            // Stores salary (generic numeric type)

    // Constructor to initialize employee details
    public Employee(int id, String name, T salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Converts generic salary to double for calculations
    public double getSalary() {
        return salary.doubleValue();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class EmployeeSalaryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);     // Scanner for user input
        List<Employee<Double>> employees = new ArrayList<>();
        // List to store Employee objects

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();                    // Reads number of employees

        // Loop to take employee details
        for (int i = 0; i < n; i++) {

            System.out.print("Enter id: ");
            int id = sc.nextInt();               // Reads employee id

            sc.nextLine();                       // Clears input buffer

            System.out.print("Enter name: ");
            String name = sc.nextLine();         // Reads employee name

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();     // Reads salary

            // Adds new Employee object to list
            employees.add(new Employee<>(id, name, salary));
        }

        System.out.print("Enter salary limit: ");
        double limit = sc.nextDouble();          // Salary filter limit

        System.out.println("\nEmployees with salary greater than " + limit);

        // Stream pipeline:
        // 1. stream() → converts list to stream
        // 2. filter() → selects employees with salary > limit
        // 3. forEach() → prints employee name
        employees.stream()
                 .filter(e -> e.getSalary() > limit)
                 .forEach(e -> System.out.println(e.getName()));

        // Calculates average salary using Stream API
        double avgSalary =
                employees.stream()
                         .mapToDouble(Employee::getSalary) // converts to double stream
                         .average()                         // calculates average
                         .orElse(0);                        // default if empty

        System.out.println("\nAverage Salary: " + avgSalary);

        System.out.println("\nEmployees sorted by salary:");

        // Sorts employees by salary in ascending order
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary))
                 .forEach(e ->
                         System.out.println(e.getName() + " " + e.getSalary()));
    }
}
