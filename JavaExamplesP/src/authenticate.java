import javax.swing.JOptionPane;


public class authenticate {
	public static void main(String args[]) {
		String username = JOptionPane.showInputDialog("Username");
		String password = JOptionPane.showInputDialog("Password");
		
		if (
			username != null &&
			password != null && 
			(
					(username.equals("pTricKg") && password.equals("yerMomDontWearKnowShoes"))
				)
				)
							{
				JOptionPane.showMessageDialog(null, "You're in, sexy beast");
							}else{
								JOptionPane.showMessageDialog(null, "You're an evildoer! Go away!");
							}
	}
}
