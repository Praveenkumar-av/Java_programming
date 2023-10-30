// Check box 

import java.awt.*;
import java.awt.event.*;

class CheckBox extends Frame implements ItemListener
{
    String msg="";
    Checkbox c1, c2, c3;

    CheckBox()
    {
        // set the layout manager
        setLayout(new FlowLayout());

        // display 3 checkboxes
        c1 = new Checkbox("Bold",true);  // if state is true, the item is selected by default
        c2 = new Checkbox("Italic");
        c3 = new Checkbox("Underline");

        // add the checkbox to the frame
        add(c1);
        add(c2);
        add(c3);

        // add the check box to the frame 
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        // close the frame
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    // this method is called the user clicks on a check box
    public void itemStateChanged(ItemEvent ie)
    {
        repaint(); // call the paint() method
    }

    // display the current state of check box
    public void paint(Graphics g)
    {
        g.drawString("Current state :",10,100);
        msg = "Bold :"+c1.getState();
        g.drawString(msg,10,120);
        msg = "Italic :"+c2.getState();
        g.drawString(msg,10,140);
        msg = "Underline :"+c3.getState();
        g.drawString(msg,10,160);
    }

    public static void main(String args[])
    {
        // create the frame
        CheckBox c = new CheckBox();
        c.setTitle("My checkbox");
        c.setSize(400,400);
        c.setVisible(true);
    }
}