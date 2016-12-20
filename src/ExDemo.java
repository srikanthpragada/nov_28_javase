import java.util.InputMismatchException;
import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			try {
				int n = s.nextInt();
				sum += n;
			} catch (InputMismatchException ex) {
                System.out.println("Invalid Number!");
                s.nextLine(); // clear keyboard buffer
			}
		}

		System.out.println(sum);
	}

}
