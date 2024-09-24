package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1144 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			int a1 = i;
			int a2 = i * i;
			int a3 = i * i * i;
			System.out.println(a1 + " " + a2 + " " + a3);

			int b1 = i;
			int b2 = (i * i) + 1;
			int b3 = (i * i * i) + 1;

			System.out.println(b1 + " " + b2 + " " + b3);

		}

		sc.close();
	}
}