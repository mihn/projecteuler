package pl.mihn.euler.nine;

/**
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

	a2 + b2 = c2
	For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 * @author mihn
 */
public class Problem9 {
	public static void main(String[] args) {
		for (int a = 0; a <= 1000; a++) {
			for (int b = a + 1; b <= (1000 - a); b++) { // make sure that a < b
				for (int c = b + 1; c <= (1000 - a - b); c++) { // make sure that b < c
					if ((a + b + c == 1000) && (a * a) + (b * b) == (c * c)) { // check other conditions - i have idea about faster way 
						System.out.println("yey " + a + " " + b + " " + c + " " + a * b * c);
					}
				}
			}
		}
	}
}
