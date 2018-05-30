
public class Region {
	Territory[] territories;
	String name;
	int numberTerritories;
	
	
	public Region(String name, Territory[] territories,int numberTerritories) {
		this.name = name;
		this.territories = territories;
		this.numberTerritories = numberTerritories;
	}
	
	public void setRegion() {
		for(int i=0; i<this.numberTerritories; i++) {
			this.territories[i].region = this;
		}
	}
	
}
