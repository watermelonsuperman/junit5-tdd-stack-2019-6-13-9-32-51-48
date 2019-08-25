package com.thoughtworks.tdd;

public class FizzAndBuzzGame {
	int number;
	public FizzAndBuzzGame(int number){
		this.number = number;
	}
	public String fizzBuzz(int number){
		String result = "";
		if(number % 3 == 0 && number % 5 != 0 && number % 7 != 0){
			result = "fizz";
		}else if(number % 5 == 0 && number % 3 != 0 && number % 7 != 0){
			result = "buzz";
		}else if(number % 7 == 0 && number % 5 != 0 && number % 3 != 0){
			result = "whizz";
		}else if(number % 3 == 0 && number % 5 == 0 && number % 7 != 0){
			result = "fizzbuzz";
		}else if(number % 3 == 0 && number % 7 == 0 && number % 5 != 0){
			result = "fizzwhizz";
		}else if(number % 5 == 0 && number % 7 == 0 && number % 3 != 0){
			result = "buzzwhizz";
		}else if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0){
			result = "fizzbuzzwhizz";
		}else{
			result = new Integer(number).toString();
		}
		
		return result;
	}

}
