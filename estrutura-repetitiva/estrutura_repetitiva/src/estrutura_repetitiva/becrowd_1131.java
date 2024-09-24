package estrutura_repetitiva;
import java.util.Locale;
import java.util.Scanner;

public class becrowd_1131 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int novaPartida = 1;
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empate = 0;

		while (novaPartida == 1) {
			int golInter = sc.nextInt();
			int golGremio = sc.nextInt();

			if (golInter > golGremio) {
				vitoriasInter = vitoriasInter + 1;
			} 
			else if (golGremio > golInter) {
				vitoriasGremio = vitoriasGremio + 1;
			} 
			else {
				empate = empate + 1;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			novaPartida = sc.nextInt();

		}

		int contagemPartida = vitoriasInter + vitoriasGremio + empate;

		System.out.println(contagemPartida + " grenais");
		System.out.println("Inter: " + vitoriasInter);
		System.out.println("Gremio: " + vitoriasGremio);
		System.out.println("Empates: " + empate);

		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}
			
		sc.close();
	}
}