package Capitulo_4;

import java.util.Scanner;
/* Code by Jadder Freitas Souza
 *
 * (Fatorial) O fatorial de um inteiro não negativo n é escrito como n!
 * (pronuncia-se “n fatorial”) e é definido como segue:
 * n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1) e
 * n! = 1 (para n = 0)
 * Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
 * a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.
 */

public class Exercicio_37a {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.37 a)");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int numero = 0, fatorial = 1, contador = 1;

        System.out.print("Digite um número inteiro não negativo: ");
        numero = t.nextInt();

        /*
         * Foram usados laços com 'while', pois neste capítulo
         * ainda não foram estudados os laços 'for'.
         */

        while (contador <= numero) {
            fatorial *= numero;
            numero--;
        }

        System.out.printf("O fatorial do número digitado é: %d.%n", fatorial);

        t.close();
    }
}