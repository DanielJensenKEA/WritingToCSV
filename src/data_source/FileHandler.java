package data_source;

import domain_model.Employee;
import domain_model.EmployeeData;
import domain_model.EmployeeGeneration;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    //private final String filePath = "testdata.csv";

    private EmployeeGeneration em;

    public FileHandler() {
        this.em = new EmployeeGeneration();
        //em.buildEmployees();
    }

    public void writeToCSV() throws IOException, InterruptedException {
        String filePath = "src/testdatav2.csv";
        String filePath2 = "src/employeeData2.csv";

        // skriver til .csv fil
        FileWriter fw = new FileWriter(filePath);
        FileWriter fwfp2 = new FileWriter(filePath2);

        // Formattering af tekst til .csv fil
        PrintWriter pw = new PrintWriter(fw);
        PrintWriter pwfp2 = new PrintWriter(fwfp2);
        pw.println("NAME \tAGE \tSALARY");

        for (Employee employee : em.getEmployeeRoster()) {
            System.out.println("Writing employee: " + employee.toString());
            pw.println(employee);
            Thread.sleep(500); //Gøre sysout udskriften langsom for æstetik :)
        }
        for(Employee employee : em.getEmployeeRoster()) {
            System.out.println("Fetching employeeData: "+employee.toString());
            pwfp2.println(employee.getEmployeeData());
        }
        pw.close(); //Skal bruge .close for at få objekterne printet til en .csv fil ellers vil den ikke printe.
        pwfp2.close();
    }

    public void loadListOfEmployees() throws FileNotFoundException, InterruptedException {
        Scanner sc;
        Scanner sc2;
        File file = new File("2024_employees.csv");
        File file2 = new File("EmployeeData.csv");

        sc = new Scanner(file);
        sc2 = new Scanner(file2);
        sc.nextLine(); // skip first line

        /*
        String header = sc.nextLine();
        System.out.println(header);
        */

        while (sc.hasNext()) {
            Employee emp;
            EmployeeData empData = null;
            String line = sc.nextLine();
            String line2 = sc2.hasNextLine() ? sc2.nextLine() : "";
            String[] attributes = line.split(", ");
            String[] empDataAttr = line2.split(", ");

            //for (int name = 1; name <= em.getEmployeeRoster().size(); name++) {

            if(!line2.isEmpty()) {
                empData = new EmployeeData(empDataAttr[0], Integer.parseInt(empDataAttr[1]), Boolean.parseBoolean(empDataAttr[2]));
            } else {
                emp = new Employee(attributes[0], Integer.parseInt(attributes[1]), Integer.parseInt(attributes[2]), empData);
                em.getEmployeeRoster().add(emp);
                System.out.println(emp + " has been added.");
                Thread.sleep(500);
            }

            //}
        }
        sc.close();
        sc2.close();
    }

    public ArrayList<Employee> getEmployeeRoster() {
        return em.getEmployeeRoster();
    }


}
