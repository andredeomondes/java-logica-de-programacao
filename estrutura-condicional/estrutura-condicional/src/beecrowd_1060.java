import java.util.Scanner;

public class beecrowd_1060 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int contadorPositivos = 0;

		for (int i = 0; i < 6; i++) {
			double valor = sc.nextDouble();

			if (valor > 0) {
				contadorPositivos++;
			}
		}

		System.out.println(contadorPositivos + " valores positivos");

		sc.close();
	}
}