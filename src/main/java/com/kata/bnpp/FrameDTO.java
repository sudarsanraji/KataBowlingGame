package com.kata.bnpp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import static java.lang.Integer.parseInt;

@SpringBootApplication
public class FrameDTO {

	static final String STRIKE_SIGNAL = "X";
	static final String SPARE_SIGNAL = "/";
	static final String EMPTY = "";
	static final String LINE = "-";
	private String first;
	private String second;

	FrameDTO(String first, String second) {
		this.first = first;
		this.second = second;
	}

	FrameDTO() {

	}

	@Bean
	int calculateScore() {
		return isSpare() || isStrike() ? 10 : getFirstScore() + getSecondScore();
	}

	boolean isSpare() {
		return SPARE_SIGNAL.equals(second);
	}

	boolean isStrike() {
		return STRIKE_SIGNAL.equals(first);
	}

	int getFirstScore() {
		return EMPTY.equals(first) || LINE.equals(first) ? 0 : parseInt(first);
	}

	private int getSecondScore() {
		return EMPTY.equals(second) || LINE.equals(second) ? 0 : parseInt(second);
	}
}
