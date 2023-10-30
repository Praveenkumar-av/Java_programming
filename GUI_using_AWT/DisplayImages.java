// Diplaying Images in the Frame 
/* we can display images like .gif and .jpg files in the frame. For this purpose
1. Load the image file into Image class object by using getImage() method of Toolkit class
    Image img = Toolkit.getDefaultToolkit().getImage("image.gif");
2. Make JVM wait till the image is loaded by using MediaTracker class as:
    MediaTracker track = new MediaTracker(this);
    track.addImage(img,0);
MediaTracker keeps JVM waiting till the image is loaded.
    track.waitForID(0);
3. Display the image by using drawImage() method of Graphics class
    g.drawImage(img,100,100,null);
    Here, 'null' is the ImageObserver object. It is used to track the loading of the image.
    or g.drawImage(img,100,100,200,250,null);
    here 200 and 250 are the width and height of the image.

    To display the image in the title bar of the frame, we can use setIconImage() method of Frame class
    as:
        this.setIconImage(img); 
*/

import java.awt.*;
import java.awt.event.*;
class DisplayImages
{
    public static void main(String args[])
    {
        // creating the frame 
        Images i = new Images();

        // set the size and title 
        i.setSize(500,400);
        i.setTitle("My image");

        // display the same image in the title bar of the frame
        i.setIconImage(Images.img);

        // display the frame 
        i.setVisible(true);
    }
}

class Images extends Frame 
{
    // take a static type Image class object 
    static Image img;

    Images()
    {
        // load the image into Image object
        img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Pictures\\Saved Pictures\\back.jpg");

        // wait till the image is loaded into img object
        MediaTracker track = new MediaTracker(this);

        // add image to MediaTracker 
        track.addImage(img,0);
        try
        {
            // let the JVM wait till the image is loaded completely 
            track.waitForID(0);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        // close the frame 
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        // display the image in the frame at 50, 50 pixels
        g.drawImage(img,50,50,450,350,null);
    }
}