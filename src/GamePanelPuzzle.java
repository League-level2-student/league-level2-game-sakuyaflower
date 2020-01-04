import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanelPuzzle extends Puzzle implements ActionListener, KeyListener {
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	public static BufferedImage imageBackground;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	int currentState = MENU;
	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Font smallerFont = new Font("Arial", Font.PLAIN, 28);
	Player person = new Player(400, 800, 50, 50);

	public void paintComponent(Graphics g) {

		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
		} else if (currentState == END) {
			drawEndState(g);
		}
	}

	void startGame() {

	}

	void endGame() {

	}

	GamePanelPuzzle() {
		if (needImage) {
			loadImage("rocket.png");
		}
	}
	
	JPanel JP = new JPanel();
	
	void updateMenuState() {
		manager.update();
		if(rocket.isActive == false) {
			endGame();
	}

	void updateGameState() {

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setFont(titleFont);

		g.setColor(Color.YELLOW);
		g.drawString("text", 400, 300);

		g.setFont(smallerFont);
		g.setColor(Color.YELLOW);
		g.drawString("Please Press ENTER to Start", 400, 500);

		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press SPACE for Directions", 400, 600);
	}

	void drawGameState(Graphics g) {

	}

	void drawEndState(Graphics g) {
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("You Won The Game", 400, 300);
	}

	void loadImage(String imageFile) {
		if (needImage) {
			try {
				image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
				imageBackground = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
				gotImage = true;
			} catch (Exception e) {

			}
			needImage = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();

		} else if (currentState == END) {
			updateEndState();

		}
	}
}
