package ui;

import domain_model.Controller;
import domain_model.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserInterFace {
    private final Controller controller = new Controller();
    private final int SENTINEL = 9;
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_RESET = "\u001B[0m";

    public void startMenu() throws InterruptedException, FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        while (userInput != SENTINEL) {
            displayMenu();
            System.out.print("> ");
            userInput = input.nextInt();
            input.nextLine();

            switch (userInput) {
                case 1: {
                    //TODO: Display employees
                    displayListOfEmployeesToString();
                    break;
                }
                case 2: {
                    //TODO: Load employees
                    controller.loadListOfEmployees();
                    break;
                }
                case 3: {
                    //TODO: Save employees

                    break;
                }
                case 9: {
                    userInput = SENTINEL;
                    break;
                }

            }
        }
    }



    public void displayMenu() {
        System.out.println("\t EMPLOYEE ADMIN MENU");
        System.out.println(" ");
        System.out.println("1: Display list of employees");
        System.out.println("2: Load employee list");
        System.out.println("3: Save employee list");
        System.out.println("9: Exit program");
    }

    public void programmeStart() throws InterruptedException, IOException {
        startup();
        startMenu();
    }

    private void startup() throws InterruptedException {
        System.out.println("Starting program...");
        Thread.sleep(1000); //For sjov
        System.out.println("Fetching data...");
        Thread.sleep(1000); //For sjov

    }

    private void startUpFH() throws IOException, InterruptedException {
        controller.writeToCSV();

    }

    public void displayListOfEmployeesToString() throws InterruptedException {
        System.out.println("Fetching list of employees...");
        Thread.sleep(1000);
        if(!controller.getEmployeeRoster().isEmpty()) {
            for (Employee employee : controller.getEmployeeRoster()) {
                Thread.sleep(500);
                System.out.println(employee);
            }
        } else {
            System.out.println(ANSI_RED+"No currently active employees registered."+ ANSI_RESET);
            System.out.println(" ");
        }
    }

}
