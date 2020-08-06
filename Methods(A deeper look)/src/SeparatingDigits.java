public class SeparatingDigits {

	public static void separateDigits(int x) {

		if (x > 0 & x < 10) {
			int a = x % 10;
			System.out.printf("%d", a);
		}

		if (x > 9 & x < 99) {
			int a = x / 10;
			int b = x % 10;
			System.out.printf("%d %d", a, b);
		}
		if (x > 99 & x < 999) {
			int a = x / 100;
			int b = (x % 100) / 10;
			int c = (x % 10);
			System.out.printf("%d %d %d", a, b, c);
		}
		if (x > 999 & x < 9999) {
			int a = x / 1000;
			int b = (x % 1000) / 100;
			int c = (x % 100) / 10;
			int d = (x % 10) % 10;
			System.out.printf("%d %d %d %d", a, b, c, d);
		}
		if (x > 9999 & x <= 99999) {
			int a = x / 10000;
			int b = (x % 10000) / 1000;
			int c = (x % 1000) / 100;
			int d = (x % 100) / 10;
			int e = (x % 10);
			System.out.printf("%d %d %d %d %d", a, b, c, d, e);
		}

		if(x > 99999) {
			System.err.print("Value should not be more than 99,999!");
		}
	}
}