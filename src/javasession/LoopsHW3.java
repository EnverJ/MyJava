package javasession;

public class LoopsHW3 {

	public static void main(String[] args) {
		// 1. WAP to print following output:
		// I am Batman, 5 times

		for (int i = 1; i <= 5; i++) {
			System.out.println("I am batman");
		}
		// 2. WAP to print following output:
		// I am Batman 1-9
		System.out.println("---------------");
		for (int k = 1; k <= 9; k++) {
			System.out.println("I am batman " + k);

		}
		System.out.println("------------");
		// 3. WAP to print 10 to 1 using for, while and for loop
		int m = 10;
		while (m >= 1) {
			System.out.println(m);
			--m;

		}
		System.out.println("---------");
		// for loop
		for (int n = 10; n >= 1; --n) {
			System.out.println(n);
			// 4. Write a program in Java to print "Hello World" ten times using
			// while loop
			System.out.println("------");
			int j = 1;
			while (j <= 10) {
				System.out.println("Hello World");
				j++;

			}
			System.out.println("-----------");

			// 5. Write a program in Java to print 1 to 10 using while loop but
			// quit if multiple of 7 is encountered

			int p = 1;
			while (p <= 10) {
				System.out.println(p++);
				if (p == 7) {
					System.out.println("quit");

					break;

				}

			}

		}

	}

}
