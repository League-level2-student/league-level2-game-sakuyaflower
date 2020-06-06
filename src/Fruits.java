import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

public class Fruits extends GameObject {
	public BufferedImage image;
	public static BufferedImage apple;
	public static BufferedImage honey;
	public static BufferedImage pear;
	public static BufferedImage pine;
	public static BufferedImage straw;
	public static BufferedImage tomato;
	public static BufferedImage yellow;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	static int fruits_height = 0;
	String fruitType;   
	Fruits(String fruitType, int x, int width, int height) {
		super(x, fruits_height, width, height);
		super.speed = 3;
		this.fruitType = fruitType;
		loadImage();
	    if( fruitType.equals( "apple" ) ) {
            image = apple;
        } else if( fruitType.equals( "honey" ) ) {
            image = honey;
        } else if( fruitType.equals( "pear" ) ) {
            image = pear;
        } else if( fruitType.equals( "pine" ) ) {
            image = pine;
        } else if( fruitType.equals( "straw" ) ) {
            image = straw;
        } else if( fruitType.equals( "tomato" ) ) {
            image = tomato;
        } else if( fruitType.equals( "yellow" ) ) {
            image = yellow;
        } else { 
            image = apple;
        }
	}
	



		
	
	void update() {
		y += 3;
		super.update();
	}

	void loadImage() {
		if (needImage) {
			try {
				apple = ImageIO.read(this.getClass().getResourceAsStream("apple.jpg"));
				honey = ImageIO.read(this.getClass().getResourceAsStream("honey.jpg"));
				pear = ImageIO.read(this.getClass().getResourceAsStream("pear.jpg"));
				pine = ImageIO.read(this.getClass().getResourceAsStream("pine.jpg"));
				straw = ImageIO.read(this.getClass().getResourceAsStream("strawberry.jpg"));
				tomato = ImageIO.read(this.getClass().getResourceAsStream("tomato.jpg"));
				yellow = ImageIO.read(this.getClass().getResourceAsStream("yellow.jpg"));
				gotImage = true;
			} catch (Exception e) {

			}
			needImage = false;
		}
	}



	public static String getRandomFruitType() {
		Random rand = new Random();
		String randomFruitType = GamePanel.fruitOrder[rand.nextInt(GamePanel.fruitOrder.length)];
		return randomFruitType;

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
