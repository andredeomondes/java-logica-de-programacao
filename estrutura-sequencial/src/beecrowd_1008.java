import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = valor * horas;
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		sc.close();

	}

}
