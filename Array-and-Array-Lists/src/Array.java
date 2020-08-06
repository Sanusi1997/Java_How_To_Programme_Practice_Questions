public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array;
		System.out.println("Index	Value");
		if (args.length == 0) {
			array = new int[10];

			for (int i = 0; i < array.length; i++) {
				array[i] = i;

				System.out.printf("%d\t%d", i, array[i]);

				System.out.println(" ");
			}
		} else {
			int value = Integer.parseInt(args[0]);
			array = new int[value];
			for (int i = 0; i < array.length; i++) {
				array[i] = i;

				System.out.printf("%d\t%d", i, array[i]);

				System.out.println(" ");

			}

		}

	}

}
