// program to display text in the frame by overriding paintComponent() method 
// of JPanel class

import javax.swing.*;
import java.awt.*;  // container class
class MyPanel extends JPanel 
{
    MyPanel()
    {
        this.setBackground(Color.green);
    }

    // Override the paintComponent() method of JPanel class
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Helvetica",Font.BOLD,34));
        g.drawString("Hello Learners",50,100);
    }
}

class DisplayingText extends JFrame
{
    DisplayingText()
    {
        // create content pane
        Container c = this.getContentPane();
        
        // create MyPanel object and add it to c
        MyPanel mp = new MyPanel();
        c.add(mp);
    }

    public static void main(String args[])
    {
        // create the frame
        DisplayingText obj = new DisplayingText();
        
        // set a title for the frame
        obj.setTitle("My swing frame");

        // set the size to 300 by 300 px
        obj.setSize(300,300);

        // display the frame
        obj.setVisible(true);

        // close the application upon clicking on close button of frame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}