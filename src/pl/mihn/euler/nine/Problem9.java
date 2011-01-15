package pl.mihn.euler.nine;

/**
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

	a^2 + b^2 = c^2
	For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 * @author mihn
 */
public class Problem9 {
	public static void main(String[] args) {
		for (int a = 0; a <= 1000; a++) {
			for (int b = a + 1; b <= (1000 - a); b++) { // make sure that a < b
				int c = 1000 - a - b;
				if (b < c && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) { //check if b < c 
					// and a^2 + b^2 = c^2
					System.out.println("yey a:" + a + " b:" + b + " c:" + c + " win:" + a * b * c);
				}
			}
		}
	}
}
