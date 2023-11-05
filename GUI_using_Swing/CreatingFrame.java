// Frame in Swing
/* Frame represents a window with a title bar and borders. Frame becomes the basis for
for creating the screen for an applovcation because all the components go into the frame
To create a frame, we have to create an object to the JFrame class in swing as:
    JFrame jf = new JFrame(); // create a frame with no title
    JFrame jf = new JFrame("My Frame"); // create a frame with title
    JFrame jf = new JFrame("My Frame",true); // create a frame with title and resizable
*/

import javax.swing.*;

class CreatingFrame
{
    public static void main(String args[])
    {
        // create a frame with title 
        JFrame obj = new JFrame("My frame");

        // set the size to 200 by 200 px
        obj.setSize(400,400);

        // display the frame
        obj.setVisible(true);
    }
}

/* The frame generated by the pragram will be terminated from memory when the close button is clicked by 
the user, but the application will  not terminate. To terminate th application forcibly, 
Press control+C in DOS. */