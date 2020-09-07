package com.examplesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class LambdaUnitTest {

	int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	void numberNotNullTestAndLengthOfNumber() {

		assertNotNull(number);
		assertEquals(number.length, 10);

	}

	@Test
	void sumEvenNumbers(){
		
		int sum = IntStream.of(number)
					.filter(value -> value % 2== 0)
					.reduce(0, (x,y)-> x+y );
		
		assertEquals(sum, 30);
		

	}

}
