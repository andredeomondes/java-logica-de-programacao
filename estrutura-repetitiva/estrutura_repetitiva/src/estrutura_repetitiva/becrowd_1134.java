package estrutura_repetitiva;

import java.util.Scanner;

public class becrowd_1134 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (n < 0 || n > 4) {
			n = sc.nextInt();
		}

		while (n != 4) {

			if (n == 1) {
				alcool++;

			} else if (n == 2) {
				gasolina++;

			} else if (n == 3) {
				diesel++;
			}
			n = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

	}

}
