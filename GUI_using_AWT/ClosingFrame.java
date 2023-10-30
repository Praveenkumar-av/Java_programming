// Closing the file using anonymous inner class 
import java.awt.*;
import java.awt.event.*;

class ClosingFrame 
{
    public static void main(String args[])
    {
        // create a frame with title 
        Frame f = new Frame("My Frame");
         
        // set the size of the frame
        f.setSize(400,400);

        // display the frame 
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}