import javax.swing.JFrame;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		createAndShowGUI();
	}

	public static void createAndShowGUI() {
		TicTacToeBoard board = new TicTacToeBoard();
		JFrame frame = new JFrame("Tic Tac Toe Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(642, 777);
		frame.setVisible(true);
		frame.add(board);
	}
}
