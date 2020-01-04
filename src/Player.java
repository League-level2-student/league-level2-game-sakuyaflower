import java.awt.Color;
import java.awt.Graphics;
import javax.imageio.ImageIO;

public class Player extends GamePanelPuzzle{

	
	Player(int x, int y, int width, int height) {
		super.currentState = 20;
		if (needImage) {
			loadImage(".png");
		}
	}
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream("apple.png"));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
	}
}
