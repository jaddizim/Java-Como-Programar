package Capitulo_5;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Localize o menor valor) Escreva um aplicativo
 * que localiza o menor de vários números inteiros.
 * Suponha que o primeiro valor lido especifica
 * o número de valores a serem inseridos pelo usuário.
 */

public class Exercicio_11 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.11");

        Scanner t = new Scanner(System.in);

        System.out.print("Digite quantos números quer verificar: ");
        int contador = t.nextInt();

        System.out.println();

        int numero = 0, menor = 0;
        for (int i = 1; i <= contador; i++) {
            System.out.print("Digite um número: ");
            numero = t.nextInt();
            menor = ((i == 1) ? numero : (numero < menor ? numero : menor));
        }

        System.out.println("\nO menor número digitado foi: " + menor + ".");

        t.close();
    }
}
