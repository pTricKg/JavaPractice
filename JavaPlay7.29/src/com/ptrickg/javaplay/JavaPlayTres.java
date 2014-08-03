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

	public JavaComponentTres(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
