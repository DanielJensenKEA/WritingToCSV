package domain_model;

import data_source.FileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    private final FileHandler fh;
    //private final EmployeeGeneration eg;
    public Controller() {
        this.fh = new FileHandler();
        //this.eg = new EmployeeGeneration();
    }
    public void writeToCSV() throws IOException, InterruptedException {
        fh.writeToCSV();
    }
    /*
    public ArrayList<Employee> getEmployeeRoster() {
        return eg.getEmployeeRoster();
    }
     */
    public ArrayList<Employee> getEmployeeRoster() {
        return fh.getEmployeeRoster();
    }
    public void loadListOfEmployees() throws FileNotFoundException, InterruptedException {
        fh.loadListOfEmployees();
    }
}
