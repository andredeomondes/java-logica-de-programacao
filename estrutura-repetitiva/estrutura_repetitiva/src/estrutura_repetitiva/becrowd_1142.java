package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1142 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a = -3;
		int b = -2;
		int c = -1;

		for (int i = 0; i < N; i++) {
			a += 4;
			b += 4;
			c += 4;

			System.out.println(a + " " + b + " " + c + " PUM");

		}

		sc.close();
	}
}