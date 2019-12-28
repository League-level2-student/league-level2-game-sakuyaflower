import javax.swing.JFrame;

public class Puzzle {
public static final int WIDTH = 800;
public static final int HEIGHT = 800;
GamePanelPuzzle game = new GamePanelPuzzle();
JFrame JF = new JFrame();

public static void main(String[] args) {
		Puzzle p = new Puzzle();
		p.setup();
	}
void setup() {
		JF.add(game);
		JF.setSize(WIDTH, HEIGHT);
		JF.setVisible(true);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
}
}
