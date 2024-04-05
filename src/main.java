import data_source.FileHandler;
import domain_model.*;
import ui.*;

public class main {
    public static void main(String[] args) {

        UserInterFace ui = new UserInterFace();

        try {
            //TODO: programmestart & startmenu
            ui.programmeStart();

        }catch(Exception e) {
            System.out.println(e.getMessage()+", "+e.getCause()+", "+e.getLocalizedMessage());
        }

    }
}
