package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1094 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int qteC = 0, qteS = 0, qteR = 0, total = 0;


		for (int i = 0; i < N; i++) {
			int quantidade = sc.nextInt();
			char cobaia = sc.next().charAt(0);

			if (cobaia == 'C') {
				qteC += quantidade;
			} else if (cobaia == 'S') {
				qteS += quantidade;
			} else if (cobaia == 'R') {
				qteR += quantidade;
			}

			total += quantidade;

		}

		double porcentagemC = ((double) qteC / total) * 100.0;
		double porcentagemS = ((double) qteS / total) * 100.0;
		double porcentagemR = ((double) qteR / total) * 100.0;

		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + qteC);
		System.out.println("Total de ratos: " + qteR);
		System.out.println("Total de sapos: " + qteS);

		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemC);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemR);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemS);

		sc.close();
	}
}