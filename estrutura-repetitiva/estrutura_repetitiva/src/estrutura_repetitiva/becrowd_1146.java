package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class becrowd_1146 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		while (x != 0) {
			
			for (int i=1; i<x; i++) {
				System.out.print(i + " ");
			}
			System.out.println(x);
			
			x = sc.nextInt();
		}
		
		sc.close();
	}
}