package com.javaPractice.pTricKg;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class SimpFrame extends JFrame {
	
	public SimpFrame() {
		setTitle("Beware of the button!");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Panic"));
		setSize(350, 150);
		setVisible(true);
	}

	
}
