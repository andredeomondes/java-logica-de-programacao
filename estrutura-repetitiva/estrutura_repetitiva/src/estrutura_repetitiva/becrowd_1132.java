package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1132 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int maior = 0;

		if (x > y) {
			maior = x;
			x = y;
			y = maior;

		}

		int soma = 0;

		for (int i = x; i <= y; i++) {
			if (i % 13 != 0) {
				soma = soma + i;
			}

		}

		System.out.println(soma);
		sc.close();
	}
}
