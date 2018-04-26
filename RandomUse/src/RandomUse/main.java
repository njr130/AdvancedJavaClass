package RandomUse;
import javax.swing.JFrame;
public class main {
	public static void main (String args[]) {
		JFrame f = new JFrame();
		second sec = new second();
		f.add(sec);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
	}
}
