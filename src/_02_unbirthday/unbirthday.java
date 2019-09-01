package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday?");
		if(birthday.equals("09/01")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday");
		}
	}

}
