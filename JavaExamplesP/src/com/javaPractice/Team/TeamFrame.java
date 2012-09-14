package com.javaPractice.Team;

import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame {


	public TeamFrame() throws IOException {  //throw clause for Scanner
		PlayerExt player;
		Scanner keyboard = new Scanner(new File("Hankees.txt"));
		
		//getting errors when for loop condition didn't match .txt file input
		for (int num = 1; num <= 9; num++) {
			player = new PlayerExt(keyboard.nextLine(), keyboard.nextDouble());
			
			keyboard.nextLine();
			
			addPlayerInfo(player);
		}
		
		add(new JLabel());
		add(new JLabel("  -----"));
		add(new JLabel("Team Batting Average:"));
		add(new JLabel(PlayerExt.findTeamAverageString()));
		
		setTitle("The Hankees");
		setLayout(new GridLayout(11, 2, 20, 6));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	void addPlayerInfo(PlayerExt player) {
		add(new JLabel(" " + player.getName()));
		add(new JLabel(player.getAverageString()));
	}
	
}
