
/**
 * Write a description of class XYMouse here.
 * 
 * @author pTricKg
 * @version (a version number or a date)
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GetMouseXY extends JPanel
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 1;

        while (x > 0 && y > 0)
        {
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            x = (int) b.getX();
            y = (int) b.getY();
            System.out.println("x" + x  + ":" + "y" + y);

            
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            if (x < 1 && y < 1) {
                Thread.currentThread().interrupted();
            }
        }
    }
}