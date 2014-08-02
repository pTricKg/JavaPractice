package com.ptrickg.javaplay;

//first we import
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author pTricKg
 *
 */

public class JavaPlayTwo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Your mind is like a diamond!");
		frame.add(new JavaComponentTwo(
				"Hi there! Click and move me around, please!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLUE);
		// frame.add(new JLabel(new ImageIcon("stTrek.png")));
		frame.setSize(400, 400);
		frame.setVisible(true);

	}
}

// construct JavaComponent
class JavaComponentTwo extends JComponent implements MouseMotionListener,
		ActionListener {  // implement additional ActionListener

	/**
	 * 
	 */
	private static final long serialVersionUID = -5054213939082898790L;
	String theSaying;
	int sayX = 125, sayY = 95; // begin coords
	
	//Add button
	JButton mButton;
	
	int colorIndex; // yeah
	static Color[] someColor = {Color.red, Color.green, Color.magenta};

	public JavaComponentTwo(String message) {
		theSaying = message;
		mButton = new JButton("Change color"); // button picker for color
		setLayout(new FlowLayout());
		add(mButton);
		mButton.addActionListener(this);
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
		// empty for now
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == mButton) changeColor();

	}
	
	synchronized private void changeColor() {
		if (++colorIndex == someColor.length)
			colorIndex = 0;
		setForeground(currentColor()); // put new color on
		repaint();
	}
	
	synchronized private Color currentColor() {
		return someColor[colorIndex];
	}
}
