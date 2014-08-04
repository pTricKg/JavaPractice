package com.ptrickg.javaplay;

//first we import
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
* @author pTricKg
*
*/


public class JavaPlayTres {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JavaPlayTres");
		frame.add(new JavaComponentTres("What the FRACK!!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}

@SuppressWarnings("serial")
class JavaComponentTres extends JComponent implements MouseMotionListener, ActionListener,
	Runnable {
	
	String theSaying;
	int messageX = 125, messageY = 95;  // coords
	
	JButton mButton;
	int colorIndex;
	
	// array of colors
	static Color[] someColor = {
		Color.black, Color.blue, Color.cyan, Color.green, Color.gray
	};
	
	// new
	boolean mBlink;

	public JavaComponentTres(String message) {
		theSaying = message;
		mButton = new JButton("Push me to change Color");
		setLayout(new FlowLayout());
		add(mButton);
		mButton.addActionListener(this);
		addMouseMotionListener(this);
		Thread t = new Thread(this);
		t.start();
		
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(mBlink ? getBackground() : currentColor());
		g.drawString(theSaying, messageX, messageY);
	}

	@Override
	public void run() {
		try {
			while(true) {
				mBlink = !mBlink; // toggle state
				repaint(); // show change
				Thread.sleep(300);
			}
		}catch (InterruptedException ie) {	}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		messageX = e.getX();
		messageY = e.getY();
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
