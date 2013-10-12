package ie.wit.oop;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class HelloWorld extends JFrame {
	private JTable table;
	public HelloWorld() {
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JTextArea textArea_1 = new JTextArea();
		panel.add(textArea_1);
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea);
		
		table = new JTable();
		panel.add(table);
		setBackground(Color.DARK_GRAY);
	}

	public static void main(String[] args) {

		// Display the string of Hello World!
		System.out.println("Hello World !!");
	}

}
