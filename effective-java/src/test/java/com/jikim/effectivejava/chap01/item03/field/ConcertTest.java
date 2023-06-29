package com.jikim.effectivejava.chap01.item03.field;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcertTest {

	@Test
	void tdd() {
		Concert concert = new Concert(new MockElvis());
		concert.perform();

		assertTrue(concert.isLightsOn());
		assertTrue(concert.isMainStateOpen());
	}
}