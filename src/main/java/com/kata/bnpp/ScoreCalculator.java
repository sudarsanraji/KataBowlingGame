package com.kata.bnpp;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScoreCalculator {

	int calculate(List<FrameDTO> frames) {
		int totalScore = 0;
		for (int index = 0; index < frames.size(); index++) {
			totalScore += calculateEachFrame(frames, index);
		}
		return totalScore;
	}

	private int calculateEachFrame(List<FrameDTO> frames, int index) {
		FrameDTO frame = frames.get(index);
		if (frame.isBonus()) {
			return 0;
		}
		if (frame.isSpare()) {
			return frame.calculateScore() + frame.getBonus();
		}
		if (frame.isStrike()) {
			return frame.calculateScore() + frame.getBonus();
		}
		return frame.calculateScore();
	}
}
