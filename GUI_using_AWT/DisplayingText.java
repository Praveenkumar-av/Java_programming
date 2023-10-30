// Displaying text in the frame 
/* To display some text or strings in the frame, we can take help of drawstring() method 
of Graphics class as :
    g.drawstring("Hello",x,y)
Here, 'Hello' will be displayed starting from coordinates(x,y)
If we want to set the color of the text, we can use setColor() method of Graphics class as:
There are two ways to set the color of the text:
    1. By using the predefined colors of Color class as:
        g.setColor(Color.red)
    All the standard colors are available in Color class. Some of them are:
        Color.red, Color.blue, Color.green, Color.yellow, Color.black, Color.white, Color.gray,
    Color.pink, Color.cyan, Color.magenta, Color.orange, Color.darkGray, Color.lightGray
    2. By using the RGB values as:
        g.setColor(new Color(255,0,0))  // red
If we want to set the font of the text, we can use setFont() method of Graphics class as:
    g.setFont(Font object)
Here, Font object can be created as:
    Font f = new Font("Arial",Font.BOLD,20)
Here, 'Arial' is the font name, Font.BOLD is the style and 20 is the size of the font.
    The style can be Font.PLAIN, Font.BOLD, Font.ITALIC, Font.BOLD+Font.ITALIC
    The size can be any integer value.
*/

// Frame with background color and text
import java.awt.*;
import java.awt.event.*;

class DisplayingText extends Frame
{
    DisplayingText()
    {
        // close the frame
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        // set the background for frame 
        this.setBackground(new Color(100,20,20));

        // set the font for text 
        Font f = new Font("Arial",Font.BOLD+Font.ITALIC,20);
        g.setFont(f);

        // set the foreground color for text 
        g.setColor(Color.green);

        // display the text 
        g.drawString("Hello, How are u?",100,100);
    }

    public static void main(String args[])
    {
        // create a frame 
        DisplayingText d = new DisplayingText();

        // set the size and title of the frame 
        d.setSize(400,400);
        d.setTitle("My text");

        // display the frame 
        d.setVisible(true);
    }
}