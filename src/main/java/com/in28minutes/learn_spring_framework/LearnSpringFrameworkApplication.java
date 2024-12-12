package com.in28minutes.learn_spring_framework;


/*Flow:-
               / Mario                                    / Mario
  GameRunner ->SuperContra ->GameRunner ->GamingConsole ->SuperContra
               \ PacMan                                   \ PacMan
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
	}

}
