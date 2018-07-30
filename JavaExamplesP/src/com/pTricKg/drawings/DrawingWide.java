package com.pTricKg.drawings;

import java.awt.Graphics;
import com.pTricKg.drawings.Drawing;

public class DrawingWide extends Drawing{
	int width = 100, height = 30;
	
	public void paint(Graphics g) {
		g.drawOval(x, y, width, height);
	}
}
