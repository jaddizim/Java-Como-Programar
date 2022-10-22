package Capitulo_4;

/* Code by Jadder Freitas Souza
 *
 * O que o seguinte programa imprime?
 */

public class Exercicio_26 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.26");
        System.out.println();

        int row = 10;
        while (row >= 1) {
            int column = 1;
            while (column <= 10) {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            }
            --row;
            System.out.println();
        }
    }
}