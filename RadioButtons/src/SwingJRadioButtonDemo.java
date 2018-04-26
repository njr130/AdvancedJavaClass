import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
 
public class SwingJRadioButtonDemo extends JFrame {
 
    public SwingJRadioButtonDemo() {
        super("Swing JRadioButton Demo");
        JLabel j = new JLabel("This is text");
        JRadioButton option1 = new JRadioButton("Linux");
        JRadioButton option2 = new JRadioButton("Windows");
        JRadioButton option3 = new JRadioButton("Macintosh");
        JButton OKbutton = new JButton("OK");
        JLabel j2 = new JLabel("this is text 2");
        JRadioButton option4 = new JRadioButton("Linux");
        JRadioButton option5 = new JRadioButton("Windows");
        JRadioButton option6 = new JRadioButton("Macintosh");
        JButton OKbutton2 = new JButton("OK");
        
        j.setFont(new Font("Times New Roman",Font.PLAIN,50));
        j2.setFont(new Font("Times New Roman",Font.PLAIN,50));
        option1.setFont(new Font("Times New Roman",Font.PLAIN,50));
        GridLayout layout = new GridLayout(4,3);
        
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(OKbutton);
        
        group.add(option4);
        group.add(option5);
        group.add(option6);
        group.add(OKbutton2);
        
        
       
        setLayout(layout);
        add(j);
        add(option1);
        add(option2);
        add(option3);
        add(OKbutton);
        add(j2);
        add(option4);
        add(option5);
        add(option6);
        add(OKbutton2);
        pack();
       /* OKbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (option1.isSelected()) {
        			System.out.println("option 1");
        		}
        		if (option2.isSelected()) {
        			System.out.println("option 2");
        		}
        		if (option3.isSelected()) {
        			System.out.println("option 3");
        		}
			}
        });
        */pack();
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                new SwingJRadioButtonDemo().setVisible(true);
            }
        });
    }
}