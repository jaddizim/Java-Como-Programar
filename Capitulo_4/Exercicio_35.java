package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Lados de um triângulo) Escreva um aplicativo que lê três
 * valores diferentes de zero inseridos pelo usuário, determina
 * e imprime se eles poderiam representar os lados de um triângulo.
 */

public class Exercicio_35 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.35");
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

        System.out.println();

        System.out.printf("Esses números %spodem corresponder a lados de um triângulo.%n",
                (Math.abs((a - c)) < b && b < (a + c)) ? "" : "não ");

        t.close();
    }
}