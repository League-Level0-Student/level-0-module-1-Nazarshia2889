package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String Ashay = "Ashay is a fast worker.";
	String Darren = "Darren is a strong programmer.";
	String Devin = "Devin is an attentive student.";
	String Andrew = "Andrew is very smart";
	// 2. Ask the user to enter a name. Store their answer in a variable.
	String name = JOptionPane.showInputDialog("What is your name?");

		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if(name.equals("Ashay")) {
	JOptionPane.showMessageDialog(null, Ashay);
	}
	if(name.equals("Darren")) {
		JOptionPane.showMessageDialog(null, Darren);
		}
	if(name.equals("Devin")) {
		JOptionPane.showMessageDialog(null, Devin);
		}
	if(name.equals("Andrew")) {
		JOptionPane.showMessageDialog(null, Andrew);
		}
	}
}

