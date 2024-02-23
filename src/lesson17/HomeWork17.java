package lesson17;
/**
 * AIT-TR, cohort 42.1, Java Basic, hw #17
 * @author Alexandru
 * @version 23.Feb
 */
public class HomeWork17 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", "Graphic Designer", "john@example.com", "+1122334455", 50000, 35),
                new Employee("Jane", "Data Scientist", "jane@example.com", "+1122334455", 60000, 45),
                new Employee("Alex", "Software Engineer", "alex@example.com", "+1122334455", 55000, 40),
                new Employee("Alice", "Financial Analyst", "alice@example.com", "+1122334455", 70000, 50),
                new Employee("Charlie", "Marketing Manager", "charlie@example.com", "+1122334455", 48000, 38)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
