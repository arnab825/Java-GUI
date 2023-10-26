import javax.swing.SwingUtilities;


public class AppLauncher {
    public static void main(String[] args) {
        // we use invokeLater() to make updates to GUI more thread safe and efficient
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // instance of LoginFormGUI 
                new LoginFormGui().setVisible(true);  
            }
        });
    }
}