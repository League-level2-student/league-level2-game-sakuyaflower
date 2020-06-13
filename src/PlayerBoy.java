import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class PlayerBoy extends GameObject {
	public static BufferedImage boy;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	

	PlayerBoy(int x, int y, int width, int height) {
		super(x, y, width, height);
		super.speed = 20; 
		if (needImage) {
			loadImage("boy.png");
		}
	}

	void draw(Graphics g) {
		
			g.drawImage(boy, x, y, width*3, height*3, null);
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		
	}

	void loadImage(String imageFile) {
		if (needImage) {
			try {
				boy = ImageIO.read(this.getClass().getResourceAsStream("boy.png"));
				gotImage = true;
			} catch (Exception e) {

			}
			needImage = false;
		}

	}
	public void right() {
		x += speed;
	}

	public void left() {
		x -= speed;
	}

}

