import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class Myframe extends JFrame {
    Myframe(){

        //set image icon of the JFrame
        ImageIcon image1=new ImageIcon("C:\\Users\\Arnab Roy\\OneDrive\\Desktop\\Java GUI\\Swing Basic\\logo\\logo.png");//cretae an image icon
        this.setIconImage(image1.getImage());//Change icon of frame

        //ImageIcon image2=new ImageIcon("Swing Basic\\media\\laptop.jpeg");//cretae an image icon
       //this.setIconImage(image2.getImage());//Change icon of frame

        //change backgroung colour of the frame
        //(1) -> r - g - b (0 to 255) 
        //(2) --> Hex code
        //this.getContentPane().setBackground(new Color(0,0,0));
        this.getContentPane().setBackground(new Color(0x45666));

        //Jlabel- a GUI display area for a string of text , an image, or both
        JLabel label=new JLabel();
        label.setText("Like,Share and Subscribe Youth Carrer Hub!!!");
        label.setIcon(image1);
        label.setHorizontalAlignment(JLabel.CENTER);//set text left,center,right of image
        label.setVerticalAlignment(JLabel.TOP);//set text top ,center, bottom
        label.setForeground(new Color(0x4CE72D));
        label.setFont(new Font("MV Boli",Font.BOLD,15));//set font
        label.setBounds(0, 28, 169, 125);

         
        //This is for entire project -basic structure
        this.setTitle("Welcome to, YOUTH CAREER HUB");// set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        this.setResizable(false);// prevent frame from being resized
        this.setSize(500, 500);// set the x dimnsion and y dimension
        //this.setLayout(null);
        this.setVisible(true);// make frame visible
        this.add(label);

        


    }
}
