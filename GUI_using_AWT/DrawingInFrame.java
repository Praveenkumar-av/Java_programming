// Graphics class of java.awt package is used to draw shapes.
/* Methods in graphics class 
1. drawLine(int x1, int y1, int x2, int y2)
    This method is useful to draw a line connecting (x1,y1) and (x2,y2)
2. drawRect(int x, int y, int width, int height)
    This method is useful to draw a rectangle with top left corner at (x,y) 
    and having width and height specified by width and height parameters.
3. drawOval(int x, int y, int width, int height)
    This method is useful to draw an oval bounded by the rectangle with top 
    left corner at (x,y) and having width and height specified by width and 
    height parameters.
4. drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
    This method is useful to draw a rectangle with rounded corners with top 
    left corner at (x,y) and having width and height specified by width and 
    height parameters. The rounded corners are specified by arcWidth and 
    arcHeight parameters.
5. drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
    This method is useful to draw an arc bounded by the rectangle with top 
    left corner at (x,y) and having width and height specified by width and 
    height parameters. The arc starts at startAngle and covers arcAngle 
    degrees.
6. drawPolygon(int[] x, int[] y, int n)
    This method is useful to draw a polygon with n. The polygon is 
    specified by the arrays x and y.
7. drawString(String str, int x, int y)
    This method is useful to draw a string str with top left corner at (x,y).
8. setColor(Color c)
    This method is useful to set the color of the graphics context to the 
    specified color c.
9. setFont(Font f)
    This method is useful to set the font of the graphics context to the 
    specified font f.

    To draw any of these shapes, we need paint() method of Component class, which refreshes the
contents automatically when a drawing is displayed.
    The paint() method is automatically called when a frame is created and displayed.

*/

// drawing a smiling face in a frame
import java.awt.*;
import java.awt.event.*;

class DrawingInFrame extends Frame
{
    DrawingInFrame()
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

    // to refresh the frame contents 
    public void paint(Graphics g)
    {
        // set the color for drawing 
        g.setColor(Color.blue);

        // display a rectangle to contain drawing 
        g.drawRect(40,40,200,200);

        // face 
        g.drawOval(90,70,80,80);

        // eyes 
        g.drawOval(110,95,5,5);
        g.drawOval(145,95,5,5);

        // nose 
        g.drawLine(130,95,130,115);

        // mouth 
        g.drawArc(113,115,35,20,0,-180);
    }

    public static void main(String args[])
    {
        // create a frame 
        DrawingInFrame d = new DrawingInFrame();

        // set the size and the title 
        d.setSize(400,400);
        d.setTitle("My drawing");

        // display the frame
        d.setVisible(true);
    }
}