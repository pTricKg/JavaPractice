package com.javaPractice.Team;

import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame {

	public TeamFrame() throws IOException {
		Player player;
		Scanner keyboard = new Scanner(new File("Hankees.txt"));
		
		for (int num = 1; num <= 9; num++) {
			player = new Player(keyboard.nextLine(), keyboard.nextDouble());
			keyboard.nextLine();
			addPlayerInfo(player);
		}
		setTitle("The Hankees");
		setLayout(new GridLayout(9, 2, 20, 3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	void addPlayerInfo(Player player) {
		add(new JLabel(" " + player.getName()));
		add(new JLabel(player.getAverageString()));
	}
}
