import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjectManager implements ActionListener{
	PlayerBoy boy;
	Fruits apple;
	int score = 0;

	public int getScore() {
		return this.score;
	}

	ObjectManager(PlayerBoy boy) {
		this.boy = boy;
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