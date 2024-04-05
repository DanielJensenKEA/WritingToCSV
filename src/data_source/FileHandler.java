package data_source;

import domain_model.Employee;
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

        // skriver til .csv fil
        FileWriter fw = new FileWriter(filePath);

        // Formattering af tekst til .csv fil
        PrintWriter pw = new PrintWriter(fw);
        pw.println("NAME \tAGE \tSALARY");

        for (Employee employee : em.getEmployeeRoster()) {
            System.out.println("Writing employee: " + employee.toString());
            pw.println(employee);
            Thread.sleep(500); //Gøre sysout udskriften langsom for æstetik :)
        }
        pw.close(); //Skal bruge .close for at få objekterne printet til en .csv fil ellers vil den ikke printe.
    }

    public void loadListOfEmployees() throws FileNotFoundException, InterruptedException {
        Scanner sc;
        File file = new File("2024_employees.csv");

        sc = new Scanner(file);
        sc.nextLine(); // skip first line

        /*
        String header = sc.nextLine();
        System.out.println(header);
        */

        while (sc.hasNext()) {
            Employee emp;
            String line = sc.nextLine();
            String[] attributes = line.split(", ");

            //for (int name = 1; name <= em.getEmployeeRoster().size(); name++) {
            emp = new Employee(attributes[0], Integer.parseInt(attributes[1]), Integer.parseInt(attributes[2]));
            em.getEmployeeRoster().add(emp);
            System.out.println(emp + " has been added.");
            Thread.sleep(500);
            //}
        }
        sc.close();
    }

    public ArrayList<Employee> getEmployeeRoster() {
        return em.getEmployeeRoster();
    }


}
