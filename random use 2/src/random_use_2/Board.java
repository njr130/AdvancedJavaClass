package random_use_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;



public class Board extends JPanel implements ActionListener,KeyListener{
		private Random r = new Random();
		private int maxPieces = 400;//the max amount of pieces of a snake that can be on the board
		private int[] snakeXCoords = new int[maxPieces]; //x coordinates of all parts of snake, first part being the head
		private int[] snakeYCoords = new int[maxPieces]; //y coordinates of all parts of snake, first part being the head
		private int piecesCount=1;
		private int score=0;
		private int speed;
		private int foodX,foodY;
		private int scoreDifficulty;
		
		private JButton changeDifficulty = new JButton("Change Difficulty");
		private JButton replay = new JButton("Try Again");
		
		private boolean moveMade=false;
		private boolean gameWon=false;
		private boolean gameOver=false;
		
		private String direction="";
		
		private Timer t;
		
		public Board(int score, int speed) {
			addKeyListener(this);
			setVisible(true);
			setBackground(Color.BLACK);
			setFocusable(true);
			setDoubleBuffered(true);
			setPreferredSize(new Dimension(400,400));
			scoreDifficulty=score;
			this.speed = speed;
			snakeXCoords[0]=180;
			snakeYCoords[0]=180;
			changeDifficulty.addActionListener(new changeDifficultyButton());
			replay.addActionListener(new TryAgainButton());
			Play();
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(!gameOver) {
				g.setColor(Color.RED);
				g.fillRect(foodX,foodY,20,20);
				
				
				for ( int i = 1; i<piecesCount;i++) {
					g.setColor(Color.BLUE);
					g.fillRect(snakeXCoords[i], snakeYCoords[i], 20, 20);
				}
				
				g.setColor(Color.GREEN);
				g.fillRect(snakeXCoords[0],snakeYCoords[0], 20, 20);
			} else if (gameWon) {
				g.setFont(new Font("Times New Roman",Font.PLAIN,40));
				g.setColor(Color.white);
				g.drawString("You Won!", 100,150 );
				g.drawString("Score: "+score, 100, 190);
				
				add(replay);
				replay.setBounds(100, 230, 200, 20);
				add(changeDifficulty);
				changeDifficulty.setBounds(100, 210, 200, 20);
				
			} else {
				g.setFont(new Font("Times New Roman",Font.PLAIN,40));
				g.setColor(Color.white);
				g.drawString("Game Over", 100, 150);
				g.drawString("Score: "+score, 100, 190);
				
				add(replay);
				replay.setBounds(100, 230, 200, 20);
				add(changeDifficulty);
				changeDifficulty.setBounds(100, 210, 200, 20);
			}
		}

		public void Play() {
			foodX=r.nextInt(10)*20;
			foodY=r.nextInt(10)*20;
			t = new Timer(speed,this);
			t.start();
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int code = e.getKeyCode();
			if ((code==KeyEvent.VK_UP) && (direction!="down")){
				if (!moveMade) {
					direction="up";
					moveMade=true;
				}	
			} else if ((code==KeyEvent.VK_DOWN) && (direction!="up")){
				if (!moveMade) {
					direction="down";
					moveMade=true;
				}				
			} else if((code==KeyEvent.VK_RIGHT) && (direction!="left")) {
				if (!moveMade) {
					direction="right";
					moveMade=true;
				}				
			} else if((code==KeyEvent.VK_LEFT) && (direction!="right")) {
				if (!moveMade) {
					direction="left";
					moveMade=true;
				}				
			}
			
		}
		
		//Other abstract methods of the key listener that we don't need
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		//every time the timer updates it will execute what is in the actionPerformed method
		
		public void checkNotOnSnake(){
			foodX = 20*r.nextInt(10);
			foodY = 20*r.nextInt(10);
			for(int i = piecesCount;i>=0;i--) {
				if (foodX==snakeXCoords[i] && foodY==snakeYCoords[i]) {
					checkNotOnSnake();
					break;
				}
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {

			if (!gameOver) {
				
				// checks if the snake head hits the food piece
				if ((snakeXCoords[0]==foodX) && (snakeYCoords[0]==foodY) ) {
					piecesCount++;
					score++;
					
					//sets next location for food piece making sure its not on the snake
					checkNotOnSnake();
					
				}
				//this for loop checks if you collide with any part of the snake by
				//comparing the coordinates of the head to the coordinates of every
				//part of the snake
					
				for (int i = piecesCount; i>3 ;i--) {
					if ((snakeXCoords[0]==snakeXCoords[i]) && (snakeYCoords[0]==snakeYCoords[i])) {
						gameOver=true;
					}
				}
					
				//this part checks if the snake collides with a wall
				if ((snakeXCoords[0]<0) || (snakeXCoords[0]>=400)) {
					gameOver=true;
				}
				
				if((snakeYCoords[0]<0) || (snakeYCoords[0]>=400)) {
					gameOver=true;
				}
					
					
				//checks if the entire board was filled
				if (score==scoreDifficulty) {
					gameOver=true;
					gameWon=true;
				}
				
				
				//stops timer if game is over
				if (gameOver) {
					t.stop();
				}
				
				
				for (int i = piecesCount; i>0; i--) {
					//moves the body of the snake by changing the coordinates of each piece in the arrays to
					//the coordinates of the piece before it in the array
					snakeXCoords[i]=snakeXCoords[i-1];
					snakeYCoords[i]=snakeYCoords[i-1];
				}
				
				//this section actually moves the snake
				if (direction=="up") {
					snakeYCoords[0]-=20;
					moveMade=false;
				}
				if (direction=="down") {
					snakeYCoords[0]+=20;
					moveMade=false;
				}
				if (direction=="right") {
					snakeXCoords[0]+=20;
					moveMade=false;
				}
				if (direction=="left") {
					snakeXCoords[0]-=20;
					moveMade=false;
				}
				
			}
			repaint();
		}
		class changeDifficultyButton implements ActionListener {
			

			@Override
			public void actionPerformed(ActionEvent e) {
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
							speed = 150;
						} else if (button5.isSelected()) {
							speed= 100;
						} else if (button6.isSelected()) {
							speed= 50;
						} else {
							speed= 150;
						}
						
						difficultySelect.dispose();
						
						snakeXCoords[0]=180;
						snakeYCoords[0]=180;
						piecesCount=1;
						foodX = 20*r.nextInt(10);
						foodY = 20*r.nextInt(10);
						score=0;
						gameOver=false;
						gameWon=false;
						t.setDelay(speed);
						t.start();
						remove(changeDifficulty);
						remove(replay);
						direction="";
						repaint();
				
					}	

				});
				
			}
		}
		
		class TryAgainButton implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				snakeXCoords[0]=180;
				snakeYCoords[0]=180;
				piecesCount=1;
				foodX=20*r.nextInt(10);
				foodY=20*r.nextInt(10);
				gameOver=false;
				gameWon=false;
				t.start();
				remove(changeDifficulty);
				remove(replay);
				direction="";
				repaint();
			}
			
		}
		
}