package com.kata.bnpp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class GameService {

	int getScore(String input) {
		FramesBuilder framesBuilder = new FramesBuilder();
		ScoreCalculator bowlingCalculator = new ScoreCalculator();
		return bowlingCalculator.calculate(framesBuilder.build(input));
	}

}
