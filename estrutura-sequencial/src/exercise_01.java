import java.util.Locale;
import java.util.Scanner;

public class exercise_01 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem-vindo à Calculadora de Área do Retângulo!");

		System.out.print("Digite o valor da largura: ");
		double b = sc.nextDouble();

		System.out.print("Digite o valor do comprimento: ");
		double h = sc.nextDouble();
		
		System.out.print("Digite o preço do terreno: ");
		double price = sc.nextDouble();

		double area = b * h;

		System.out.printf("Área do retângulo = %.2f ", area);

		sc.close();
	}
}
