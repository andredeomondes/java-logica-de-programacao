import java.util.Scanner;

public class beecrowd_1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valoresPositivos = 0;
        float soma = 0;

        for (int i = 0; i < 6; i++) {
            float valor = sc.nextFloat();
            
            if (valor > 0) {
                valoresPositivos++;
                soma += valor;
            }
        }

        float media = (float) ((valoresPositivos > 0) ? soma / valoresPositivos : 0.0);

        System.out.println(valoresPositivos + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();
    }
}
