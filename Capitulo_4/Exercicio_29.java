package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Quadrado de asteriscos) Escreva um aplicativo que solicita
 * ao usuário que insira o tamanho do lado de um quadrado e, então,
 * exibe um quadrado vazio desse tamanho com asteriscos. Seu programa
 * deve trabalhar com quadrados de todos os comprimentos de lado
 * possíveis entre 1 e 20.
 */

public class Exercicio_29 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.29");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int tamanho = 0;

        while (tamanho == 0 || tamanho > 20) {
            System.out.print("Escolha o tamanho do quadrado: ");
            tamanho = t.nextInt();
            System.out.print(tamanho == 0 || tamanho > 20 ? "Tamanho inválido! " : "");
        }

        for (int i = 1; i <= tamanho; i++) {
            System.out.println();

            if (i == 1 || i == tamanho) {
                for (int j = 1; j <= tamanho; j++)
                    System.out.print("*");
            } else {
                for (int j = 1; j <= tamanho; j++)
                    System.out.print(j == 1 || j == tamanho ? "*" : " ");
            }
        }
        t.close();
    }
}