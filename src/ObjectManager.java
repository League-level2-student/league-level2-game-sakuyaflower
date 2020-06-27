import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ObjectManager implements ActionListener, KeyListener {
	PlayerBoy boy;
	ArrayList<Fruits> fruits = new ArrayList<Fruits>();
	ArrayList<Fruits> caughtFruits = new ArrayList<Fruits>();
	String[] fruitOrder = { "strawberry", "tomato", "apple", "yellow nectarine", "honeydew", "apple", "pear", "pineapple", "yellow nectarine" };
	JPanel JP = new JPanel();
    JFrame JF = new JFrame();
    JButton JB = new JButton();
    
	Random random = new Random();
	int score = 0;
	int nextFruit = 0;
	boolean endGame = false;
	String expectedFruit = GamePanel.fruitOrder[nextFruit];
 
   


	public int getScore() {
		return this.score;

	}

	public int getNextFruit() {
		return nextFruit;
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
		} else if (fruitType.equals("honeydew")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("pear")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("pineapple")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("strawberry")) {
			height = 100;
			width = 100;
		} else if (fruitType.equals("yellow nectarine")) {
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
				String expectedFruits = GamePanel.fruitOrder[nextFruit];
				String caught = fruits.get(i).fruitType;

				System.out.println("Caught fruit: " + caught + " expected: " + expectedFruits);

				if (caught.equals(expectedFruits)) {
					caughtFruits.add(fruits.get(i));
					score++;
					nextFruit++;

					if (caughtFruits.size() == GamePanel.fruitOrder.length) {
						String answer = JOptionPane.showInputDialog(null,"What is the code? Need a hint? Go back to the directions and you will find your hint there.");
						if(answer.equals("STAY HAPPY")) {
							JOptionPane.showMessageDialog(null,"You win!");
						}	
					}
				} else {
					score--;
					nextFruit = 0;
				}
				fruits.remove(i);
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
		addFruits(new Random().nextInt(Puzzle.WIDTH - 100) + 100, Fruits.getRandomFruitType());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//if (e.getKeyCode() == KeyEvent.VK_1) {
			//JOptionPane.showMessageDialog(null, "Try remember the order you collected the fruits");
	//}
		//if (e.getKeyCode() == KeyEvent.VK_2) {
			//JOptionPane.showMessageDialog(null, "Use the first letter of each fruit name");	
	//}
		//if (e.getKeyCode() == KeyEvent.VK_3) {
		//	JOptionPane.showMessageDialog(null, "Theres no more hints silly, thats all u get. Its not that hard.");
		//}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}