package ui;

import data_source.FileHandler;

import java.io.IOException;

public class UserInterFace {
    private final FileHandler fh = new FileHandler();

    public void programmeStart() throws InterruptedException, IOException {
        startup();
        startUpFH();
    }

    private void startup() throws InterruptedException {
        System.out.println("Starting program...");
        Thread.sleep(1000); //For sjov
        System.out.println("Fetching data...");
        Thread.sleep(1000); //For sjov

    }
    private void startUpFH() throws IOException, InterruptedException {
        fh.writeToCSV();

    }
}
