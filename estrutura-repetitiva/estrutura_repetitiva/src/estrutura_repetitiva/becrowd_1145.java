package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1145 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		for (int i = 1; i <= Y; i++) {
			System.out.print(i);

			if (i % X == 0) {
				System.out.println();
				System.out.print(" ");
			}
		}

		sc.close();
	}
}