package Capitulo_5;

/* Code by Jadder Freitas Souza
 *
 * (Calculando o valor de pi) Calcule o valor de pi a partir de uma série infinita
 *      pi = 4 - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + …
 * Imprima uma tabela que mostre o valor aproximado de pi calculando os 200.000
 * primeiros termos dessa série. Quantos termos você tem de utilizar antes de
 * primeiro obter um valor que começa com 3,14159?
 */

public class Exercicio_20 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.20\n");

        double pi = 4;

        System.out.printf("%s%20s%n", "Termo ", "Valor aproximado");

        for (int i = 1; i <= 200000; i++) {
            pi += (double) 4 / (2 * i + 1) * (i % 2 == 1 ? -1 : 1);

            System.out.printf("%-6d%20.5f%n", i, pi);
        }
    }
}