package lesson17;

public class Employee {
    private String Name;
    private String position;
    private String email;
    private String phoneNum;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNum, double salary, int age) {
        this.Name = fullName;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }
    public String getName() {
        return Name;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + Name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
