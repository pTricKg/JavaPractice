
/**
 * Write a description of class XYMouse here.
 * 
 * @author (your name) 
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

            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            frame.add(panel);
            panel.addMouseListener(new MouseAdapter() {// empty implementation of all
                    // MouseListener`s methods
                    @Override //I override only one method for presentation
                    public void mousePressed(MouseEvent e) {
                        System.out.println(e.getX() + "," + e.getY());
                    }
                });
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200, 200);
            frame.setVisible(true);

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