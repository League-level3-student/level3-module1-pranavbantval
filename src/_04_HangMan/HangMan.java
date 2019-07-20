package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	Stack<String> words = new Stack<String>();
	Utilities utility = new Utilities();
	
	public static void main(String[] args) {
HangMan bob = new HangMan();
bob.createUI();
	}

	public void createUI() {
		f.add(p);
		p.add(l);
		f.setVisible(true);
		f.pack();
		
		}
	
	
public void game() {
	String numwords = JOptionPane.showInputDialog("How many words do you want to guess?");
		int wordsGuessing = Integer.parseInt(numwords);
		for (int i = 0; i < wordsGuessing; i++) {
			words.push(utility.readRandomLineFromFile("dictionary.txt"));
	}
	String word = words.pop();
	String word2 = "";
	for (int i = 0; i < word.length(); i++) {
		word2 = word2 + "_";
	}
}
}