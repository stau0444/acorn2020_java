package test.main;

import test.mypac.Drill;
import test.mypac.Multiplayer;
import test.mypac.Multiplayer1;
import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Multiplayer mp=new Multiplayer();
		useRemocon(mp);
		useDrill(mp); 
		useMultipPlayer(mp);
		Multiplayer1 mp1=new Multiplayer1();
		useRemocon(mp1);
		useDrill(mp1);
		useMultipPlayer1(mp1);
	}
	
	
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	public static void useDrill(Drill d) {
		d.hole();
	}
	public static void useMultipPlayer(Multiplayer mp) {
		mp.up();
		mp.down();
		mp.hole();
	}
	public static void useMultipPlayer1(Multiplayer1 mp) {
		mp.up();
		mp.down();
		mp.hole();
	}
}
