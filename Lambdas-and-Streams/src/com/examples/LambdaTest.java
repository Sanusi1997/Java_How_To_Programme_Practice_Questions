package com.examples;
import java.util.stream.*;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] number = {1,2,3,4,5,6,7,8, 9 , 10};
		
		
		System.out.println("Display values in array: ");
		IntStream.of(number)
		.forEach(value -> System.out.printf("%d ", value));
		
		System.out.println();
		
		System.out.println("Display odd numbers in array: ");
		IntStream.of(number)
		.filter(value -> value % 2 != 0)
		.forEach(value -> System.out.printf("%d ", value));
		
		System.out.println();
		
		System.out.println("Display even numbers in array: ");
		IntStream.of(number)
		.filter(value -> value % 2 == 0)
		.forEach(value -> System.out.printf("%d ", value));
		
		System.out.println();
		
		System.out.println("sum numbers in array: ");
		System.out.printf("%d", IntStream.of(number)
		.reduce(0, (x,y) ->  x + y));
		
		
		
		
		
		
		
		
		

	}

}
