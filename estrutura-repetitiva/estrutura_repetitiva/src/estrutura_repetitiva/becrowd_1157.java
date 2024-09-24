package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1157 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i = 1;
		
		for (i = 1; i <= N; i++) {
			
			if (N % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
