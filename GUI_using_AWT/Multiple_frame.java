// p

import java.awt.*;
import java.awt.event.*;

class Frame1 extends Frame implements ActionListener
{
    Button b1, b2;

    Frame1()
    {
        setLayout(new FlowLayout());

        // create 3 push buttons
        b1 = new Button("Next"); 
        b2 = new Button("Close"); 

        // we don't need to set the location of the buttons, the FlowLayout manager
        // automatically arranges that

        // add the buttons to the frame
        add(b1);  // by default -> this.add(b1);
        add(b2);

        // add action listener to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    // this method is called when a button is clicked 
    public void actionPerformed(ActionEvent ae)
    {
        // if next button is clicked, display frame2
        if(ae.getSource() == b1) 
        {
            // create Frame2 object and display
            Frame2 f2 = new Frame2();
            f2.setSize(400,400);
            f2.setVisible(true);
        }
        else 
        {
            // if close button is clicked, close application
            System.exit(0);
        }
    }
}

class Frame2 extends Frame implements ActionListener
{
    // create a button 
    Button b;

    Frame2()
    {
        // set layout to flow layout
        setLayout(new FlowLayout());

        // create the button 
        b = new Button("Back");

        // add it to frame
        add(b);

        // add action listener to button
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        // remove this frame from memory
        this.dispose();
    }
}

class Multiple_frame 
{
    public static void main(String args[])
    {
        // create the frame 
        Frame1 f = new Frame1();
        f.setSize(400,400);
        f.setTitle("My frame");
        f.setVisible(true);
    }
}