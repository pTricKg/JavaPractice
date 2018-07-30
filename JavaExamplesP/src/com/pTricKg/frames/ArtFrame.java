package com.pTricKg.frames;

import java.awt.Graphics;
import javax.swing.JFrame;
import com.pTricKg.drawings.Drawing;

public class ArtFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	Drawing drawing;
	
	public ArtFrame(Drawing drawing) {
		this.drawing = drawing;
		setTitle("Abstract Art");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		drawing.paint(g);
	}
}
