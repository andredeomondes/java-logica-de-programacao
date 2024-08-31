import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1019 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, horas, resto, minutos, segundos;
		
		N = sc.nextInt();
		
		horas = N / 3600;
		resto = N % 3600;
		
		minutos = resto / 60;

		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		
		sc.close();

	}
}
