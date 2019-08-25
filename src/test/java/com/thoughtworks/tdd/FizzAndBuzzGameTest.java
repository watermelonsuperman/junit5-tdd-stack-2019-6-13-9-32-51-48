package com.thoughtworks.tdd;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class FizzAndBuzzGameTest {
	
	@Test
	public void should_return_1_when_fizzBuzz_given_1(){
		int number = 1;
		FizzAndBuzzGame fizzAndBuzzGame = new FizzAndBuzzGame(number);
		Assertions.assertEquals("1", fizzAndBuzzGame.fizzBuzz(number));
	}
	@Test
	public void should_return_fizz_when_fizzBuzz_given_3(){
		int number = 3;
		FizzAndBuzzGame fizzAndBuzzGame = new FizzAndBuzzGame(number);
		Assertions.assertEquals("fizz", fizzAndBuzzGame.fizzBuzz(number));
	}
	@Test
	public void should_return_buzz_when_fizzBuzz_given_5(){
		int number = 5;
		FizzAndBuzzGame fizzAndBuzzGame = new FizzAndBuzzGame(number);
		Assertions.assertEquals("buzz", fizzAndBuzzGame.fizzBuzz(number));
	}
	@Test
	public void should_return_whiss_when_fizzBuzz_given_7(){
		int number = 7;
		FizzAndBuzzGame fizzAndBuzzGame = new FizzAndBuzzGame(number);
		Assertions.assertEquals("whizz", fizzAndBuzzGame.fizzBuzz(number));
	}
	@Test
	public void should_return_fizzbuzz_when_fizzBuzz_given_15(){
		int number = 15;
		FizzAndBuzzGame fizzAndBuzzGame = new FizzAndBuzzGame(number);
		Assertions.assertEquals("fizzbuzz", fizzAndBuzzGame.fizzBuzz(number));
	}
	@Test
	public void should_return_fizzwhiss_when_fizzBuzz_given_21(){
		int number = 21;
		FizzAndBuzzGame fizzAndBuzzGame = new FizzAndBuzzGame(number);
		Assertions.assertEquals("fizzwhizz", fizzAndBuzzGame.fizzBuzz(number));
	}
	@Test
	public void should_return_buzzwhiss_when_fizzBuzz_given_35(){
		int number = 35;
		FizzAndBuzzGame fizzAndBuzzGame = new FizzAndBuzzGame(number);
		Assertions.assertEquals("buzzwhizz", fizzAndBuzzGame.fizzBuzz(number));
	}
	@Test
	public void should_return_fizzbuzzwhiss_when_fizzBuzz_given_105(){
		int number = 105;
		FizzAndBuzzGame fizzAndBuzzGame = new FizzAndBuzzGame(number);
		Assertions.assertEquals("fizzbuzzwhizz", fizzAndBuzzGame.fizzBuzz(number));
	}
}
