// Catching which key is pressed

import java.awt.*;
import java.awt.event.*;

class Key_pressed extends Frame implements KeyListener
{
    TextArea ta;
    String msg = "";

    Key_pressed()
    {
        // set flow layout
        setLayout(new FlowLayout());

        // create a text area to display the key code
        ta = new TextArea(5,25);

        // set the some font and foreground color to text area
        Font f = new Font("Sanskrit",Font.BOLD,25);
        ta.setFont(f);
        ta.setForeground(Color.red);

        // add text area to frame
        add(ta);

        // add key listener to text area
        ta.addKeyListener(this);

        // close the frame
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void keyPressed(KeyEvent ke)
    {
        // get the code of the pressed 
        int keycode = ke.getKeyCode();
        msg += "\nKey code :"+keycode;

        // get the name of the key from the code 
        String keyname = ke.getKeyText(keycode);
        msg += "\nKey pressed :"+keyname;

        // display the key code and key name in the text area
        ta.setText(msg);
        msg="";
    }

    public void keyTyped(KeyEvent ke)
    {    }

    public void keyReleased(KeyEvent ke)
    {
        // get the code of the pressed 
        int keycode = ke.getKeyCode();
        msg += "\nKey code :"+keycode;

        // get the name of the key from the code 
        String keyname = ke.getKeyText(keycode);
        msg += "\nKey pressed :"+keyname;

        // display the key code and key name in the text area
        ta.setText(msg);
        msg="";
    }

    public static void main(String args[])
    {
        // create the frame
        Key_pressed ks = new Key_pressed();
        ks.setTitle("Catch the key");
        ks.setSize(400,400);
        ks.setVisible(true);
    }
}