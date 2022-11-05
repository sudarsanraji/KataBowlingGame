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
}