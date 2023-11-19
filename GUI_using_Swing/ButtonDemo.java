// Creating a push button with all features

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class ButtonDemo extends JFrame
{
    JButton b;

    ButtonDemo()
    {
        // create container
        Container c = getContentPane();
        // set a layout for the container
        c.setLayout(new FlowLayout());

        // store the image into the ImageIcon object
        ImageIcon ii = new ImageIcon("C:\\Users\\Admin\\Pictures\\Saved Pictures\\back1.jpg");
        // set the button with the image
        b = new JButton("Click me",ii);

        // set the background and foreground colors for the button 
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);

        // set the font for the label of button 
        b.setFont(new Font("Arial",Font.BOLD,30));

        // set bevel border for button
        Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);

        // set tool tip text for the button 
        b.setToolTipText("This is a button");

        // set a short cut key for button. Alt+C from keyboard will invoke the button 
        b.setMnemonic('C');

        // add the button to the container
        c.add(b);

        // close the frame upon clicking
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        // create a frame
        ButtonDemo b = new ButtonDemo();

        // set the title and size for frame
        b.setTitle("My button");

        b.setSize(500,400);

        // display the frame
        b.setVisible(true);
    }
}