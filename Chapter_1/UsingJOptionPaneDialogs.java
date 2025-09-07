//Importing JOptionpane for GUI
import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args)
    {
        // Initalization 
        String askName;
        int confirmName;

        // Loop of the program 
        do {

        // Ask for user's name 
        askName = JOptionPane.showInputDialog
        (null, "What is your name?");
            
        // Exit program if user choose to cancel 
         if (askName == null) {
                JOptionPane.showMessageDialog(null, "You cancelled. Exiting program.");
                System.exit(0);  }

        //Confirm user's name | Ask again if not confirmed 
        confirmName = JOptionPane.showConfirmDialog
        (null,"Is your name " + askName + "?", "Confirm Name", JOptionPane.YES_NO_OPTION);

        // User confirms name 
        } while (confirmName != JOptionPane.YES_OPTION);

        // Show user's confirmed name 
        String outputMessage = "Hello, " + askName + "!";

        JOptionPane.showMessageDialog(null, outputMessage);



    }
}

