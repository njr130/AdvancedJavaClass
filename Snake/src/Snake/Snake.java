package Snake;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Snake {
	
	public static void main(String[] args) {
		JFrame difficultySelect = new JFrame();
		JLabel label = new JLabel("Score Difficulty: ");
		label.setFont(new Font("Times New Roman",Font.PLAIN,30));
		JRadioButton button1 = new JRadioButton("Easy: 25 points");
		JRadioButton button2 = new JRadioButton("Med: 50 points");
		JRadioButton button3 = new JRadioButton("Hard: full board");
		button1.setFont(new Font("Times New Roman",Font.PLAIN,30));
		button2.setFont(new Font("Times New Roman",Font.PLAIN,30));
		button3.setFont(new Font("Times New Roman",Font.PLAIN,30));
		JLabel label2 = new JLabel("Speed Difficulty: ");
		label2.setFont(new Font("Times New Roman",Font.PLAIN,30));
		JRadioButton button4 = new JRadioButton("Slow");
		JRadioButton button5 = new JRadioButton("Med");
		JRadioButton button6 = new JRadioButton("Fast");
		button4.setFont(new Font("Times New Roman",Font.PLAIN,30));
		button5.setFont(new Font("Times New Roman",Font.PLAIN,30));
		button6.setFont(new Font("Times New Roman",Font.PLAIN,30));
		JButton OKbutton = new JButton("OK");
		OKbutton.setFont(new Font("Times New Roman",Font.PLAIN,30));
		
		GridLayout layout = new GridLayout(0,4);
		difficultySelect.setLayout(layout);
		
		ButtonGroup group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		group.add(OKbutton);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(button4);
		group2.add(button5);
		group2.add(button6);
		group2.add(OKbutton);
		
		difficultySelect.add(label);
		difficultySelect.add(button1);
		difficultySelect.add(button2);
		difficultySelect.add(button3);
		difficultySelect.add(label2);
		difficultySelect.add(button4);
		difficultySelect.add(button5);
		difficultySelect.add(button6);
		difficultySelect.add(OKbutton);
		difficultySelect.setVisible(true);
		difficultySelect.pack();
		difficultySelect.setLocationRelativeTo(null);
		difficultySelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		OKbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int scoreDifficulty = 0;
				int speedDifficulty=0;
				// TODO Auto-generated method stub
				if (button1.isSelected()) {
					scoreDifficulty = 25;
				} else if (button2.isSelected()) {
					scoreDifficulty= 50;
				} else if (button3.isSelected()) {
					scoreDifficulty= 400;
				} else {
					scoreDifficulty=25;
				}
				
				if (button4.isSelected()) {
					speedDifficulty = 150;
				} else if (button5.isSelected()) {
					speedDifficulty= 100;
				} else if (button6.isSelected()) {
					speedDifficulty= 50;
				} else {
					speedDifficulty= 150;
				}
				
				difficultySelect.dispose();
				
				
				JFrame frame = new JFrame();
				Board board = new Board(scoreDifficulty,speedDifficulty);
				frame.add(board);
				frame.setVisible(true);
				frame.setResizable(false);
				frame.pack();
				frame.setTitle("Snake");
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
	}

}
