import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel{
	
	int titleFontSize = 36;
	ArrayList<DrawnX> xList = new ArrayList<DrawnX>();
	ArrayList<DrawnO> oList = new ArrayList<DrawnO>();
	boolean check = true;
	
	public TicTacToeBoard() {
		setSize(622,722);
		setBackground(Color.WHITE);
		NathansMouse n = new NathansMouse();
		addMouseListener(n);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		//Font(font name, font.style, size);
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, titleFontSize));
		g.drawString("TicTacToe",0,(50-titleFontSize)/2+titleFontSize);
		
		g.drawLine(0, 0, 622, 0);
		g.drawLine(0, 60, 622, 60);
		g.drawLine(10,260,612,260);
		g.drawLine(10,462,612,462);
		g.drawLine(0,722,622,722);
		g.drawLine(622, 0, 622, 722);
		g.drawLine(0, 662, 622, 662);
		g.drawLine(210, 60, 210, 662);
		g.drawLine(411, 60, 411, 662);
		//TO DO:
		//draw grid spaces for game board
		
		
		
		//this loop in python code is
		//for thisX in xList
		for(TicTacToeBoard.DrawnX thisX : xList) {
			g.drawString("X", thisX.xCoord, thisX.yCoord);
		}
		
		for(TicTacToeBoard.DrawnO thisO : oList) {
			g.drawString("O", thisO.xCoord, thisO.yCoord);
		}
		
		//DrawnX testX = new DrawnX(200,200);
		//DrawnO testO = new DrawnO(100,200);
		
		//g.drawString("O",testO.xCoord,testO.yCoord);
		
		
	}
	
	class DrawnX {
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawnX(int xCoord, int yCoord){
			this.xCoord = xCoord;
			this.yCoord = yCoord;
			
		}
	}
	
	class DrawnO {
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawnO(int xCoord, int yCoord) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
	
	class NathansMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getX()+" "+e.getY());
			//boolean check = true;
			if(check) {
				xList.add(new DrawnX(e.getX()-10,e.getY()+10));
				repaint();
			} else {
				oList.add(new DrawnO(e.getX()-10,e.getY()+10));
				repaint();
			}
			check = !check;
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
