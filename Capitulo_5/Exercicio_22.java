package Capitulo_5;

/* @author Jadder Freitas Souza
 *
 * (Programa de impressão de triângulos modificado) Modifique a Questão 5.15
 * para combinar seu código dos quatro triângulos de asteriscos separados,
 * de modo que todos os quatro padrões sejam impressos lado a lado.
 * [Dica: faça uso inteligente de loops for aninhados.]
 */

public class Exercicio_22 {

    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.22\n");

        final int BASE = 10;

        for (int i = 1; i <= BASE; i++) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print(j == 0 ? "*" : " ");
                }
                for (int k = 0; k <= BASE - i; k++) {
                    System.out.print(j == 0 ? " " : "*");
                }
                for (int k = 0; k <= BASE - i; k++) {
                    System.out.print(j == 0 ? "*" : " ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(j == 0 ? " " : "*");
                }
            }
            System.out.println();
        }
    }
}