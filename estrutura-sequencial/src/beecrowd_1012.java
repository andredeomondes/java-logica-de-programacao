import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1012 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		triangulo = (a * c) / 2;
		circulo = Math.pow(c, 2) * 3.14159;
		trapezio = (a + b) * c / 2;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

	}
}
