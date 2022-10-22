package Capitulo_5;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 *
 * (Gráfico de barras do programa de impressão) Uma aplicação
 * interessante dos computadores é exibir diagramas e gráficos
 * de barras. Escreva um aplicativo que leia cinco números entre
 * 1 e 30. Para cada número que é lido, seu programa deve exibir
 * o mesmo número de asteriscos adjacentes. Por exemplo, se seu
 * programa lê o número 7, ele deve exibir *******. Exiba as
 * barras dos asteriscos depois de ler os cinco números.
 */

public class Exercicio_16 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.16");

        Scanner t = new Scanner(System.in);

        final int QTDE_NUMEROS = 5;
        int numero = 0;

        /*
         * Foram criadas 05 variáveis abaixo, pois neste
         * capítulo do livro ainda não se trabalham os arrays.
         */

        int a = 0, b = 0, c = 0, d = 0, e = 0;
        for (int i = 1; i <= QTDE_NUMEROS; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numero = t.nextInt();
            switch (i) {
                case 1 -> a = numero;
                case 2 -> b = numero;
                case 3 -> c = numero;
                case 4 -> d = numero;
                case 5 -> e = numero;
            }
        }

        System.out.println();

        int j = 0; // auxilia a limitação do loop da var. k
        for (int i = 1; i <= QTDE_NUMEROS; i++) {
            switch (i) {
                case 1 -> j = a;
                case 2 -> j = b;
                case 3 -> j = c;
                case 4 -> j = d;
                case 5 -> j = e;
            }

            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        t.close();
    }
}