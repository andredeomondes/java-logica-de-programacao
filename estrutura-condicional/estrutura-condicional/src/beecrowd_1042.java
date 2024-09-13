import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1042 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int a1 = a;
		int b1 = b;
		int c1 = c;

		if (a > b) {
			int maior = a;
			a = b;
			b = maior;
		}

		if (a > c) {
			int maior = a;
			a = c;
			c = maior;

		}

		if (b > c) {
			int maior = b;
			b = c;
			c = maior;
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);

		sc.close();

	}
}