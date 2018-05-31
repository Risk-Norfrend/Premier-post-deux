import org.newdawn.slick.Image;


public class Territory {
	String name;
	Region region;
	Player player;
	int infantryNumber;
	int cavalryNumber;
	int canonNumber;
	Territory [] Neighbour;
	boolean Port;
	String imageName;
	int ID;
	
	public Territory(String name, boolean port, String imagename, int ID) {
		this.name = name;
		this.Port = port;
		this.imageName = imagename;
		this.infantryNumber = 0;
		this.cavalryNumber = 0;
		this.canonNumber = 0;
		this.ID = ID;
	}
	
	public Region GetRegion() {
		return this.region;
	}
	
	public Player GetPlayer() {
		return this.player;
	}
	
	public int GetInfantry() {
		return this.infantryNumber;
	}
	
	public int GetCavalry() {
		return this.cavalryNumber;
	}
	
	public int GetCanon() {
		return this.canonNumber;
	}
	
	public void movement(Territory target, int infantry, int cavalry, int canon) {
		target.infantryNumber = target.infantryNumber + infantry;
		target.cavalryNumber = target.cavalryNumber + cavalry;
		target.canonNumber = target.canonNumber + canon;
		
		this.infantryNumber = this.infantryNumber - infantry;
		this.cavalryNumber = this.cavalryNumber - cavalry;
		this.canonNumber = this.canonNumber - canon;
	}
	
	public void attack(Territory target) {
		
	}
}
