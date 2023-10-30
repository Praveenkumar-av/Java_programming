// Radio button

import java.awt.*;
import java.awt.event.*;

class RadioButtons extends Frame implements ItemListener
{
    String msg="";
    CheckboxGroup cbg;
    Checkbox y, n;

    RadioButtons()
    {
        // set the layout manager
        setLayout(new FlowLayout());

        // create checkbox group object
        cbg = new CheckboxGroup();

        // create two radio buttons
        y = new Checkbox("Yes",cbg,true);
        n = new Checkbox("No",cbg,false);

        // add the radio buttons to the frame
        add(y);
        add(n);

        // add the check box to the frame 
        y.addItemListener(this);
        n.addItemListener(this);

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
        msg = "Current selection : ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg,10,100);
    }

    public static void main(String args[])
    {
        // create frame
        RadioButtons c = new RadioButtons();
        c.setTitle("My Radio buttons");
        c.setSize(400,400);
        c.setVisible(true);
    }
}