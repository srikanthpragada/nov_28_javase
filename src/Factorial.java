import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		int num, fact;

		Scanner s = new Scanner(System.in);
		num = s.nextInt();

		fact = 1;
		for (int i = 2; i <= num; i++) {
			fact *= i; // fact = fact * i;
		}

		System.out.printf("\nFactorial of %d is %d\n", num, fact);

	}
}