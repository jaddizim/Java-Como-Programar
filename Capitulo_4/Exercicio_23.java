package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 *
 * (Encontre os dois números maiores) Utilizando uma abordagem
 * semelhante àquela do Exercício 4.21, encontre os dois maiores
 * valores entre os 10 valores inseridos. [Observação: você só
 * pode inserir cada número uma vez.]
 */

public class Exercicio_23 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.23");
        System.out.println();

        Scanner t = new Scanner(System.in);

        final int LIMITE = 10;
        int numero, maior1 = 0, maior2 = 0, cont = 1;

        while (cont <= LIMITE) {
            System.out.print("Digite o " + cont + "º número: \t");
            numero = t.nextInt();

            maior1 = cont == 1 ? numero : (numero > maior1 ? numero : maior1);
            maior2 = cont == 1 ? numero : (numero < maior1 && numero > maior2 ? numero : maior2);

            cont++;
        }
        t.close();

        System.out.printf("Os 2 maiores números são: %d e %d.%n", maior1, maior2);
    }
}