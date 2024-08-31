import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1017 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horas, velocidade, litros;
		
		horas = sc.nextDouble();
		velocidade = sc.nextDouble();
		litros = (horas * velocidade) / 12;
		System.out.printf("%.3f%n", litros);
		
		sc.close();

	}
}
