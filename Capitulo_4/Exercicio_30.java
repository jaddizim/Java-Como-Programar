package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Palíndromos) Um palíndromo é uma sequência de caracteres que
 * é lida da esquerda para a direita ou da direita para a esquerda.
 * Por exemplo, cada um dos seguintes inteiros de cinco dígitos é
 * um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo
 * que lê em um inteiro de cinco dígitos e determina se ele é ou não
 * um palíndromo. Se o número não for de cinco dígitos, exiba uma
 * mensagem de erro e permita que o usuário insira um novo valor.
 */

public class Exercicio_30 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.30");
        System.out.println();

        Scanner t = new Scanner(System.in);

        String n = "";

        while (n.length() != 5) {
            System.out.print("Insira um número com 05 dígitos: ");
            n = t.nextLine();

            if (n.length() != 5) {
                System.out.print("Este número não tem 05 dígitos. ");
            }
        }

        System.out.printf("Este número %s um palíndromo.",
                n.charAt(0) == n.charAt(4) && n.charAt(1) == n.charAt(3) ? "é" : "não é");

        t.close();
    }
}