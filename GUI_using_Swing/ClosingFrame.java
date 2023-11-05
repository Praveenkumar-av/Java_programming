// Program to terminate an application by clicking on the close button of the frame.

import javax.swing.*;
class ClosingFrame extends JFrame 
{
    public static void main(String args[])
    {
        // create the frame
        ClosingFrame obj = new ClosingFrame();

        // set a title to the frame
        obj.setTitle("My swing frame");

        // set the size of the frame
        obj.setSize(400,400);

        // display the frame
        obj.setVisible(true);

        // close the application upon clicking on close button of the frame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}