import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args)
    {
        String askName;
        int confirmName;
    
        do {

        askName = JOptionPane.showInputDialog
        (null, "What is your name?");

         if (askName == null) {
                JOptionPane.showMessageDialog(null, "You cancelled. Exiting program.");
                System.exit(0);  }
                
        confirmName = JOptionPane.showConfirmDialog
        (null,"Is your name " + askName + "?", "Confirm Name", JOptionPane.YES_NO_OPTION);


        } while (confirmName != JOptionPane.YES_OPTION);


        String outputMessage = "Hello, " + askName + "!";

        JOptionPane.showMessageDialog(null, outputMessage);



    }
}
