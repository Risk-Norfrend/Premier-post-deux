// import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;


public class Wallpaper {
	private Image Map;
	public Territory[] allterritory;
	
	public void init() throws SlickException {
		this.Map = new Image("image/map6.2png.png");
	}
	
	public void changeMap(String file) throws SlickException {
		this.Map = new Image(file);
	}
	
	public void draw(Graphics g) {
		g.drawImage(this.Map, 0, 0, 0 ,0, 1920, 975);
	}
}
