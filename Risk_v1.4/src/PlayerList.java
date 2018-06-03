
public class PlayerList {
	Player player;
	PlayerList suivant = null;
	
	public PlayerList (Player player) {
		this.player = player;
	}
	
	public void Add(Player player) {
		
		PlayerList AddPlayer = new PlayerList(player);
		this.suivant = AddPlayer;
	}
}

