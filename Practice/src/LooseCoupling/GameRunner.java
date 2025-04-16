package LooseCoupling;



public class GameRunner {
	Operation game;
	GameRunner(Operation game)
	{
		this.game = game;
	}
	void run()
	{
		game.left();
		game.right();
		game.down();
		game.up();
	}
}
