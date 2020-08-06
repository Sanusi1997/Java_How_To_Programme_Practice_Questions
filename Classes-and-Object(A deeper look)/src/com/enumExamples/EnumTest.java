package com.enumExamples;
import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Phone Models and Year made");
		
		
		for(Phone phones : Phone.values()) {
			
			System.out.printf("%4s%8s%8s%n", phones.getModel(), phones.getCountry(), phones.getYear());
		}
		
		System.out.println();
		for(Phone phones : EnumSet.range(Phone.NOKIA, Phone.SAMSUNG)) {
			System.out.printf("%4s%8s%8s%n", phones.getModel(), phones.getCountry(), phones.getYear());
			
		}
	}

}
