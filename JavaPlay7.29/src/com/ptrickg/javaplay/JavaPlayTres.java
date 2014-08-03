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
