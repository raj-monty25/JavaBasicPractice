package Morgan.Practice;


import java.util.*;
import java.util.stream.Stream;

/**
 * Example of java comparator
 */
public class Employee implements Comparable<Employee> {

    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String fName, String lName) {
        this.id = id;
        this.firstName = fName;
        this.lastName =lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Employee em) {
        int result = em.firstName.compareTo(this.firstName);
        if (result == 0) {
            result = em.lastName.compareTo(this.lastName);
        }
        return result;
    }

    @Override
    public String toString() {

        return "Employee {" +
                "Id = " + id +
                ", FirstName = " + firstName +
                ", LastName = " +lastName+
                "} \n";
    }

    /**
     * This method find the unique employees from the list using firat name and last name
     * @param employees
     * @return
     */
    public static List<Employee> uniqueEmployee(List<Employee> employees) {
        Collections.sort(employees);
        ArrayList<Employee> emp = new ArrayList<>();
        if(!employees.isEmpty()) {
            emp.add(employees.get(0));
        }

        for (int i = 1; i<employees.size();i++) {
            if (employees.get(i).compareTo(employees.get(i - 1)) != 0) {
                emp.add(employees.get(i));
            }
        }
        return  emp;
    }

    public static List<Employee> sortEmployee(List<Employee> employees) {
        Comparator<Employee> comparator = Comparator.comparing(Employee::getLastName)
                .thenComparing(Employee::getFirstName);
        Collections.sort(employees);

        return employees;

    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe"));
        employees.add(new Employee(2, "Jane", "Doe"));
        employees.add(new Employee(3, "Keith", "Smith"));
        employees.add(new Employee(4, "Jane", "Doe"));
        employees.add(new Employee(5, "John", "Doe"));
        employees.add(new Employee(6, "Ishita", "Doe"));
        employees.add(new Employee(7, "Ishita", "Raj"));

        List<Employee> result2 = Employee.sortEmployee(employees);

        System.out.println("Sorted Employees are : ");
        Stream.of(employees).forEach(System.out::println);

        Stream.of(result2).forEach(System.out::println);

        List<Employee> result = Employee.uniqueEmployee(employees);


        System.out.println("Unique Employees are : ");
        Stream.of(result).forEach(System.out::println);




    }
}
