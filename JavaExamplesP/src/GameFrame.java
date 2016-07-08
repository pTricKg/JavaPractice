import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class GameFrame extends JFrame implements ActionListener {
   private static final long serialVersionUID = 1L;
  
   int randomNumber = new Random().nextInt(10) + 1;
   int numGuesses = 0;
   
   JFrame jf = new JFrame();
   JPanel j = new JPanel();
   JTextField textField = new JTextField(5);
   JButton button = new JButton("Guess");
   JLabel label = new JLabel("You've had " + numGuesses + " guesses");
   
   public GameFrame() {
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      jf.setTitle("Guess the Number please ");
      j.setPreferredSize(new Dimension(100,200));
      jf.getContentPane().add(j);
      jf.setLayout(new FlowLayout());
      //Container contentPane = jf.getContentPane();
	  jf.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
      //jf.setComponentOrientation(LEFT_ALLIGNMENT);
      jf.add(textField);
      jf.add(button);
      jf.add(label);
      button.addActionListener(this);
      jf.pack();
      jf.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String textFieldText = textField.getText();

      if (Integer.parseInt(textFieldText)==randomNumber) {
         button.setEnabled(false);
         textField.setText(textField.getText() + " Got it!");
         textField.setEnabled(false);
      } else {
         textField.setText("");
         textField.requestFocus();
      }

      numGuesses++;
      String guessWord = 
          (numGuesses == 1) ? " guess" : " guesses";
      label.setText(numGuesses + guessWord);
   }

}
