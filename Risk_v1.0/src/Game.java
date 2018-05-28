import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
public class Game extends BasicGame {
	
	private GameContainer container;
	private Wallpaper map = new Wallpaper();
	// private Player player = new Player(map);
	
	public static void main(String[] args) throws SlickException {
		new AppGameContainer(new Game(), 1429, 975, false).start();
	}
	
	public Game() {
		super("Mon risk !");
	}
	
	@Override
	public void init(GameContainer container) throws SlickException {
		this.container = container;
		this.map.init();
		// this.player.init();
		// Music background = new Music("son.ogg");
		// background.loop();
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		this.map.draw(g);
		// this.player.render(g);

	}


	@Override
	public void update(GameContainer container, int Alpha) throws SlickException {
		// updateTrigger();
		// this.player.update(delta);

	}
	
	private void changeMap(int objectID, String NextMap) throws SlickException {
		// teleport(objectID);
		// String newMap = this.map.getObjectProperty(objectID, "dest-map", "undefined");
		this.map.changeMap("map/" + NextMap);
		
	}
	
	private void initTerritory() {
		
	}
	

	
	
	/**
	@Override
	public void keyReleased(int key, char c) {
		this.player.setMoving(false);
		if (Input.KEY_ESCAPE == key) {
			this.container.exit();
		}
	}

	@Override
	public void keyPressed(int key, char c) {
		switch (key) {
		case Input.KEY_UP:
			this.player.setDirection(0);
			this.player.setMoving(true);
			break;
		case Input.KEY_LEFT:
			this.player.setDirection(1);
			this.player.setMoving(true);
			break;
		case Input.KEY_DOWN:
			this.player.setDirection(2);
			this.player.setMoving(true);
			break;
		case Input.KEY_RIGHT:
			this.player.setDirection(3);
			this.player.setMoving(true);
			break;
		}
	}
	
	**/

}
