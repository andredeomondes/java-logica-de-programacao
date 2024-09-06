import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		// Recebendo valores
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();

		//Convertendo para minutos
		int momentoInicial = horaInicial * 60 + minutoInicial;
		int momentoFinal = horaFinal * 60 + minutoFinal;
		
		int duracao;
		
		if (momentoInicial < momentoFinal) {
			duracao = momentoFinal - momentoInicial;
		} else {
			duracao = (24 * 60 - momentoInicial) + momentoFinal;
		}
		
		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");


	}

}
