
public class Player {
	String name;
	Faction faction;
	boolean IAorHuman;
	int missionID;
	int numberLastTurnTerritoryEarned; // besoin d'aide pour le nom !!!!
	boolean stillAlive;
	Territory[] territoryOwned;
	
	
	public Player(String name, Faction faction, boolean IAorHuman ) {
		this.name = name;
		this.faction = faction;
		this.IAorHuman = IAorHuman;
		this.stillAlive = true;
		// this.numberLastTurnTerritoryEarned = [Creer fonction qui gere ça];
		
	}
	
	
	public static void  GetMission() {
		
	}
	
	public int startGame(int playerNumber) {

		return (50- 5*playerNumber);
	}
}
