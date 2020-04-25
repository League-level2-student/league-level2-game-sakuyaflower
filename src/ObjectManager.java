import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
	PlayerBoy boy;
	ArrayList<Fruits> fruits = new ArrayList<Fruits>();
	ArrayList<Fruits> caughtFruits = new ArrayList<Fruits>();
	Random random = new Random();
	int score = 0;

	public int getScore() {
		return this.score;
	}

	ObjectManager(PlayerBoy boy) {
		this.boy = boy;
		addFruits(random.nextInt(Puzzle.WIDTH - 100), "apple");
	}

	void addFruits(int x, String fruitType) {
		int width = 0;
		int height = 0;
		if (fruitType.equals("apple")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("honey")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("pear")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("pine")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("straw")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("yellow")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("tomato")) {
			height = 100;
			width = 100;
		}
		fruits.add(new Fruits(fruitType, (x - width), width, height));
	}

	void update() {
		boy.update();
		for (int i = 0; i < fruits.size(); i++) {
			fruits.get(i).update();
			if (fruits.get(i).y >= Puzzle.HEIGHT) {
				fruits.get(i).isActive = false;
			}
		}
		checkCollision();
		purgeObjects();

	}

	void draw(Graphics g) {
		boy.draw(g);
		for (int i = 0; i < fruits.size(); i++) {
			fruits.get(i).draw(g);

		}
	}

	void checkCollision() {

		for (int i = 0; i < fruits.size(); i++) {
			if (boy.collisionBox.intersects(fruits.get(i).collisionBox)) {
				fruits.remove(i);
				score++;
				caughtFruits.add(fruits.get(2));
				if (caughtFruits.contains(fruits.get(2))) {
					System.out.println(fruits + "was already caught");
				}
			}
		}
	}

	void purgeObjects() {
		for (int i = 0; i < fruits.size(); i++) {
			if (fruits.get(i).isActive == false) {
				fruits.remove(i);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addFruits(new Random().nextInt(Puzzle.WIDTH), Fruits.getRandomFruitType());
	}
}