import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double N, salario, reajuste;
		int percentual;

		N = sc.nextDouble();

		if (N >= 0 && N <= 400) {
			salario = N * 1.15;
			reajuste = N * 0.15;
			percentual = 15;
		} else if (N >= 400.01 && N <= 800.00) {
			salario = N * 1.12;
			reajuste = N * 0.12;
			percentual = 12;

		} else if (N >= 800.01 && N <= 1200.00) {
			salario = N * 1.10;
			reajuste = N * 0.10;
			percentual = 10;

		} else if (N >= 1200.01 && N <= 2000.00) {
			salario = N * 1.07;
			reajuste = N * 0.07;
			percentual = 7;
		} else {
			salario = N * 1.04;
			reajuste = N * 0.04;
			percentual = 4;

		}

		System.out.printf("Novo salario: %.2f%n", salario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");

	}

}
