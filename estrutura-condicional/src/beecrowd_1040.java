import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1040 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float nota1 = sc.nextFloat();
		float nota2 = sc.nextFloat();
		float nota3 = sc.nextFloat();
		float nota4 = sc.nextFloat();

		float peso1 = 2;
		float peso2 = 3;
		float peso3 = 4;
		float peso4 = 1;

		float media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 + nota4 * peso4)
				/ (peso1 + peso2 + peso3 + peso4) ;

		System.out.printf("Media: %.1f%n", media);

		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media >= 5.0) {

			System.out.println("Aluno em exame.");

			float notaExame = sc.nextFloat();

			System.out.printf("Nota do exame: %.1f%n", notaExame);

			float mediaFinal = (media + notaExame) / 2;

			if (mediaFinal >= 5.0) {

				System.out.println("Aluno aprovado.");
			}

			System.out.printf("Media final: %.1f%n", mediaFinal);

		} else {

			System.out.println("Aluno reprovado.");
		}

		sc.close();

	}
}