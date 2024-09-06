import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class beecrowd_1043 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			 else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else {
				System.out.println("TRIANGULO ACUTANGULO");
			} 
			
			 
			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			} 
			else if (A == B || A == C || B == C)  {
				System.out.println("TRIANGULO ISOSCELES");
				}
		}
		
		sc.close();


	}
}