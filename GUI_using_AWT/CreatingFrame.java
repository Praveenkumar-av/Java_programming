/* A frame becomes a basic component in AWT.
 There are three ways to create a frame 
 1.Create an instance of Frame class directly
    Frame f = new Frame()
 2.Create a Frame class Object and pass its title also
    Frame f = new Frame("My Frame")
 3. Create a Object to subclass of a Frame class
    class MyFrame extends Frame
    MyFrame mf = new MyFrame()
 Create a Frame class Object and pass its title and boolean value
    Frame f = new Frame("My Frame",true)
 The boolean value is used to specify whether the frame is resizable or not.
 The default value is true.

    The default height and width of the frame is 0 pixels.
    The size of the frame can be modified by setSize() method
    f.setSize(400,400)
    The frame can be made visible by using setVisible() method
    f.setVisible(true)
*/

// creting a frame using Frame class - version 1
import java.awt.*;
class CreatingFrame
{
    public static void main(String args[])
    {
        // create a frame
        Frame f = new Frame();
        // set the size of the frame
        f.setSize(300,250);
        // display the frame
        f.setVisible(true);
    }
}

// Creating a frame - version 2
class MyFrame extends Frame 
{
    MyFrame(String str)
    {
        super(str);
    }

    public static void main(String args[])
    {
        // create a frame with title 
        MyFrame f = new MyFrame("My AWT frame");
        // set the size of the frame 
        f.setSize(500,300);
        // display the frame
        f.setVisible(true);
    }
}