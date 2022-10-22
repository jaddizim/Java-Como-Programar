package Capitulo_4;

/* Code by Jadder Freitas Souza
 * 
 * (Múltiplos de 2 com um loop infinito) Escreva um aplicativo
 * que continue exibindo na janela de comando os múltiplos do
 * inteiro 2 — a saber, 2, 4, 8, 16, 32, 64 e assim por diante.
 * Seu loop não deve terminar (isto é, deve criar um loop infinito).
 * O que acontece quando você executa esse programa?
 */

public class Exercicio_33 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.33");
        System.out.println();

        int potencia = 1;

        while (potencia > 0) {
            System.out.printf("%d ", (int) Math.pow(2, potencia));
            potencia++;
        }
    }
}