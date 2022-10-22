package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 *
 * (Fatorial) O fatorial de um inteiro não negativo n é escrito como n!
 * (pronuncia-se “n fatorial”) e é definido como segue:
 * n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1) e
 * n! = 1 (para n = 0)
 * Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
 * b) Escreva um aplicativo que estima o valor da constante matemática e utilizando
 * a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular.
 * e = 1/1! + 1/2! + 1/3! + …
 */

public class Exercicio_37b {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.37 b)");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int numero, contador = 1;
        double fatorial = 1, soma = 1;

        System.out.print("Digite um número inteiro não negativo: ");
        numero = t.nextInt();

        /*
         * Foram usados laços 'while', pois neste capítulo
         * ainda não foram estudados os laços 'for'.
         */

        while (numero >= 1) {
            contador = numero;

            while (contador >= 1) {
                fatorial *= (1.0 / contador);
                contador--;
            }

            soma += fatorial;
            numero--;
            fatorial = 1;
        }

        System.out.printf("A constante matemática 'e' é: %.4f.%n", soma);

        t.close();
    }
}