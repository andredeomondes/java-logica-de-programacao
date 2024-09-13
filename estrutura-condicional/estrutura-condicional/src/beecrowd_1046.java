import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial, duracao, horaFinal;

		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		duracao = 0;

		if (horaFinal > horaInicial) {

			duracao = horaFinal - horaInicial;

		} else if (horaFinal < horaInicial) {
			duracao = 24 - (horaInicial - horaFinal) ;
		} else {
			duracao = 24;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	}

}
