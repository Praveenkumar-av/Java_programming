// Push buttons
// A push button is useful to perform a particular actions.

// To create a push button with a label, we can create an object to Button class as:
// Button b = new Button();  -> a button without any label is created.
// Button b = new Button("label"); -> a button with label is created.\

// To get the label of the button : String l = b.getLabel();
// To set the label of the button : b.setLabel("label");

// To know which button is clicked by the user, getActionCommand() method of 
// ActionEvent class is useful.
// String s = ae.getActionCommand();
// here, s represents the label of the button clicked by the user.

// To know the source object which has been clicked by the user, we can use 
// getSource() method of the ActionEvent class as :
// Object obj = ae.getSource();

// program to set the background based on the button clicked without any layout - version 1

import java.awt.*;
import java.awt.event.*;

class PushButtons1 extends Frame implements ActionListener
{
    // vars
    Button b1, b2, b3;

    PushButtons1()
    {
        // do not set any layout    
        this.setLayout(null);

        // create 3 push buttons
        b1 = new Button("Yellow"); 
        b2 = new Button("Blue"); 
        b3 = new Button("Pink"); 

        // set the locations of buttons in the frame
        b1.setBounds(100,100,70,40);
        b2.setBounds(100,160,70,40);
        b3.setBounds(100,220,70,40);

        // add the buttons to the frame
        this.add(b1);
        this.add(b2);
        this.add(b3);

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
        // know the label of the button clicked by the user
        String str = ae.getActionCommand();

        // change the frames's background color depending on the button clicked
        if(str.equals("Yellow")) this.setBackground(Color.yellow);
        if(str.equals("Blue")) this.setBackground(Color.blue);
        if(str.equals("Pink")) this.setBackground(Color.pink);
    }

    public static void main(String args[])
    {
        // create the frame 
        PushButtons1 b = new PushButtons1();
        b.setSize(400,400);
        b.setTitle("My buttons");
        b.setVisible(true);
    }
}