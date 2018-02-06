import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame windowFrame = new JFrame("Nathan's Swing Example");
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
		
	}
	
}
