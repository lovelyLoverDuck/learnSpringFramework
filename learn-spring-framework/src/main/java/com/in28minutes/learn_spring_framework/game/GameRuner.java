package com.in28minutes.learn_spring_framework.game;

public class GameRuner {
	private GamingConsole game;

	public GameRuner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game:" + game);
		game.up();
		game.down();
		game.left();
		game.right();
		

	}
}
