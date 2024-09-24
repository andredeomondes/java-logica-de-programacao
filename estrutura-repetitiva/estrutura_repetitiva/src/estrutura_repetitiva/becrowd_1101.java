package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1101 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int soma = 0;
			int contagem = 0;

			for (int z = x; contagem < y; z++) {
				if (z % 2 != 0) {
					soma += z;
					contagem += 1;
				}
			}
			System.out.println(soma);

		}

		sc.close();
	}
}