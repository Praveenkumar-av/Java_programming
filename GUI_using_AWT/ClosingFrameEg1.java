// We want to close the frame by clicking the close button
// We should attach a listener to the frame component. All listeners are available in java.awt.event package
// The most suitable to the frame is 'window listener'. It can be attached to the frame by using 
// addWindowListener() method

// creating a frame and closing it
import java.awt.*;
import java.awt.event.*;

class ClosingFrameEg1
{
    public static void main(String args[])
    {
        // cteate a frame with title
        Frame f = new Frame();
        // set a title for the frame 
        f.setTitle("My frame");
        // set the size of the frame
        f.setSize(400, 400);
        // display the frame 
        f.setVisible(true);

        // close the frame 
        f.addWindowListener(new MyClass());
    }
}

class MyClass implements WindowListener 
{
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
}