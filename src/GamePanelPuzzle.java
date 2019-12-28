import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GamePanelPuzzle extends Puzzle {
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Font smallerFont = new Font("Arial", Font.PLAIN, 28);

	public void paintComponent(Graphics g) {

		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
		} else if (currentState == END) {
			drawEndState(g);
		}
	}

	GamePanelPuzzle() {

	}

	void updateMenuState() {

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

	void startGame() {

	}

	void endGame() {

	}

}
