import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class beecrowd_1045 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, A2, BC, maior;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		if (B > A) {
			maior = A;
			A = B;
			B = maior;
		}

		if (C > A) {
			maior = A;
			A = C;
			C = maior;
		}

		A2 = Math.pow(A, 2);
		BC = Math.pow(B, 2) + Math.pow(C, 2);

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}

		else {
			if (A2 > BC) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}

			else if (A2 < BC) {
				System.out.println("TRIANGULO ACUTANGULO");

			} else {
				System.out.println("TRIANGULO RETANGULO");
			}

		}

		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");

		} else if (A == B || A == C || B == C) {
			System.out.println("TRIANGULO ISOSCELES");

		}

		sc.close();

	}
}