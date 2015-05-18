import java.util.Random;
import java.util.Scanner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class RandomNum {
  /**
	Generate Random Number from User Input
	for max number and sample frequency.
*/

  private static void gui() {
	// Adding JFrame
	JFrame frame = new JFrame("Random Numbers");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel label = new JLabel("");
	label.setPreferredSize(new Dimension(400, 300));
	frame.getContentPane().add(label, BorderLayout.CENTER);

	frame.pack();
	frame.setVisible(true);
	

}
  public static final void main(String... aArgs){
    log("Generating random numbers from 0 to your input.");

	javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                gui();
            }
        });
	Scanner userIn = new Scanner(System.in);

	String num;
	System.out.print("Enter max number: ");
	num = userIn.next();

	String tm;
	System.out.print("How many random numbers to generate?: ");
	tm = userIn.next();
	
	// Make int from input
	int num1 = Integer.parseInt(num);
	int tim1 = Integer.parseInt(tm);
    
    Random randomGenerator = new Random();
    for (int n = 1; n <= tim1; ++n){
      int randomInt = randomGenerator.nextInt(num1);// use input
      log("Generated : " + randomInt);
    }
    
    log("Done.");

	
  }
  
  private static void log(String aMessage){
    System.out.println(aMessage);
  }
}
