package estrutura_repetitiva;

import java.util.Scanner;

public class becrowd_1074 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			if (number == 0) {
				System.out.println("NULL");
			} else if (number < 0 && number % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			} else if ( number > 0 && number % 2 != 0) {
				System.out.println("ODD POSITIVE");
			} else if (number < 0 && number % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			} else {
				System.out.println("EVEN POSITIVE");
			}
		}

		sc.close();
	}
}
