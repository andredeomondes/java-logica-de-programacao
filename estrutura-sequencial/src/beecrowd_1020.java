import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1021 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, ano, mes, dia, resto;
		
		N = sc.nextInt();
		resto = N;
		
		ano = N / 365;
		resto = N % 365;
		System.out.println(ano + " ano(s)");
		
		mes = resto / 30;
		resto = resto % 30;
		System.out.println(mes + " mes(es)");
		
		dia = resto;
		System.out.println(dia + " dia(s)");
		
		sc.close();

	}
}
