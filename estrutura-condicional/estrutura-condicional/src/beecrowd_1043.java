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

		if (A + B > C && A + C > B && B + C > A) {
			double perimetro = A + B + C;
			System.out.println("Perimetro = " + perimetro);
		} else {
			double area = (A+B)*C/2;
			System.out.println("Area = " + area );
		}
		
		sc.close();

	}
}