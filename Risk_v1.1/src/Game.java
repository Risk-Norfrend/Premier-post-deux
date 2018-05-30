import java.util.ArrayList;
import java.util.List;

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
		

		// Sholazar' Territories
		Territory territory1 = new Territory("The Nexus",false,"1.png",1);
		Territory territory2 = new Territory("Warsong Hold",false,"2.png",2);
		Territory territory3 = new Territory("Vaillance Keep",true,"3.png",3);
		Territory territory4 = new Territory("Amber ledge",false,"4.png",4);
		Territory territory5 = new Territory("Mosslight Pillar",false,"5.png",5);
		Territory territory6 = new Territory("Maker's Perch",false,"6.png",6);
		Territory territory7 = new Territory("Glimmering Pillar",false,"7.png",7);
		Territory territory8 = new Territory("Maker's Overlook",false,"8.png",8);
		Territory territory9 = new Territory("Skyreach Pillar",false,"9.png",9);
		Territory territory10 = new Territory("Taunka'l Village",false,"10.png",10);
		Territory territory11 = new Territory("En'Kilah",false,"11.png",11);
		Territory[] array1 = new Territory[11];
		array1[0] = territory1;
		array1[1] = territory2;
		array1[2] = territory3;
		array1[3] = territory4;
		array1[4] = territory5;
		array1[5] = territory6;
		array1[6] = territory7;
		array1[7] = territory8;
		array1[8] = territory9;
		array1[9] = territory10;
		array1[10] = territory11;
		Region Sholazar = new Region("Sholazar",array1, 11);
		Sholazar.setRegion();
		
		// Dragonblight' Territories
		Territory territory12 = new Territory("Wintergrasp",false,"12.png",12);
		Territory territory13 = new Territory("Azjol'Nerub",false,"13.png",13);
		Territory territory14 = new Territory("Agmar's Hammer",false,"14.png",14);
		Territory territory15 = new Territory("Wyrmrest Temple",false,"15.png",15);
		Territory territory16 = new Territory("Angrathar",false,"16.png",16);
		Territory territory17 = new Territory("Dalaran",false,"17.png",17);
		Territory territory18 = new Territory("Cristalsong Forest",false,"18.png",18);
		Territory territory19 = new Territory("Naxxramas",false,"19.png",19);
		Territory territory20 = new Territory("New Hearthglen",false,"20.png",20);
		Territory territory21 = new Territory("Conquest Hold",true,"21.png",21);
		Territory territory22 = new Territory("Drak'Tharon Keep",false,"22.png",22);
		
		Territory[] array2 = new Territory[11];
		array2[0] = territory12;
		array2[1] = territory13;
		array2[2] = territory14;
		array2[3] = territory15;
		array2[4] = territory16;
		array2[5] = territory17;
		array2[6] = territory18;
		array2[7] = territory19;
		array2[8] = territory20;
		array2[9] = territory21;
		array2[10] = territory22;
		Region Dragonblight = new Region("Dragonblight",array2, 11);
		Dragonblight.setRegion();
		
		// Zul'Drak' Territories
		Territory territory23 = new Territory("Zeramas",false,"23.png",23);
		Territory territory24 = new Territory("Argent Stand",false,"24.png",24);
		Territory territory25 = new Territory("Grizzlemaw",false,"25.png",25);
		Territory territory26 = new Territory("Gjalerbron",false,"26.png",26);
		Territory territory27 = new Territory("Westguard Keep",false,"27.png",27);
		Territory territory28 = new Territory("New Agamand",false,"28.png",28);
		Territory territory29 = new Territory("Nifflevar",false,"29.png",29);
		Territory territory30 = new Territory("Utgarde Keep",false,"30.png",30);
		Territory territory31 = new Territory("Dun Argol",false,"31.png",31);
		Territory territory32 = new Territory("Bloodmoon Isle",true,"32.png",32);
		Territory territory33 = new Territory("Kalramas",false,"33.png",33);
		Territory territory34 = new Territory("Gundrak",false,"34.png",34);
		Territory territory35 = new Territory("Altar of Rhunok",false,"35.png",35);
		
		Territory[] array3 = new Territory[13];
		array3[0] = territory23;
		array3[1] = territory24;
		array3[2] = territory25;
		array3[3] = territory26;
		array3[4] = territory27;
		array3[5] = territory28;
		array3[6] = territory29;
		array3[7] = territory30;
		array3[8] = territory31;
		array3[9] = territory32;
		array3[10] = territory33;
		array3[11] = territory34;
		array3[12] = territory35;
		Region ZulDrak = new Region("ZulDrak",array3, 13);
		ZulDrak.setRegion();
		
		// Icecrown' Territories
		Territory territory36 = new Territory("Thunderfall",false,"36.png",36);
		Territory territory37 = new Territory("Terrace of the Makers",false,"37.png",37);
		Territory territory38 = new Territory("Ulduar",false,"38.png",38);
		Territory territory39 = new Territory("Grom'arsh",false,"39.png",39);
		Territory territory40 = new Territory("Frosthold",false,"40.png",40);
		Territory territory41 = new Territory("Argent Vanguard",false,"41.png",41);
		Territory territory42 = new Territory("Ymirheim",false,"42.png",42);
		Territory territory43 = new Territory("Syndragosa's Fall",false,"43.png",43);
		Territory territory44 = new Territory("Shadow Vault",false,"44.png",44);
		Territory territory45 = new Territory("Fleshwerks",false,"45.png",45);
		Territory territory46 = new Territory("Onslaught Harbor",true,"46.png",46);
		Territory territory47 = new Territory("Icecrown Citadel",false,"47.png",47);
		
		Territory[] array4 = new Territory[12];
		array4[0] = territory36;
		array4[1] = territory37;
		array4[2] = territory38;
		array4[3] = territory39;
		array4[4] = territory40;
		array4[5] = territory41;
		array4[6] = territory42;
		array4[7] = territory43;
		array4[8] = territory44;
		array4[9] = territory45;
		array4[10] = territory46;
		array4[11] = territory47;
		Region Icecrown = new Region("Icecrown",array4, 11);
		Icecrown.setRegion();

		// Neighbours Initialisation
		Territory[] arrayterri1 = new Territory[2];
		arrayterri1[0] = territory2;
		arrayterri1[1] = territory4;
		territory1.Neighbour = arrayterri1;
		
		Territory[] arrayterri2 = new Territory[3];
		arrayterri1[0] = territory1;
		arrayterri1[1] = territory3;
		arrayterri1[2] = territory4;
		territory2.Neighbour = arrayterri2;
		
		Territory[] arrayterri3 = new Territory[7];
		arrayterri3[0] = territory2;
		arrayterri3[1] = territory4;
		arrayterri3[2] = territory10;
		arrayterri3[3] = territory11;
		arrayterri3[4] = territory21;
		arrayterri3[5] = territory32;
		arrayterri3[6] = territory46;
		territory3.Neighbour = arrayterri3;
		
		Territory[] arrayterri4 = new Territory[5];
		arrayterri4[0] = territory1;
		arrayterri4[1] = territory2;
		arrayterri4[2] = territory3;
		arrayterri4[3] = territory5;
		arrayterri4[4] = territory10;
		territory4.Neighbour = arrayterri4;
		
		Territory[] arrayterri5 = new Territory[3];
		arrayterri5[0] = territory4;
		arrayterri5[1] = territory6;
		arrayterri5[2] = territory9;
		territory5.Neighbour = arrayterri5;
		
		Territory[] arrayterri6 = new Territory[3];
		arrayterri6[0] = territory5;
		arrayterri6[1] = territory7;
		arrayterri6[2] = territory9;
		territory6.Neighbour = arrayterri6;
		
		Territory[] arrayterri7 = new Territory[3];
		arrayterri7[0] = territory6;
		arrayterri7[1] = territory8;
		arrayterri7[0] = territory9;
		territory7.Neighbour = arrayterri7;
		
		Territory[] arrayterri8 = new Territory[6];		
		arrayterri8[0] = territory7;
		arrayterri8[1] = territory9;
		arrayterri8[2] = territory10;
		arrayterri8[3] = territory12;
		arrayterri8[4] = territory45;
		arrayterri8[5] = territory47;
		territory8.Neighbour = arrayterri8;
		
		Territory[] arrayterri9 = new Territory[5];		
		arrayterri9[0] = territory5;
		arrayterri9[1] = territory6;
		arrayterri9[2] = territory7;
		arrayterri9[3] = territory8;
		arrayterri9[4] = territory10;
		territory9.Neighbour = arrayterri9;
		
		Territory[] arrayterri10 = new Territory[6];		
		arrayterri10[0] = territory3;
		arrayterri10[1] = territory4;
		arrayterri10[2] = territory5;
		arrayterri10[3] = territory9;
		arrayterri10[4] = territory11;
		arrayterri10[5] = territory12;
		territory10.Neighbour = arrayterri10;
		
		Territory[] arrayterri11 = new Territory[4];		
		arrayterri11[0] = territory3;
		arrayterri11[1] = territory10;
		arrayterri11[2] = territory12;
		arrayterri11[3] = territory13;
		territory11.Neighbour = arrayterri11;
		
		Territory[] arrayterri12 = new Territory[4];		
		arrayterri12[0] = territory8;
		arrayterri12[1] = territory10;
		arrayterri12[2] = territory13;
		arrayterri12[3] = territory16;
		territory12.Neighbour = arrayterri12;
		
		Territory[] arrayterri13 = new Territory[2];		
		arrayterri13[0] = territory11;
		arrayterri13[1] = territory14;
		territory13.Neighbour = arrayterri13;
		
		Territory[] arrayterri14 = new Territory[4];		
		arrayterri14[0] = territory1;
		arrayterri14[1] = territory3;
		arrayterri14[2] = territory15;
		arrayterri14[3] = territory16;
		territory14.Neighbour = arrayterri14;
		
		Territory[] arrayterri15 = new Territory[4];		
		arrayterri15[0] = territory14;
		arrayterri15[1] = territory16;
		arrayterri15[2] = territory19;
		arrayterri15[3] = territory20;
		territory15.Neighbour = arrayterri15;
		
		Territory[] arrayterri16 = new Territory[5];		
		arrayterri16[0] = territory12;
		arrayterri16[1] = territory14;
		arrayterri16[2] = territory15;
		arrayterri16[3] = territory17;
		arrayterri16[4] = territory19;
		territory16.Neighbour = arrayterri16;
		
		Territory[] arrayterri17 = new Territory[3];		
		arrayterri17[0] = territory16;
		arrayterri17[1] = territory18;
		arrayterri17[2] = territory42;
		territory17.Neighbour = arrayterri17;
		
		Territory[] arrayterri18 = new Territory[4];		
		arrayterri18[0] = territory17;
		arrayterri18[1] = territory23;
		arrayterri18[2] = territory40;
		arrayterri18[3] = territory41;
		territory18.Neighbour = arrayterri18;
		
		Territory[] arrayterri19 = new Territory[4];		
		arrayterri19[0] = territory15;
		arrayterri19[1] = territory16;
		arrayterri19[2] = territory20;
		arrayterri19[3] = territory22;
		territory19.Neighbour = arrayterri19;
		
		Territory[] arrayterri20 = new Territory[3];		
		arrayterri20[0] = territory15;
		arrayterri20[1] = territory19;
		arrayterri20[2] = territory21;
		territory20.Neighbour = arrayterri20;
		
		Territory[] arrayterri21 = new Territory[6];		
		arrayterri21[0] = territory20;
		arrayterri21[1] = territory22;
		arrayterri21[2] = territory26;
		arrayterri21[3] = territory3;
		arrayterri21[4] = territory32;
		arrayterri21[5] = territory46;
		territory21.Neighbour = arrayterri21;
		
		Territory[] arrayterri22 = new Territory[5];		
		arrayterri22[0] = territory19;
		arrayterri22[1] = territory21;
		arrayterri22[2] = territory23;
		arrayterri22[3] = territory24;
		arrayterri22[4] = territory25;
		territory22.Neighbour = arrayterri22;
		
		Territory[] arrayterri23 = new Territory[4];		
		arrayterri23[0] = territory18;
		arrayterri23[1] = territory22;
		arrayterri23[2] = territory24;
		arrayterri23[3] = territory35;
		territory23.Neighbour = arrayterri23;
		
		Territory[] arrayterri24 = new Territory[5];		
		arrayterri24[0] = territory22;
		arrayterri24[1] = territory23;
		arrayterri24[2] = territory25;
		arrayterri24[3] = territory33;
		arrayterri24[4] = territory35;
		territory24.Neighbour = arrayterri24;
		
		Territory[] arrayterri25 = new Territory[5];		
		arrayterri25[0] = territory21;
		arrayterri25[1] = territory22;
		arrayterri25[2] = territory24;
		arrayterri25[3] = territory26;
		arrayterri25[4] = territory32;
		territory25.Neighbour = arrayterri25;		
		
		
		Territory[] arrayterri26 = new Territory[5];		
		arrayterri26[0] = territory21;
		arrayterri26[1] = territory25;
		arrayterri26[2] = territory27;
		arrayterri26[3] = territory30;
		arrayterri26[4] = territory31;
		territory26.Neighbour = arrayterri26;
		
		Territory[] arrayterri27 = new Territory[3];		
		arrayterri27[0] = territory26;
		arrayterri27[1] = territory28;
		arrayterri27[2] = territory30;
		territory27.Neighbour = arrayterri27;
		
		Territory[] arrayterri28 = new Territory[3];		
		arrayterri28[0] = territory27;
		arrayterri28[1] = territory29;
		arrayterri28[2] = territory30;
		territory28.Neighbour = arrayterri28;
		
		Territory[] arrayterri29 = new Territory[3];		
		arrayterri29[0] = territory28;
		arrayterri29[1] = territory29;
		arrayterri29[2] = territory30;
		territory29.Neighbour = arrayterri29;
		
		Territory[] arrayterri30 = new Territory[5];		
		arrayterri30[0] = territory26;
		arrayterri30[1] = territory27;
		arrayterri30[2] = territory28;
		arrayterri30[3] = territory29;
		arrayterri30[4] = territory31;
		territory30.Neighbour = arrayterri30;
		
		Territory[] arrayterri31 = new Territory[4];		
		arrayterri31[0] = territory26;
		arrayterri31[1] = territory29;
		arrayterri31[2] = territory30;
		arrayterri31[3] = territory32;
		territory31.Neighbour = arrayterri31;
		
		Territory[] arrayterri32 = new Territory[6];		
		arrayterri32[0] = territory3;
		arrayterri32[1] = territory21;
		arrayterri32[2] = territory25;
		arrayterri32[3] = territory31;
		arrayterri32[4] = territory33;
		arrayterri32[5] = territory47;
		territory32.Neighbour = arrayterri32;
		
		Territory[] arrayterri33 = new Territory[4];		
		arrayterri33[0] = territory24;
		arrayterri33[1] = territory32;
		arrayterri33[2] = territory34;
		arrayterri33[3] = territory35;
		territory33.Neighbour = arrayterri33;
		
		Territory[] arrayterri34 = new Territory[3];		
		arrayterri34[0] = territory33;
		arrayterri34[1] = territory35;
		arrayterri34[2] = territory36;
		territory34.Neighbour = arrayterri34;
		
		Territory[] arrayterri35 = new Territory[4];		
		arrayterri35[0] = territory23;
		arrayterri35[1] = territory24;
		arrayterri35[2] = territory33;
		arrayterri35[3] = territory34;
		territory35.Neighbour = arrayterri35;
		
		Territory[] arrayterri36 = new Territory[2];		
		arrayterri36[0] = territory34;
		arrayterri36[1] = territory37;
		territory36.Neighbour = arrayterri36;
		
		Territory[] arrayterri37 = new Territory[4];		
		arrayterri37[0] = territory36;
		arrayterri37[1] = territory38;
		arrayterri37[2] = territory39;
		arrayterri37[3] = territory40;
		territory37.Neighbour = arrayterri37;
		
		Territory[] arrayterri38 = new Territory[2];		
		arrayterri38[0] = territory37;
		arrayterri38[1] = territory39;
		territory38.Neighbour = arrayterri38;
		
		Territory[] arrayterri39 = new Territory[5];		
		arrayterri39[0] = territory37;
		arrayterri39[1] = territory38;
		arrayterri39[2] = territory10;
		arrayterri39[3] = territory41;
		arrayterri39[4] = territory43;
		territory39.Neighbour = arrayterri39;
		
		Territory[] arrayterri40 = new Territory[4];		
		arrayterri40[0] = territory19;
		arrayterri40[1] = territory37;
		arrayterri40[2] = territory39;
		arrayterri40[3] = territory41;
		territory40.Neighbour = arrayterri40;
		
		Territory[] arrayterri41 = new Territory[5];		
		arrayterri41[0] = territory18;
		arrayterri41[1] = territory39;
		arrayterri41[2] = territory40;
		arrayterri41[3] = territory42;
		arrayterri41[4] = territory43;
		territory41.Neighbour = arrayterri41;
		
		Territory[] arrayterri42 = new Territory[5];		
		arrayterri42[0] = territory41;
		arrayterri42[1] = territory43;
		arrayterri42[2] = territory44;
		arrayterri42[3] = territory45;
		arrayterri42[4] = territory47;
		territory42.Neighbour = arrayterri42;
		
		Territory[] arrayterri43 = new Territory[4];		
		arrayterri43[0] = territory39;
		arrayterri43[1] = territory41;
		arrayterri43[2] = territory42;
		arrayterri43[3] = territory44;
		territory43.Neighbour = arrayterri43;
		
		Territory[] arrayterri44 = new Territory[3];		
		arrayterri44[0] = territory42;
		arrayterri44[1] = territory43;
		arrayterri44[2] = territory45;
		territory44.Neighbour = arrayterri44;
		
		Territory[] arrayterri45 = new Territory[4];		
		arrayterri45[0] = territory42;
		arrayterri45[1] = territory44;
		arrayterri45[2] = territory46;
		arrayterri45[3] = territory47;
		territory45.Neighbour = arrayterri45;
		
		Territory[] arrayterri46 = new Territory[4];		
		arrayterri46[0] = territory3;
		arrayterri46[1] = territory21;
		arrayterri46[2] = territory32;
		arrayterri46[2] = territory45;
		territory46.Neighbour = arrayterri46;
		
		Territory[] arrayterri47 = new Territory[2];		
		arrayterri47[0] = territory42;
		arrayterri47[1] = territory45;
		territory47.Neighbour = arrayterri47;
		
		
		

		
		// Launch game
		new AppGameContainer(new Game(), 1920, 975, false).start();
	}
	
	public Game() {
		super("Mon risk !");
	}
	

	
	@Override
	public void init(GameContainer container) throws SlickException {
		this.container = container;
		this.map.init();
		// this.player.init();
		// Music background = new Music("sound/son.ogg");
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
