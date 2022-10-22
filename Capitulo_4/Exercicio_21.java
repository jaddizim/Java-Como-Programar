package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Localize o maior número) O processo de localizar o maior valor é muito
 * utilizado em aplicativos de computador. Por exemplo, um programa que
 * determina o vencedor de uma competição de vendas inseriria o número de
 * unidades vendidas por cada vendedor. O vendedor que vende mais unidades
 * ganha a competição. Escreva um programa em pseudocódigo e, então, um
 * aplicativo Java que aceita como entrada uma série de 10 inteiros e
 * determina e imprime o maior dos inteiros. Seu programa deve utilizar
 * pelo menos as três variáveis a seguir: 
 * a) counter: um contador para contar até 10 (isto é, monitorar quantos
 * números foram inseridos e determinar quando todos os 10 números
 * foram processados). 
 * b) number: o inteiro mais recentemente inserido pelo usuário.
 * c) largest: o maior número encontrado até agora.
 */

public class Exercicio_21 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.21");
        System.out.println();

        Scanner t = new Scanner(System.in);

        final int QTY_NUMBERS = 10;
        int number, largest = 0, counter = 1;

        while (counter <= QTY_NUMBERS) {
            System.out.print("Digite o " + counter + "º número: \t");
            number = t.nextInt();
            largest = number > largest ? number : largest;
            counter++;
        }
        t.close();

        System.out.println("O maior número é:\t\t" + largest);
    }
}
