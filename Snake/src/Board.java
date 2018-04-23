import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JPanel implements ActionListener,KeyListener {
	Timer t = new Timer(15,this);
	int x=225,y=225,velx=0,vely=0;
	int foodX,foodY;
	int score = 0;
	String headDir;
	Random r = new Random();
	ArrayList<SnakeBody> pieces = new ArrayList<SnakeBody>();
	int[][] boardArray = new int[20][20];
	//values in array 0=empty space, 1=snake head, 2=snake body, 3=food
	int index1;
	int index2;
	
	
	public Board() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		//foodX = r.nextInt(500);
		//foodY = r.nextInt(500);
		for (int i = 0; i<20;i++) {
			for( int f = 0;f<20;f++) {
				boardArray[i][f]=0;
			}
		}
		boardArray[9][9]=1; //default head position
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		g.setFont(new Font("Comic Sans MS",Font.BOLD,50));
		g2.fill(new Rectangle2D.Double(x,y,25,25));
		if (x==0 || y==0 || x+25==500 || y+25==500) {
			velx=0;
			vely=0;
			g.drawString("Game Over", 100, 100);
			g.drawString("Score: "+score, 100, 150);
		}
		g.drawLine(500, 0, 500, 500);
		g.drawLine(0, 500, 500, 500);
		g.drawLine(25, 0, 25, 500);
		g.drawLine(50, 0, 50, 500);
		g.drawLine(75, 0, 75, 500);
		g.drawLine(100, 0, 100, 500);
		g.drawLine(125, 0, 125, 500);
		g.drawLine(150, 0, 150, 500);
		g.drawLine(175, 0, 175, 500);
		g.drawLine(200, 0, 200, 500);
		g.drawLine(225, 0, 225, 500);
		g.drawLine(250, 0, 250, 500);
		g.drawLine(275, 0, 275, 500);
		g.drawLine(300, 0, 300, 500);
		g.drawLine(325, 0, 325, 500);
		g.drawLine(350, 0, 350, 500);
		g.drawLine(375, 0, 375, 500);
		g.drawLine(400, 0, 400, 500);
		g.drawLine(425, 0, 425, 500);
		g.drawLine(450, 0, 450, 500);
		g.drawLine(475, 0, 475, 500);
		
		g.drawLine(0, 475, 500, 475);
		g.drawLine(0, 450, 500, 450);
		g.drawLine(0, 425, 500, 425);
		g.drawLine(0, 400, 500, 400);
		g.drawLine(0, 375, 500, 375);
		g.drawLine(0, 350, 500, 350);
		g.drawLine(0, 325, 500, 325);
		g.drawLine(0, 300, 500, 300);
		g.drawLine(0, 275, 500, 275);
		g.drawLine(0, 250, 500, 250);
		g.drawLine(0, 225, 500, 225);
		g.drawLine(0, 200, 500, 200);
		g.drawLine(0, 175, 500, 175);
		g.drawLine(0, 150, 500, 150);
		g.drawLine(0, 125, 500, 125);
		g.drawLine(0, 100, 500, 100);
		g.drawLine(0, 75, 500, 75);
		g.drawLine(0, 50, 500, 50);
		g.drawLine(0, 25, 500, 25);
		g2.fill(new Rectangle2D.Double(foodX,foodY,25,25));
		/*for (SnakeBody thisP : pieces) {
			g.drawRect(thisP.getX(), thisP.getY(), 25, 25);
		}*/

		if (((x>=foodX && x<=foodX+25)||(x+25>=foodX && x+25<=foodX+25)) &&((y>=foodY && y<=foodY+25)||(y+25>=foodY && y+25<=foodY+25))) {
			while(true) {
				index1=r.nextInt(20);
				index2=r.nextInt(20);
				if (boardArray[index1][index2]==0) {
					break;
				}
			}
			
			foodX = index1*25;
			foodY = index2*25;
			score++;
			/*if (headDir=="up") {
				pieces.add(new SnakeBody(x,y+25));
			}
			if (headDir=="down") {
				pieces.add(new SnakeBody(x,y-25));
			}
			if (headDir=="right") {
				pieces.add(new SnakeBody(x-25,y));
			}
			if (headDir=="left") {
				pieces.add(new SnakeBody(x+25,y));
			}*/
		}

	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
		x+=velx;
		y+=vely;
	}
	
	public void up() {
		vely=-5;
		velx=0;
		headDir="up";
	}
	
	public void down() {
		vely=5;
		velx=0;
		headDir="down";
	}
	
	public void left() {
		velx=-5;
		vely=0;
		headDir="left";
	}
	
	public void right() {
		velx=5;
		vely=0;
		headDir="right";
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code=e.getKeyCode();
		if (code==KeyEvent.VK_UP) {
			up();
		}
		if (code==KeyEvent.VK_DOWN) {
			down();
		}
		if (code==KeyEvent.VK_RIGHT) {
			right();
		}
		if (code==KeyEvent.VK_LEFT) {
			left();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}