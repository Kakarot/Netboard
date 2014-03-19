package gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Main extends JFrame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame = new Main ("Whiteboard");
frame.setVisible(true);

		
	}

	public Main(String title){
		super(title);
	//	WindowUtilities.setNativeLookAndFeel();
		
		setSize(300, 100);
		Container content = getContentPane();
		content.setBackground(Color.WHITE);
		content.setLayout(new FlowLayout()); 
		content.add(new JButton("Button 1"));
		content.add(new JButton("Button 2"));
		content.add(new JButton("Button 3"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		} 
	}
