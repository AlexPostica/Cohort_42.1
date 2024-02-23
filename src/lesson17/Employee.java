package lesson17;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNum;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNum, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }
    public String getFullName() {
        return fullName;
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
}
