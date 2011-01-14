package pl.mihn.euler.nine;

public class Problem9 {
	public static void main(String[] args) {
		for (int a = 0; a <= 1000; a++) {
			for (int b = a + 1; b <= (1000 - a); b++) {
				for (int c = b + 1; c <= (1000 - a - b); c++) {
					if ((a * a) + (b * b) == (c * c) && (a + b + c == 1000)) {
						System.out.println("yey " + a + " " + b + " " + c + " "
								+ a * b * c);
					}
				}
			}
		}
	}
}
