package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _02_GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame f = new JFrame();
	JButton add = new JButton();
	JButton view = new JButton();
ArrayList <String> guests = new ArrayList <String>();
String ng;
	public static void main(String[] args) {
		
		_02_GuestBook gb = new _02_GuestBook();
		gb.guests.add("Guest #1: Bob Banders");
		gb.guests.add("Guest #2: Sandy Summers");
		gb.guests.add("Guest #3: Greg Ganders");
		gb.guests.add("Guest #4: Donny Doners");
		gb.UI();
	}
	
	public void UI() {
		
		f.add(add);
		f.add(view);
		add.setText("Add Name");
		view.setText("View Names");
		add.setSize(500,250);
		view.setSize(500,250);
		f.setSize(500, 500);
		f.show(true);
		view.setLocation(0, 0);
		add.setLocation(0, 250);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		System.out.println("a");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bp = (JButton) e.getSource();
		
		if(add==bp) {
		ng= 	JOptionPane.showInputDialog("Add a name to the Guest Book with the following format: Guest#X: name");
		
		guests.add(ng);
		System.out.println("b");
		}
		if(view==bp) {
			JOptionPane.showMessageDialog(null, guests);
			System.out.println("1");
		}
	}
	
	
}
