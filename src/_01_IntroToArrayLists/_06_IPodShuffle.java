package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	JFrame f = new JFrame();
	JButton b = new JButton();
	Song song;
	ArrayList<String> songs;
	Random r;

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		song = new Song("demo.mp3");
		songs = new ArrayList<String>();

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		songs.add("Africa.mp3");
		songs.add("Shrekophone.mp3");
		songs.add("The_Duck_Song.mp3");
		r = new Random();
		f.add(b);
		f.show(true);
		b.setText("Surpise me!");
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		b.addActionListener(this);
	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bp = (JButton) e.getSource();

		if (b == bp) {
		song.stop();
			song = new Song(songs.get(r.nextInt(3)));
			song.play();
		}
	}
}