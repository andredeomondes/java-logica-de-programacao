package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1154 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		double quantidadeIdade = 0;
		double somaIdades = 0;

		while (n > 0) {

			somaIdades += n;
			quantidadeIdade = quantidadeIdade + 1;
			n = sc.nextDouble();
		}

		double media = somaIdades/quantidadeIdade;
		System.out.printf("%.2f%n", media);
	}

}
