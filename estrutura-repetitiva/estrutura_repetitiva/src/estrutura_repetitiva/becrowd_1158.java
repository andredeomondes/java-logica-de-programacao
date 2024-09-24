package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1158 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		while (M > 0 && N > 0) {

			int maior = 0;

			if (M > N) {
				maior = M;
				M = N;
				N = maior;
			}

			int soma = 0;

			for (int i = M; i <= N; i++) {
				soma += i;
				System.out.print(i);
				System.out.print(" ");
			}

			System.out.println("Sum=" + soma);

			M = sc.nextInt();
			N = sc.nextInt();

		}

		sc.close();
	}
}