// Choice class
// Choice class is useful to display a choice menu. It is a pop-up list and
// the user can select only one item from the available items.

import java.awt.*;
import java.awt.event.*;

class Choice_class extends Frame implements ItemListener
{
    String msg;
    Choice ch;

    Choice_class()
    {
        // set flow layout to frame
        setLayout(new FlowLayout());

        // create an empty choice menu
        ch = new Choice();

        // add items to choice menu
        ch.add("English");
        ch.add("Hindi");
        ch.add("Telegu");
        ch.add("Sanskrit");
        ch.add("French");

        //add the choice menu to frame
        add(ch);

        // add item listener to the choice menu
        ch.addItemListener(this);

        // close the frame
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    // this method is called when any item is clicked 
    public void itemStateChanged(ItemEvent ie)
    {
        // call paint() method 
        repaint();
    }

    // display selected item from the choice menu 
    public void paint(Graphics g)
    {
        g.drawString("Selected language : ",10,100);
        msg = ch.getSelectedItem();
        g.drawString(msg,10,120);
    }

    public static void main(String args[])
    {
        // create a frame 
        Choice_class c = new Choice_class();
        c.setTitle("My choice");
        c.setSize(400,400);
        c.setVisible(true);
    }
}