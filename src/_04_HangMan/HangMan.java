package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JLabel lifeCount = new JLabel();
	Stack<String> words = new Stack<String>();
	Utilities utility = new Utilities();
	char key;
	int lives;
	String guessing;
	String word;
	int wordCount=0;
	public static void main(String[] args) {
HangMan bob = new HangMan();
bob.createUI();

	}

	public void createUI() {
		f.add(p);
		p.add(l);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.addKeyListener(this);
		
		
		f.pack();
		}
	public void setWords() {
		String numwords = JOptionPane.showInputDialog("How many words do you want to guess?");
		int wordsGuessing = Integer.parseInt(numwords);
		for (int i = 0; i < wordsGuessing; i++) {
			String random = utility.readRandomLineFromFile("dictionary.txt");
			if (!words.contains(random)) {
			words.push(utility.readRandomLineFromFile("dictionary.txt"));
			}
			else {
				i--;
			}
			}
	}
	public void newWord() {
		
		lives=10;
		lifeCount.setText("Lives remaining: " +lives);
			 word = words.pop();
			guessing = "";
			for (int i = 0; i < word.length(); i++) {
				guessing = guessing + "_";
			}
		l.setText(guessing);
	wordCount++;
	}
	public void tryLetter(char k) {
		int count;
	count=0;
	System.out.println(word);
	for (int j = 0; j < word.length(); j++) {
		if(k==word.charAt(j)) {
			guessing.replace(guessing.charAt(j), k);
			l.setText(guessing);
			System.out.println(guessing);
		}
		else {
			count++;
		}
		if (count==word.length()) {
			lives--;
			lifeCount.setText("Lives remaining: " +lives);
		}
		
	}
	}
	public void checkFinished() {
		
	}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	 key = e.getKeyChar();
System.out.println(key);
tryLetter(key);

}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}