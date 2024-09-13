import java.util.Scanner;

public class beecrowd_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numerosPares = 0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();

			if (n % 2 == 0) {
				numerosPares++;
			}
		}
		
		System.out.println(numerosPares + " valores pares");
		sc.close();

	}
}
