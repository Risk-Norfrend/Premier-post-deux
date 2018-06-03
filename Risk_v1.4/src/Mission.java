
public class Mission {
	int ID;
	boolean succes;
	Player player;
	
	
	public Mission(int ID,Player player) {
		this.ID = ID;
		this.succes = false;
		this.player = player;
	}
	
	public boolean check(int ID) {
		boolean test = this.succes;
		
		if(MissionCheck(ID) == true) {
			test = true;
		}
		
		else if (Condition1Check(this.player) == true) {
			test = true;
		}
		
		
		
		
		
		return test;
	}
	
	public static boolean Condition1Check(Player player) {
		if(player.territoryOwned.length == 47) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean MissionCheck(int ID) {
		if(ID ==1) {
			// check = CheckMission1()
		}
		if(ID ==2) {
			
		}
		if(ID ==3) {
			
		}
		// Juste pour eviter une erreur sur un code non fini
		return true;
	}
}
