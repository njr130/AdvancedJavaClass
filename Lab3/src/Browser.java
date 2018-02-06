import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class Browser {

	public static void main(String[] args){
		JEditorPane browserPane1 = new JEditorPane();
		browserPane1.setEditable(false);
		
		JEditorPane browserPane2 = new JEditorPane();
		browserPane2.setEditable(false);
			
		JTabbedPane tabbed = new JTabbedPane();
		
		JTextField url = new JTextField();
		url.setBounds(70,0,200,30);
		
		JButton button = new JButton("GO");
		button.setBounds(270,0,70,30);
		
		JButton backButton = new JButton("BACK");
		backButton.setBounds(0,0,70,30);
		
		JTextField url2 = new JTextField();
		url2.setBounds(70,0,200,30);
		
		
		JButton button2 = new JButton("GO");
		button2.setBounds(270,0,70,30);
		
		JButton backButton2 = new JButton("BACK");
		backButton2.setBounds(0,0,70,30);
		
		JTextField backURL = new JTextField();
		backURL.setVisible(false);
		
		
		url.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backURL.setText(url.getText());
			}
		});
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					browserPane1.setPage(backURL.getText());
				} catch (IOException e1) {
					System.out.println("error loading page");
					System.out.println(backURL.getText());
				}
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					browserPane1.setPage(url.getText());
				} catch (IOException e1) {
					System.out.println("error loading page");
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					browserPane2.setPage(url2.getText());
				} catch (IOException e1) {
					System.out.println("error loading page");
				}
			}
		});
		
		try {
		  browserPane1.setPage("http://google.com");
		  browserPane2.setPage("http://graceland.brightspace.com");
		  url.setText("http://google.com");
		  url2.setText("http://graceland.brightspace.com");
		}catch (IOException e) {
			System.out.println("error loading page");
		}
		
		

		JFrame browserWindow = new JFrame("Nathan's Web Browser");
		browserPane1.add(button);
		browserPane1.add(url);
		browserPane1.add(backButton);
		browserPane1.add(backURL);
		browserPane2.add(button2);
		browserPane2.add(url2);
		browserPane2.add(backButton2);
		tabbed.addTab("Tab 1",browserPane1);
		tabbed.addTab("Tab 2",browserPane2);
		browserWindow.add(tabbed);
		browserWindow.setSize(1200,900);
		browserWindow.setVisible(true);
		browserWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
