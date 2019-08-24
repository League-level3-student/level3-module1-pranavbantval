package _06_Intro_To_Hash_Maps;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 * */
	HashMap<Integer,String> names= new HashMap<Integer, String>();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	String x;
	public void createUI() {
		f.add(p);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		p.add(button1);
		p.add(button2);
		p.add(button3);
		p.add(button4);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button1.setText("Button 1");
		button2.setText("Button 2");
		button3.setText("Button 3");
		button4.setText("Button 4");
		f.setVisible(true);
		f.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b==button1) {
		Integer key = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number"));
		String value = JOptionPane.showInputDialog("Enter a name");
		names.put(key, value);
		}
		else if(b==button2) {
			Integer code = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number"));
			if(names.get(code)!=null) {
				JOptionPane.showMessageDialog(null, names.get(code));
			}
			else {
				JOptionPane.showMessageDialog(null, "That entry does not exist");
			}
			
		}
		else if(b==button3) {
			for (Integer i : names.keySet()) {
			 x=	"ID: "+ i + " Name: "+ names.get(i);
				
			}
		}
		else if(b==button4) {
			Integer code = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number"));
			if(names.get(code)!=null) {
				names.remove(code);
			}
			else {
				JOptionPane.showMessageDialog(null, "That entry does not exist");
			}
			
		}

	}
	public static void main(String[] args) {
		_02_LogSearch ls= new _02_LogSearch();
		ls.createUI();
	}
}
