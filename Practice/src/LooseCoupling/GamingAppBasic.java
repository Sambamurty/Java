package LooseCoupling;

public class GamingAppBasic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game = new Mario();
		var gm = new GameRunner(game);
		gm.run();
	}

}
