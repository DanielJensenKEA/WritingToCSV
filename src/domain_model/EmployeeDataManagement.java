package domain_model;

import java.util.ArrayList;

public class EmployeeDataManagement {
    private ArrayList<EmployeeData> EmployeeDataList;
    public EmployeeDataManagement() {
        EmployeeDataList = new ArrayList<>();
    }

    public ArrayList<EmployeeData> getEmployeeDataList() {
        return EmployeeDataList;
    }
    public void addEmployeeDataToList(EmployeeData e) {
        EmployeeDataList.add(e);

    }
}
