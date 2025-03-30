package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		var game = new MarioGame();
		var game2 = new SuperContraGame();
		var game3 = new PacmanGame();

		var gameRunner = new GameRunner(game);
		var gameRunner2 = new GameRunner(game2);
		var gameRunner3 = new GameRunner(game3);

		gameRunner.run();
		gameRunner2.run();
		gameRunner3.run();

	}

}
