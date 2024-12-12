package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
	//After creating GamingConsole Interface we don't need to change the code of GameRunner class(Loosely coupled)
	//GameRunner class is Tightly coupled to MarioGame
	//MarioGame game;
	
	//private SuperContraGame game;
	
	private GamingConsole game;
	
	/*public GameRunner(MarioGame game) {
		this.game = game;
	}*/
	/*
	public GameRunner(SuperContraGame game) {
		this.game = game;
	}*/
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	

	public void run() {
		System.out.println("Running game: "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

	

}
