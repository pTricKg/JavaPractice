
/**
 * Write a description of class GetMouseClickXY here.
 * 
 * @author pTricKg
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;

public class GetMouseClickXY
{
    public static void main(String[] s) {
        JFrame frame = new JFrame("MouseClicksXY");
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.addMouseListener(new MouseAdapter() {
        //      MouseListener
                @Override //I override only one method for presentation
                public void mousePressed(MouseEvent e) {
                    System.out.println("X is: " + e.getX() + "  " + "Y is: " + e.getY());
                }
            });
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setVisible(true);

    }
}
