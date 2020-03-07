import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Fruits extends GameObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	ArrayList<GameObject>fruits = new ArrayList<GameObject>();
	
	Fruits(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		super.speed = 3;
		if (needImage) {
			loadImage("apple.png");
		}
	}
	void update() {
		y+=speed;
		
		super.update();
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
	void addFruit() {
		
	}
	apple = ImageIO.read(this.getClass().getResourceAsStream("apple.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("berry.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("honey.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("lemon.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("pear.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("pine.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("strawberry.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("yellow.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("tomato.jpg"));	
	pc = ImageIO.read(this.getClass().getResourceAsStream("yellow.jpg"));	
	
}
