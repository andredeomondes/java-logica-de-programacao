import java.util.Scanner;

public class beecrowd_1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numerosPares = 0;
		int numerosImpares = 0;
		int numerosPositivos = 0;
		int numerosNegativos = 0;

		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();

			if (n % 2 == 0) {
				numerosPares++;
			}

			if (n % 2 != 0) {
				numerosImpares++;
			}

			if (n < 0) {
				numerosNegativos++;
			}

			if (n > 0) {
				numerosPositivos++;
			}

		}

		System.out.println(numerosPares + " valor(es) par(es)");
		System.out.println(numerosImpares + " valor(es) impar(es)");
		System.out.println(numerosPositivos + " valor(es) positivo(s)");
		System.out.println(numerosNegativos + " valor(es) negativo(s)");
		sc.close();

	}
}
