package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");

		if(riddle.equalsIgnoreCase("a stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong, it was a stamp!");
		}
		JOptionPane.showMessageDialog(null, "Your score: " + score);
		
		String riddle2 = JOptionPane.showInputDialog(null, "I'm tall when I'm young and I'm short when I'm old. What am I?");
		if(riddle2.equalsIgnoreCase("a candle")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong, it was a candle!");
		}
		JOptionPane.showMessageDialog(null, "Your score: " + score);
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
		
	}
}

