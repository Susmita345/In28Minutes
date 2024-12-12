package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Coupling:How much work is involved in changing something?
//you can take laptop anywhere but computer is not possible
		
//Tightly coupled
/*What is Var
 var : Simplifies code
 New features in Java 10:Introduced in Java10
 Type Interface: Allows the compiler to infer the type of the variable based on the value assigned
 Readable Code: Improves code readability by reducing boilerplate
 Instead of using specific type we can use "var"
 For ex. List<String> names = List.of("Alice","Bob","Charlie");
 use var names = List.of("Alice","Bob","Charlie");
  */
		//1.Instead of using MarioGame marioGame = new MarioGame(); use var
		//var marioGame = new MarioGame();
		
		/*var superContraGame= new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);*/
		
		//GameRunner gameRunner = new gameRunner();
		//var gameRunner = new GameRunner(marioGame);
		
		//Comment and uncomment below 
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PacmanGame(); //1. Object creation
		
		var gameRunner = new GameRunner(game); 
		//2: Object creation + Wiring of Dependencies
		//Game is a Dependency of GameRunner

		gameRunner.run();

	}

}
