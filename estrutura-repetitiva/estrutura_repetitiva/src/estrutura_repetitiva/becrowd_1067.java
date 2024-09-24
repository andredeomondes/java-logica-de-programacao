package estrutura_repetitiva;

import java.util.Scanner;

public class becrowd_1067 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x % 2 == 0) {
			for (int i = 1; i < x; i += 2) {
				System.out.println(i);
			}
		} else {
			for (int i = 1; i <= x; i += 2) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
