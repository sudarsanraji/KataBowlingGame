package com.kata.bnpp;

import org.junit.jupiter.api.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GameServiceTest {
	private GameService bowlingGame;

	@Autowired
	@Before
	public void setUp() throws Exception {
		bowlingGame = new GameService();
	}

	@Test
	public void noSpareAndNoStrike() throws Exception {
		int score = bowlingGame.getScore("12345123451234512345");
		assertThat(score, is(60));
	}

	@Test
	public void allStrikes() throws Exception {
		int score = bowlingGame.getScore("XXXXXXXXXXXX");
		assertThat(score, is(300));
	}

	@Test
	public void allSpares() throws Exception {
		int score = bowlingGame.getScore("5/5/5/5/5/5/5/5/5/5/5");
		assertThat(score, is(150));
	}

	@Test
	public void ninePinsDownEachRound() throws Exception {
		int score = bowlingGame.getScore("9-9-9-9-9-9-9-9-9-9-9");
		assertThat(score, is(90));
	}
}
