package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1143 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			int a = i;
			int b = i * i;
			int c = i * i * i;

			System.out.println(a + " " + b + " " + c);

		}

		sc.close();
	}
}