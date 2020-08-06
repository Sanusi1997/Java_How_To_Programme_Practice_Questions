package com.integerSet;

public class IntegerSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerSet setStatus = new IntegerSet();

		int[] numbersInSet1 = { 80, 25, 29, 100, 24, 1, 2, 5, 7 };
		int[] numbersInSet2 = { 81, 23, 22, 101, 22, 7, 8, 9 };

		boolean[] setUnion = IntegerSet.union(numbersInSet1, numbersInSet2);
		boolean[] setIntersect = IntegerSet.intersect(numbersInSet1, numbersInSet2);

		for (int counter = 0; counter < setUnion.length; counter++) {

			System.out.printf("%d\t%s%n", counter, setUnion[counter]);

		}
		for (int counter = 0; counter < setIntersect.length; counter++) {

			System.out.printf("%d\t%s%n", counter, setIntersect[counter]);

		}

	}
}
