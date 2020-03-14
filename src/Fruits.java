import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Fruits extends GameObject{
	public static BufferedImage image;
	public static BufferedImage apple;
	public static BufferedImage berry;
	public static BufferedImage honey;
	public static BufferedImage lemon;
	public static BufferedImage pear;
	public static BufferedImage pine;
	public static BufferedImage straw;
	public static BufferedImage tomato;
	public static BufferedImage yellow; 
	public static boolean needImage = true;
	public static boolean gotImage = false;
	
static int fruits_height = 0; 
	
	Fruits(int x, int width, int height) {
		super(x, fruits_height, width, height);
		super.speed = 3;
		loadImage();
	}
	
	
	void update() {
		y+=speed;
			super.update();
	}
	
	void loadImage(){
		if (needImage) {
	        try {
	           apple= ImageIO.read(this.getClass().getResourceAsStream("apple.jpg"));
	        	berry = ImageIO.read(this.getClass().getResourceAsStream("berry.jpg"));	
	        	honey = ImageIO.read(this.getClass().getResourceAsStream("honey.jpg"));	
	        	lemon = ImageIO.read(this.getClass().getResourceAsStream("lemon.jpg"));	
	        	pear = ImageIO.read(this.getClass().getResourceAsStream("pear.jpg"));	
	        	pine = ImageIO.read(this.getClass().getResourceAsStream("pine.jpg"));	
	        	straw = ImageIO.read(this.getClass().getResourceAsStream("strawberry.jpg"));
	        	tomato = ImageIO.read(this.getClass().getResourceAsStream("tomato.jpg"));	
	        	yellow = ImageIO.read(this.getClass().getResourceAsStream("yellow.jpg"));	
	        	gotImage = true;
	        } 
	        catch (Exception e) {
	        	
	        }
	        needImage = false;
	    }
	}
	
	
	
	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(apple, x, y, width, height, null);
		} 
		else{
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
	}
	
}


