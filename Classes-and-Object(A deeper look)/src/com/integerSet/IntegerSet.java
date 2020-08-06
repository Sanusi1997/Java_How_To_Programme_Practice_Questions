package com.integerSet;

public class IntegerSet {

	private static boolean[] set = new boolean[101];

	public IntegerSet() {

	}

	public IntegerSet(boolean[] set) {
		this.set = set;

	}

	public static boolean[] getSet() {
		return set;
	}

	public static void setSet(boolean[] set) {
		IntegerSet.set = set;
	}

	public static boolean[] union(int[] array1, int[] array2) {

		for (int j = 0; j < array1.length; j++) {

			try {
				set[array1[j]] = true;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		for (int k = 0; k < array2.length; k++) {
			
			try {
				if (array2[k] < 0 || array2[k] > 100) {
					throw new ArrayIndexOutOfBoundsException(array2[k] + " is invalid\nNumber should not be less than 0 or greater than 100");
				}
					
				set[array2[k]] = true;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}

		return set;
	}
	public static boolean[] intersect(int[] array1, int[] array2) {

		for (int j = 0; j < array1.length; j++) {
			for (int i = 0; i < array2.length; i++) {
				if (array1[j] == array2[i]) {
					
					set[array1[j]] = true;
					
				} 
			}
		

		
	}
		return set;
		
}

}