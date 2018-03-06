import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel{
	
	Font titleFont = new Font("Courier",Font.PLAIN,36);
	Font instructions = new Font("Courier",Font.PLAIN,18);
	Font XandO = new Font("Courier",Font.BOLD,300);
	ArrayList<Shape> ShapeList = new ArrayList<Shape>();
	boolean check = true;
	int turns = 0;
	String[] values = new String[9];
	boolean gamewin = false;
	
	public TicTacToeBoard() {
		setSize(622,722);
		setBackground(Color.WHITE);
		NathansMouse n = new NathansMouse();
		addMouseListener(n);
		for (int x = 0; x<9;x++) {
			values[x]="";
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		
		g.setFont(titleFont);
		g.drawString("TicTacToe",210,(50-titleFont.getSize())/2+titleFont.getSize());
		g.drawLine(0, 0, 622, 0);
		g.drawLine(0, 60, 622, 60);
		g.drawLine(10,260,612,260);
		g.drawLine(10,462,612,462);
		g.drawLine(0,722,622,722);
		g.drawLine(622, 0, 622, 722);
		g.drawLine(0, 662, 622, 662);
		g.drawLine(210, 60, 210, 662);
		g.drawLine(411, 60, 411, 662);
		
		
		g.setFont(XandO);
		for(TicTacToeBoard.Shape thisS : ShapeList ) {
			g.drawString(thisS.shape, thisS.xCoord, thisS.yCoord);
		}
		
		g.setFont(instructions);
		if (values[0] == "X" && values[1]=="X" && values[2]=="X" ) {
			g.drawLine(20, 160, 602, 160);
			g.drawString("Player 1 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[0] == "X" && values[3]=="X" && values[6]=="X") {
			g.drawLine(110, 61, 110, 662);
			g.drawString("Player 1 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[0] == "X" && values[4]=="X" && values[8]=="X") {
			g.drawLine(10, 61, 612, 662);
			g.drawString("Player 1 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[1] == "X" && values[4]=="X" && values[7]=="X") {
			g.drawLine(310, 61, 310, 662);
			g.drawString("Player 1 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[2] == "X" && values[5]=="X" && values[8]=="X") {
			g.drawLine(510, 61, 510, 662);
			g.drawString("Player 1 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[3] == "X" && values[4]=="X" && values[5]=="X") {
			g.drawLine(10, 361, 602, 361);
			g.drawString("Player 1 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[6] == "X" && values[7]=="X" && values[8]=="X") {
			g.drawLine(10, 561, 602, 561);
			g.drawString("Player 1 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[2] == "X" && values[4]=="X" && values[6]=="X") {
			g.drawLine(10, 662, 602, 61);
			g.drawString("Player 1 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
			
			
			
			
			
		} else if (values[0] == "O" && values[1]=="O" && values[2]=="O" ) {
			g.drawLine(20, 160, 602, 160);
			g.drawString("Player 2 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[0] == "O" && values[3]=="O" && values[6]=="O") {
			g.drawLine(110, 61, 110, 662);
			g.drawString("Player 2 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[0] == "O" && values[4]=="O" && values[8]=="O") {
			g.drawLine(10, 61, 612, 662);
			g.drawString("Player 2 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[1] == "O" && values[4]=="O" && values[7]=="O") {
			g.drawLine(310, 61, 310, 662);
			g.drawString("Player 2 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[2] == "O" && values[5]=="O" && values[8]=="O") {
			g.drawLine(510, 61, 510, 662);
			g.drawString("Player 2 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[3] == "O" && values[4]=="O" && values[5]=="O") {
			g.drawLine(10, 361, 602, 361);
			g.drawString("Player 2 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[6] == "O" && values[7]=="O" && values[8]=="O") {
			g.drawLine(10, 561, 602, 561);
			g.drawString("Player 2 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		} else if (values[2] == "O" && values[4]=="O" && values[6]=="O") {
			g.drawLine(10, 662, 602, 61);
			g.drawString("Player 2 wins", 230, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin = true;
		}else if (turns == 9) {
			g.drawString("Tie Game", 265, 682);
			g.drawString("Click to play again", 205, 700);
			gamewin=true;
		} else {
			if (check) {
				g.drawString("Player 1's Turn", 220, 682);
			} else {
				g.drawString("Player 2's Turn", 220, 682);
			}
			g.drawString("Please click in a grid square.", 150, 702);
		}
	}
	
	class Shape {
		int xCoord = 200;
		int yCoord = 200;
		String shape = "";
		
		public Shape(int xCoord, int yCoord, String shape) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
			this.shape = shape;
		}
	}
	
	class NathansMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (gamewin) {
				ShapeList.removeAll(ShapeList);
				turns=0;
				for (int x = 0;x<9;x++) {
					values[x]="";
				}
				gamewin=false;
				check = true;
				repaint();
			} else {
				if (e.getY()<61 || e.getY()>662){
				
				} else {
					if(check) {
						if (e.getY()<261) {
							if (e.getX()<211 && values[0]=="") {
								ShapeList.add(new Shape(20,249,"X"));
								values[0]="X";
								check = !check;
								turns++;
							} else if (e.getX()<411 && e.getX()>210 && values[1]=="") {
								ShapeList.add(new Shape(222,249,"X"));
								values[1]="X";
								check = !check;
								turns++;
							} else if (e.getX()>410 && values[2]==""){
								ShapeList.add(new Shape(422,249,"X"));
								values[2]="X";
								check = !check;
								turns++;
							}
						} else if (e.getY()<462) {
							if (e.getX()<211 && values[3]=="") {
								ShapeList.add(new Shape(20,450,"X"));
								values[3]="X";
								check = !check;
								turns++;
							} else if (e.getX()<411 && e.getX()>210  && e.getX()>210  && values[4]=="") {
								ShapeList.add(new Shape(222,450,"X"));
								values[4]="X";
								check = !check;
								turns++;
							} else if (e.getX()>410 && values[5]==""){
								ShapeList.add(new Shape(422,450,"X"));
								values[5]="X";
								check = !check;
								turns++;
							}
						} else {
							if (e.getX()<211 && values[6]=="") {
								ShapeList.add(new Shape(20,650,"X"));
								values[6]="X";
								check = !check;
								turns++;
							} else if (e.getX()<411 && e.getX()>210  && values[7]=="") {
								ShapeList.add(new Shape(222,650,"X"));
								values[7]="X";
								check = !check;
								turns++;
							} else if (e.getX()>410 && values[8]=="") {
								ShapeList.add(new Shape(422,650,"X"));
								values[8]="X";
								check = !check;
								turns++;
							}
						}
						repaint();
					} else {
						if (e.getY()<261) {
							if (e.getX()<211 && values[0]=="") {
								ShapeList.add(new Shape(20,249,"O"));
								values[0]="O";
								check = !check;
								turns++;
							} else if (e.getX()<411 && e.getX()>210  && values[1]=="") {
								ShapeList.add(new Shape(222,249,"O"));
								values[1]="O";
								check = !check;
								turns++;
							} else if (e.getX()>410 && values[2]==""){
								ShapeList.add(new Shape(422,249,"O"));
								values[2]="O";
								check = !check;
								turns++;
							}
						} else if (e.getY()<462) {
							if (e.getX()<211 && values[3]=="") {
								ShapeList.add(new Shape(20,450,"O"));
								values[3]="O";
								check = !check;
								turns++;
							} else if (e.getX()<411 && e.getX()>210  && values[4]=="") {
								ShapeList.add(new Shape(222,450,"O"));
								values[4]="O";
								check = !check;
								turns++;
							} else if (e.getX()>410 && values[5]==""){
								ShapeList.add(new Shape(422,450,"O"));
								values[5]="O";
								check = !check;
								turns++;
							}
						} else {
							if (e.getX()<211 && values[6]=="") {
								ShapeList.add(new Shape(20,650,"O"));
								values[6]="O";
								check = !check;
								turns++;
							} else if (e.getX()<411 && e.getX()>210  && values[7]=="") {
								ShapeList.add(new Shape(222,650,"O"));
								values[7]="O";
								check = !check;
								turns++;
							} else if (e.getX()>410 && values[8]==""){
								ShapeList.add(new Shape(422,650,"O"));
								values[8]="O";
								check = !check;
								turns++;
							}
						}
						repaint();
					}
				}
			}
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
