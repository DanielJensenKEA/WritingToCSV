package domain_model;

import java.util.ArrayList;

public class EmployeeData {
    private String address;
    private int phoneNumber;
    private boolean married;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }




    public EmployeeData(String address, int phoneNumber, boolean married) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.married = married;

    }

    public String toString() {
        String result ="";
        result += "Address: "+address+"\tPhone number: "+phoneNumber+"\tMarriage status: ";
        if(married) {
            result +=" Married.";
        } else {
            result +=" Not married.";
        }
        return result;
    }
}
