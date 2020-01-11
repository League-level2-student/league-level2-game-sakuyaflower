import javax.swing.JFrame;

public class Puzzle {
public static final int WIDTH = 800;
public static final int HEIGHT = 800;
GamePanelPuzzle game = new GamePanelPuzzle();
	public static void main(String[] args) {
	Puzzle p = new Puzzle();
	p.setup();

	}
	void setup() {	
		JFrame JF = new JFrame();
		JF.setSize(WIDTH, HEIGHT);
		JF.setVisible(true);
		JF.add(game);
		JF.addKeyListener(game);
	}
	}
