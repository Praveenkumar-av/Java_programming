// This class is useful to create a list box which is similar to choice menu. 
// A list box presents the user with a scolling list of text items.

import java.awt.*;
import java.awt.event.*;

class List_class extends Frame implements ItemListener
{
    int msg[];
    List lst;

    List_class()
    {
        // set flow layout manager
        setLayout(new FlowLayout());

        // create an empty list box that displayed 4 items initially and multiple 
        // selection is also enabled
        lst = new List(4,true);

        // add items to the list box
        lst.add("English");
        lst.add("Hindi");
        lst.add("Telugu");
        lst.add("Sanskrit");
        lst.add("French");

        // add item to the list box
        add(lst);

        // add item listener to the  list box 
        lst.addItemListener(this);

        // frame closing 
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent ie)
    {
        // class the paint() method
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString("Selected languages languages : ",100,200);

        // get the selected items position numbers into msg[]
        msg = lst.getSelectedIndexes();

        // know each selected item's name and display 
        for(int i=0;i<msg.length;i++)
        {
            String item = lst.getItem(msg[i]);
            g.drawString(item,100,220+i*20);
        }
    }

    public static void main(String args[])
    {
        // create the frame
        List_class l = new List_class();
        l.setTitle("my list box");
        l.setSize(400,400);
        l.setVisible(true);
    }
}