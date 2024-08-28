import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double pesoA = 2;
		double pesoB = 3;
		double pesoC = 5;

		double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);
		System.out.printf("MEDIA = %.1f%n", media);
	}

}
