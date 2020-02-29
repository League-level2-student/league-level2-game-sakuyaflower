import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class PlayerBoy extends GameObject {
	public static BufferedImage boy;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	

	public PlayerBoy(int x, int y, int width, int height) {
		super(x, y, width, height);
		super.speed = 20;
		if (needImage) {
			loadImage("rocket.png");
		}
	}

	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(boy, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
	}

	void loadImage(String imageFile) {
		if (needImage) {
			try {
				boy = ImageIO.read(this.getClass().getResourceAsStream("boy.jpg"));
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

