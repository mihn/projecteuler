package pl.mihn.euler.fourteen;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n n/2 (n is even) n 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 40 20 10 5 16 8 4 2 1 It can be seen that this sequence (starting at 13
 * and finishing at 1) contains 10 terms. Although it has not been proved yet
 * (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * @author mihn
 */
public class Problem14 {
	/**
	 * Brute force version :P
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int maxNumber = 0, maxN = 0;
		for (int i = 0; i < 1000000; i++) {
			int number = i;
			int n = 1;
			do {
				number = next(number);
				n++;
				//System.out.println(number);
			} while (number > 1);
			if (n > maxN) {
				maxN = n;
				maxNumber = i;
			}
		}
		System.out.println(maxNumber);
	}

	public static int next(int nr) {
		if (nr % 2 == 0) {
			return nr / 2;
		} else {
			return 3 * nr + 1;
		}
	}
}
