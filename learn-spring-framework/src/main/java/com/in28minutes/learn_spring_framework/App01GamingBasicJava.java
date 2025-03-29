package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRuner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		var game = new MarioGame();
		var game2 = new SuperContraGame();
		var game3 = new PacmanGame();
		
		var gameRunner = new GameRuner(game);
		var gameRunner2 = new GameRuner(game2);
		var gameRunner3 = new GameRuner(game3);

		gameRunner.run();
		gameRunner2.run();
		gameRunner3.run();

	}

}

