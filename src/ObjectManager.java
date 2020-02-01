import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
	PlayerBoy boy;
	ArrayList fruits = new ArrayList();
	Random random = new Random();
	Fruits apple;
	int score = 0;

	public int getScore() {
		return this.score;
	}

	ObjectManager(PlayerBoy boy) {
		this.boy = boy;
	}
	void addFruits(Fruits fruit) {
		fruits.add(fruits);
	}
	void update() {

	}

	void draw() {

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