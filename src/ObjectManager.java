import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
	PlayerBoy boy;
	ArrayList<Fruits>fruits = new ArrayList<Fruits>();
	Random random = new Random();
	Fruits apple;
	
	
	int score = 0;
	int speed = 0;

	public int getScore() {
		return this.score;
	}

	ObjectManager(PlayerBoy boy) {
		this.boy = boy;
		addFruits(random.nextInt(Puzzle.WIDTH - 100), "apple" );
	}
	
	void addFruits(int x, String fruitType) {
		int width = 0;
		int height= 0;
		if(fruitType.equals("apple")) {
			height = 100;
			width = 100; 	
		}
		else if(fruitType.equals("berry")) {
			height = 100;
			width = 100; 	
	}
		else if(fruitType.equals("honey")) {
			height = 100;
			width = 100; 
		}
		else if(fruitType.equals("pear")) {
			height = 100;
			width = 100; 
		}
		else if(fruitType.equals("pine")) {
			height = 100;
			width = 100; 
		}
		else if(fruitType.equals("straw")) {
			height = 100;
			width = 100; 	
		}	
		else if(fruitType.equals("yellow")) {
				height = 100;
				width = 100; 
		}
		else if(fruitType.equals("tomato")) {
					height = 100;
					width = 100; 	
		}
		else if(fruitType.equals("lemon")) {
						height = 100;
						width = 100; 
		}
	fruits.add(new Fruits(5, width, height));
	}
		
		
		
		
			void update() {
		boy.update();
		for (int i = 0; i < fruits.size(); i++) {
			
			}
			checkCollision();
			purgeObjects();
		
	}

	void draw(Graphics g) {
		boy.draw(g);
		for(int i = 0; i < fruits.size(); i++) {
			fruits.get(i).draw(g);
			
		}
		}
	

	void checkCollision() {
		
	}

	void purgeObjects() {

	}
	

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}
}