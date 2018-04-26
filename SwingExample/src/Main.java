import javax.swing.*;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame difficultySelect = new JFrame();
		JLabel label = new JLabel("Score Difficulty: ");
		label.setFont(new Font("Times New Roman",Font.PLAIN,50));
		JRadioButton button1 = new JRadioButton("Easy: 50 points");
		JRadioButton button2 = new JRadioButton("Med: 100 points");
		JRadioButton button3 = new JRadioButton("Hard: full board");
		JButton OKbutton = new JButton("OK");
		
		GridLayout layout = new GridLayout(3,4);
		difficultySelect.setLayout(layout);
		
		ButtonGroup group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		group.add(OKbutton);
		
		difficultySelect.add(label);
		difficultySelect.add(button1);
		difficultySelect.add(button2);
		difficultySelect.add(button3);
		difficultySelect.add(OKbutton);
		difficultySelect.setVisible(true);
		difficultySelect.pack();
		difficultySelect.setLocationRelativeTo(null);
		difficultySelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*JFrame windowFrame = new JFrame("Nathan's Swing Example");
		JTextField textArea = new JTextField();
		textArea.setBounds(50,50,150,20);//(x,y,width,height)

		JTextField textArea2 = new JTextField();
		textArea2.setBounds(50,75,150,20);
		
		JTextField textArea3 = new JTextField();
		textArea3.setBounds(50,100,150,20);
		
		JButton button = new JButton("Click Me");
		button.setBounds(50,150,150,50);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea3.setText(textArea.getText()+textArea2.getText());
			}
		});

		windowFrame.add(textArea);
		windowFrame.add(textArea2);
		windowFrame.add(textArea3);
		windowFrame.add(button);
		windowFrame.setSize(400, 400);
		windowFrame.setLayout(null);
		windowFrame.setVisible(true);
		
		GridLayout layout = new GridLayout(5,1);
		windowFrame.setLayout(layout);
		layout.setHgap(5);
		layout.setVgap(10);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	}
	
}
