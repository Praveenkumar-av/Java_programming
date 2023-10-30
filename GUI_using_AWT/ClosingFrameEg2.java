// In the previous example we had to all the methods of windowListener interface, just for the 
// sake of one method. There is another way to esacape this. 
// There is a class windowAdapter in java.awt.event package, that contains all the methods of
// windowListener interface with an empty implementation (body). If we extend MyClass from 
// WindowAdapter class, then we need not write all the methods with empty implementation. 

// creating a frame and closing it
import java.awt.*;
import java.awt.event.*;

class ClosingFrameEg2 extends Frame 
{
    public static void main(String args[])
    {
        // create a frame with title 
        ClosingFrameEg2 f = new ClosingFrameEg2();

        // set a title for the frame 
        f.setTitle("My frame");

        // set the size of the frame 
        f.setSize(300,250);

        // display the frame 
        f.setVisible(true);

        // close the frame 
        f.addWindowListener(new MyClass());
    }
}

class MyClass extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}