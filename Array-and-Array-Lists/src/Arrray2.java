
public class Arrray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];
		int total = 0;
		System.out.printf("%s%8s%n","Index", "Value");
		for (int i = 0; i < array.length; i++) {
			array[i] = (array.length - 1) - i;

			System.out.printf("%5d%8d%n", i, array[i]);
		}
	}

}