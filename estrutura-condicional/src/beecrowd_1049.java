import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1049 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String linha1 = sc.nextLine();
		String linha2 = sc.nextLine();
		String linha3 = sc.nextLine();

		if (linha1.equals("vertebrado")) {
			if (linha2.equals("ave")) {
				if (linha3.equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (linha3.equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		}

		else {

			if (linha2.equals("inseto")) {
				if (linha3.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			}

			else {

				if (linha3.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}

		}

	}

}
