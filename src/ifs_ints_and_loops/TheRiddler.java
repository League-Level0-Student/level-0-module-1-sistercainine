package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer=JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
		"Who buys it, has no use for it. \r\n" + 
		"Who uses it can neither see nor feel it. \r\n" + 
		"What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equalsIgnoreCase("coffin")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score=score+1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null, "wrong! the answer was coffin");}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "your score is "+score);
	}
	}

