package domain_model;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private EmployeeData employeeData;

    public Employee(String name, int age, int salary, EmployeeData employeeData) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.employeeData = employeeData;
    }

    public EmployeeData getEmployeeData() {
        return employeeData;
    }

    public void setEmployeeData(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    ////////////////////// Getters //////////////////////
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }

    ////////////////////// Setters //////////////////////
    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String setName(String name) {
        return this.name = name;
    }

    @Override
    public String toString() {
        return name+", "+age+", "+salary;
    }
}
