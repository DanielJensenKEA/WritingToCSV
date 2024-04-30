package domain_model;


import java.util.ArrayList;

public class EmployeeGeneration {
    ArrayList<Employee> employeeRoster = new ArrayList<>();

    public void buildEmployees() {
        Employee e1 = new Employee("Daniel Jensen", 19, 20000, null);
        Employee e2 = new Employee("Martin Hansen", 23, 38000,null);
        Employee e3 = new Employee("Karl Urban", 42, 42000,null);
        Employee e4 = new Employee("Martin Brygmann", 32, 23450,null);
        Employee e5 = new Employee("Jonas Svensson", 54, 90254,null);
        EmployeeData ed1 = new EmployeeData("Vindspinderivej 2", 23895388, true);
        Employee e6 = new Employee("Jonas Kaj", 25, 90234, ed1 );

        employeeRoster.add(new Employee("Erik CEO", 64, 102502,null));
        employeeRoster.add(e1);
        employeeRoster.add(e2);
        employeeRoster.add(e3);
        employeeRoster.add(e4);
        employeeRoster.add(e5);
        employeeRoster.add(e6);
    }

    public ArrayList<Employee> getEmployeeRoster() {
        return employeeRoster;
    }

    public void setEmployeeRoster(ArrayList<Employee> employeeRoster) {
        this.employeeRoster = employeeRoster;
    }


}

