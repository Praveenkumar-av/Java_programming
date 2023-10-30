// Knowing the available fonts in the system

import java.awt.*; 
class KnowingAvailableFonts
{
    public static void main(String args[])
    {
        // get the available fonts in the system 
        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        // display the fonts 
        for(String i: fonts)
            System.out.println(i);
    }
}