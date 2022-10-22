package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Lados de um triângulo direito) Escreva um aplicativo que lê três
 * inteiros diferentes de zero, determina e imprime se eles poderiam
 * representar os lados de um triângulo direito.
 */

public class Exercicio_36 {
    public static void main(String[] args) {
        System.out.println("\nRESOLUÇÃO DO EXERCÍCIO 4.36\n");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int a = 0, b = 0, c = 0, numero = 0, contador = 1;

        while (contador <= 3) {
            System.out.print("Digite um número inteiro diferente de 0: ");
            numero = t.nextInt();

            a = contador == 1 ? numero : a;
            b = contador == 2 ? numero : b;
            c = contador == 3 ? numero : c;

            contador++;
        }

        System.out.printf("Esses números %scorrespondem a lados de um triângulo retângulo.%n",
                Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) ||
                        Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) ||
                        Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)
                                ? ""
                                : "não ");

        t.close();
    }
}