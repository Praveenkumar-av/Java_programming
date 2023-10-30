// Drawing the house 
import java.awt.*;
import java.awt.event.*;

class DrawingHouse extends Frame
{
    DrawingHouse()
    {
        this.addWindowListener(new WindowAdapter()
        {
            public void windowActivated(WindowEvent e)
            {
                System.out.println("Window avtivated");
            }
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Closing");
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        // set the background for frame 
        this.setBackground(Color.gray);

        // set yellow color for rectangle - house 
        g.setColor(Color.yellow);
        g.fillRect(300,200,150,100);

        // set blue color for another rectangle - door 
        g.setColor(Color.blue);
        g.fillRect(350,210,50,60);

        // draw a line - line below the door 
        g.drawLine(350,280,400,280);

        // store x,y coordinates in x[] and y[]
        int x[] = {375,275,475};
        int y[] = {125,200,200};
        int n = 3; // no. of pairs

        // set dark gray for polygon - roof 
        g.setColor(Color.darkGray);
        g.fillPolygon(x,y,n);

        // set cyan color for oval - moon 
        g.setColor(Color.cyan);
        g.fillOval(100,100,60,60);

        // set green colors for arcs - grass
        g.setColor(Color.green);
        g.fillArc(50,250,150,100,0,180);
        g.fillArc(150,250,150,100,0,180);
        g.fillArc(450,250,150,100,0,180);

        // draw a line - the bottom most line of drawing
        g.drawLine(50,300,600,300);

        // display some text 
        g.drawString("My Happy Home",275,350);
    }

    public static void main(String args[])
    {
        // create a frame
        DrawingHouse d = new DrawingHouse();

        // set the size and title 
        d.setSize(600,400);
        d.setTitle("My house");

        // display the frame 
        d.setVisible(true);
    }
}