// Scroll bar is useful to create scrollbar that can be attached to a frame or
// text area. scrollbars are used to select continuous values between a spedified 
// minimum and maximum. Scrollbars can be arranged vertically or horizontally.

// creating a vertical scrollbar
import java.awt.*;
import java.awt.event.*;

class Scroll_bar extends Frame implements AdjustmentListener
{
    String msg = "";
    Scrollbar s1;

    Scroll_bar()
    {
        // do not set any layout
        setLayout(null);

        // create a vertical scrollbar 
        s1 = new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);

        // set the location of scrollbar in the frame
        s1.setBounds(250,50,30,200);

        // add it to frame
        add(s1);

        // add adjustment listener to scrollbar
        s1.addAdjustmentListener(this);

        // frame closing
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        repaint();  // call paint()
    }

    public void paint(Graphics g)
    {
        // display the position of scrollbar
        g.drawString("SCROLLBAR POSITION :",20,150);
        msg += s1.getValue();
        g.drawString(msg,20,180);
        msg = "";
    }

    public static void main(String args[])
    {
        // create the frame
        Scroll_bar s = new Scroll_bar();
        s.setTitle("My scroll bar");
        s.setSize(400,400);
        s.setVisible(true);
    }
}