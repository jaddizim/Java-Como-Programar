package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 *
 * (Fatorial) O fatorial de um inteiro não negativo n é escrito como n!
 * (pronuncia-se “n fatorial”) e é definido como segue:
 * n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1) e
 * n! = 1 (para n = 0)
 * Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
 * c) Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir.
 * Permita ao usuário inserir o número de termos a calcular.
 * e(x) = 1 + x(2)/1! + x(3)/2! + x(4)/3! + …
 */

public class Exercicio_37c {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.37 c)");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int numero, contador = 1, volta = 1;
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
                fatorial *= (Math.pow(contador, volta) / contador);
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