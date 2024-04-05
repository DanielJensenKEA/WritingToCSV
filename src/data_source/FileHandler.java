package data_source;

import domain_model.Employee;
import domain_model.EmployeeGeneration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {
    //private final String filePath = "testdata.csv";

    private EmployeeGeneration em;

    public FileHandler() {
        em = new EmployeeGeneration();
        em.buildEmployees();
    }

    public void writeToCSV() throws IOException, InterruptedException {
        String filePath = "src/testdatav2.csv";

        // skriver til .csv fil
        FileWriter fw = new FileWriter(filePath);

        // Formattering af tekst til .csv fil
        PrintWriter pw = new PrintWriter(fw);
        pw.println("NAME \tAGE \tSALARY");

        for (Employee employee : em.getEmployeeRoster()) {
            System.out.println("Writing employee: "+employee.toString());
            pw.println(employee);
            Thread.sleep(500); //Gøre sysout udskriften langsom for æstetik :)
        }
        pw.close(); //Skal bruge .close for at få objekterne printet til en .csv fil ellers vil den ikke printe.



    }


}
