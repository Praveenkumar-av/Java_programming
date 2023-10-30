// program to set the background based on the button clicked - version 2
// arranging the buttons using the FlowLayout manager

import java.awt.*;
import java.awt.event.*;

class PushButtons2 extends Frame implements ActionListener
{
    // vars
    Button b1, b2, b3;

    PushButtons2()
    {
        // do not set any layout    
        setLayout(new FlowLayout());

        // create 3 push buttons
        b1 = new Button("Yellow"); 
        b2 = new Button("Blue"); 
        b3 = new Button("Pink"); 

        // we don't need to set the location of the buttons, the FlowLayout manager
        // automatically arranges that

        // add the buttons to the frame
        add(b1);  // by default -> this.add(b1);
        add(b2);
        add(b3);

        // add action listener to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // close the frame
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    // this method is called when a button is clicked 
    public void actionPerformed(ActionEvent ae)
    {
        // know the button clicked by the user
        if(ae.getSource() == b1) setBackground(Color.yellow);
        if(ae.getSource() == b2) setBackground(Color.blue);
        if(ae.getSource() == b3) setBackground(Color.pink);
    }

    public static void main(String args[])
    {
        // create the frame 
        PushButtons2 b = new PushButtons2();
        b.setSize(400,400);
        b.setTitle("My buttons");
        b.setVisible(true);
    }
}