// A label is a constant text component that is used to display a single line of read-only text.
// To create a label :
// Label l = new Label("text"); // create an empty label
// Label l = new Label("text",alignment_constant); // create a label with specified alignment
// the alignment constants are : Label.LEFT, Label.RIGHT, Label.CENTER

// program to create a two labels and two text fields for name and password

import java.awt.*;
import java.awt.event.*;

class LabelEg extends Frame implements ActionListener
{
    TextField name, pass;

    LabelEg()
    {
        // set layout to flow layout 
        setLayout(new FlowLayout());

        // create 2 labels 
        Label n = new Label("Name :",Label.LEFT);
        Label p = new Label("Password :",Label.LEFT);   

        // create text fields for name and password
        name = new TextField(20);
        pass = new TextField(20);
        // hide the password by *
        pass.setEchoChar('*');

        // use background, foreground colors and font for name textfield
        name.setBackground(Color.yellow);
        name.setForeground(Color.red);
        Font f = new Font("Arial",Font.PLAIN,25);
        name.setFont(f);

        // add the labels and textfields to frame
        add(n);
        add(name);
        add(p);
        add(pass);

        // add action and textfields to frame
        name.addActionListener(this);
        pass.addActionListener(this);

        // close the frame 
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    // this method is executed when enter is clicked 
    // display the text entered into the text field
    public void actionPerformed(ActionEvent ae)
    {
        // create Graphics class object 
        Graphics g = this.getGraphics();

        g.drawString("Name :"+name.getText(),10,200);
        g.drawString("Password :"+pass.getText(),10,240);
    }

    public static void main(String args[])
    {
        // create the frame
        LabelEg obj = new LabelEg();
        obj.setTitle("My login");
        obj.setSize(400,400);
        obj.setVisible(true);
    }
}