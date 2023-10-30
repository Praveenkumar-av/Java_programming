// Filling with colors
/* To fill any shape with desired colors, first of all we need to set the color using setColor() method
of Graphics class. Then we need to call fillXXX() method of Graphics class, where XXX is the shape.
1. fillRect(int x, int y, int width, int height)
    This method is useful to fill a rectangle with top left corner at (x,y) and having width and
    height specified by width and height parameters.
2. fillOval(int x, int y, int width, int height)
    This method is useful to fill an oval bounded by the rectangle with top left corner at (x,y) and
    having width and height specified by width and height parameters.
3. fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
    This method is useful to fill a rectangle with rounded corners with top left corner at (x,y) and
    having width and height specified by width and height parameters. The rounded corners are
    specified by arcWidth and arcHeight parameters.
4. fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
    This method is useful to fill an arc bounded by the rectangle with top left corner at (x,y) and
    having width and height specified by width and height parameters. The arc starts at startAngle
    and covers arcAngle degrees.
5. fillPolygon(int[] x, int[] y, int n)
    This method is useful to fill a polygon with n. The polygon is specified by the arrays x and y.
6. drawString(String str, int x, int y)
    This method is useful to draw a string str with top left corner at (x,y).
7. setColor(Color c)
    This method is useful to set the color of the graphics context to the specified color c.
8. setFont(Font f)
    This method is useful to set the font of the graphics context to the specified font f.

    To draw any of these shapes, we need paint() method of Component class, which refreshes the
contents automatically when a drawing is displayed.
*/

// drawing a smiling face in a frame with filled colors
import java.awt.*;
import java.awt.event.*;

class FillingWithColors extends Frame 
{
    FillingWithColors()
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
        // set blue color 
        g.setColor(Color.blue);

        // display a rectangle to contain drawing 
        g.fillRect(40,40,200,200);

        // set yellow color
        g.setColor(Color.yellow);

        // face 
        g.fillOval(90,70,80,80);

        // set the black color 
        g.setColor(Color.black);

        // eyes 
        g.fillOval(110,95,5,5);
        g.fillOval(145,95,5,5);

        // nose 
        g.drawLine(130,95,130,115);

        // set the red color
        g.setColor(Color.red);

        // mouth 
        g.fillArc(113,115,35,20,0,-180);
    }

    public static void main(String args[])
    {
        // create a frame 
        FillingWithColors f = new FillingWithColors();

        // set the size and title 
        f.setSize(400,400);
        f.setTitle("My drawing");

        // display the frame 
        f.setVisible(true);
    }
}