import javax.swing.JFrame;

public class Form extends JFrame{
    //create a constructor
    public Form(String title)
    {
        //set the title of the title of the JFrame bar
        super(title);

        //set the size of the GUI
        setSize(520, 680);

        //configure GUI to end process after closing
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set layout to null to disable layout management to place the component whatever we want
        setLayout(null);

        //login GUI in the center of the screen


        //create the background color of GUI

    }
}
