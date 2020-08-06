public class ReversingDigits {

	public static void reverseDigits(int x) {

		if (x > 0 & x < 10) {
			int a = x % 10;
			System.out.printf("%d", a);
		}

		if (x > 9 & x < 99) {
			int a = x / 10;
			int b = x % 10;
			System.out.printf("%d%d", b, a);
		}
		if (x > 99 & x < 999) {
			int a = x / 100;
			int b = (x % 100) / 10;
			int c = (x % 10);
			System.out.printf("%d%d%d",c,b,a);
		}
		if (x > 999 & x < 9999) {
			int a = x / 1000;
			int b = (x % 1000) / 100;
			int c = (x % 100) / 10;
			int d = (x % 10) % 10;
			System.out.printf("%d%d%d%d", d, c, b, a);
		}
		if (x > 9999 & x <= 99999) {
			int a = x / 10000;
			int b = (x % 10000) / 1000;
			int c = (x % 1000) / 100;
			int d = (x % 100) / 10;
			int e = (x % 10);
			System.out.printf("%d%d%d%d%d", e, d, c, b, a);
		}
		if (x > 99999 & x <= 999999) {
			int a = x / 100000;
			int b = (x % 100000) / 10000;
			int c = (x % 10000) / 1000;
			int d = (x % 1000) / 100;
			int e = (x % 100)/ 10;
			int f = (x % 10);
			System.out.printf("%d%d%d%d%d%d",f, e, d, c, b, a);
		}


		if(x > 999999 ) {
			System.err.print("Value should not be more than 999,999!");
		}
	}
}
