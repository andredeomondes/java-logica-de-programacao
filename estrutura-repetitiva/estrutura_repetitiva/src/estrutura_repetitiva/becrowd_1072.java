package estrutura_repetitiva;

import java.util.Scanner;

public class becrowd_1072 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int inCount = 0;
		int outCount = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				inCount += 1;
			} 
			else {
				outCount += 1;
			}

		}

		System.out.println(inCount + " in");
		System.out.println(outCount + " out");

		sc.close();
	}
}
