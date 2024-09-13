import java.util.Scanner;

public class beecrowd_1070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x % 2 != 0) {
			System.out.println(x);

			for (int i = 0; i < 5; i++) {
				x = x + 2;
				System.out.println(x);
			}
		} else {
			x = x + 1;
			System.out.println(x);
			for (int i = 0; i < 5; i++) {
				x = x + 2;
				System.out.println(x);
			}

		}

		sc.close();

	}
}
