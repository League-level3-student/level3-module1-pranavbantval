package _03_IntroToStacks;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 *
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 *
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	String text = "";
	Stack<Character> deletedchars = new Stack<Character>(); 
	public static void main(String[] args) {
		_02_TextUndoRedo x = new _02_TextUndoRedo();
		x.createUI();

	}

	public void createUI() {
		
		f.add(p);
		p.add(l);
		f.setVisible(true);
		f.pack();
		f.addKeyListener(this);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int k = e.getKeyCode();
		char key = e.getKeyChar();
		
		if(e.getKeyChar()==KeyEvent.VK_BACK_SPACE) {
			deletedchars.push(text.charAt(text.length()-1));
		}
		if(e.getKeyChar()==KeyEvent.VK_UP) {
			char undo = deletedchars.pop();
			System.out.println("up");
			text += undo;
		}
		
			System.out.println(key);
		text = text + key;
		l.setText(text);

	}
}
