package com.ptrickg.javaplay;

// first we import
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author pTricKg
 *
 */

// A Simple program that opens window and displays saying which
// can be moved around via mouse
public class JavaPlay {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Your mind is like a diamond!");
		frame.add(new JavaComponent("Hi there! Click and move me around, please!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLUE);
		//frame.add(new JLabel(new ImageIcon("stTrek.png")));
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

}

// construct JavaComponent
class JavaComponent extends JComponent implements MouseMotionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5054213939082898790L;
	String theSaying;
	int sayX = 125, sayY = 95; // begin coords

	public JavaComponent(String message) {
		theSaying = message;
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		g.drawString(theSaying, sayX, sayY);
		
	}

	public void mouseDragged(MouseEvent e) {
		// save mouse coords and paint saying
		sayX = e.getX();
		sayY = e.getY();

		repaint();
		
	}
	public void mouseMoved(MouseEvent e) {
		//empty for now
	}
}
