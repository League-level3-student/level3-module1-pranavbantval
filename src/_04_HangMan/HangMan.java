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
	int playAgain;
	int count;
	String guessing2;
	public static void main(String[] args) {
		HangMan bob = new HangMan();
		bob.createUI();
		bob.setup();

	}

	public void createUI() {
		f.add(p);
		p.add(l);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.addKeyListener(this);
		p.add(lifeCount);
	}

	public void setWords() {
		String numwords = JOptionPane.showInputDialog("How many words do you want to guess?");
		int wordsGuessing = Integer.parseInt(numwords);
		for (int i = 0; i < wordsGuessing; i++) {
			String random = utility.readRandomLineFromFile("dictionary.txt");
			if (!words.contains(random)) {
				words.push(utility.readRandomLineFromFile("dictionary.txt"));
			} else {
				i--;
			}
		}
	}

	public void newWord() {

		lives = 10;
		lifeCount.setText("Lives remaining: " + lives);
		word = words.pop();
		guessing = "";
		for (int i = 0; i < word.length(); i++) {
			guessing = guessing + "_";
		}
		l.setText(guessing);
		f.pack();
		System.out.println(word);
	}

	public void tryLetter(char k) {
		guessing2 = "";
		count = 0;
		System.out.println(guessing);
		for (int j = 0; j < word.length(); j++) {
			if (k == word.charAt(j)) {
				guessing2+=k;
				
			} else {
				count++;
				guessing2+=guessing.charAt(j);
			}
			if (count == word.length()) {
				lives--;
				lifeCount.setText("Lives remaining: " + lives);
			}

		}
		guessing=guessing2;
		l.setText(guessing);
		f.pack();
	}

	public void wordFinished() {
		
		if(guessing.equalsIgnoreCase(word)) {
			JOptionPane.showMessageDialog(null, "GOOD JOB");
		
		if(words.size()==0) {
			JOptionPane.showMessageDialog(null, "YOU GOT ALL THE WORDS");
		playAgain=	JOptionPane.showConfirmDialog(null, "Do you want to play again?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Now on to the next word");
			newWord();
		}
		if(playAgain==0) {
			//replace 0 with actual number
			
			
		}
		else {
			//close frame
		}
		}
		else if(lives<=0) {
			JOptionPane.showMessageDialog(null, "GAME OVER");
			playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
			if(playAgain==00) {
				
			}
			else {
				//replace 0 with actual number
			//close frame
			}
		}
	}
	public void setup() {
		setWords();
		newWord();
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