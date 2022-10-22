package Capitulo_5;

/* Code by Jadder Freitas Souza
 * 
 * (Calculando o produto de números inteiros ímpares)
 * Escreva um aplicativo que calcula o produto dos números
 * inteiros ímpares de 1 a 15.
 */

public class Exercicio_12 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.12");

        final int QTDE_NUMEROS = 15;
        int produtoImpares = 1;
        for (int i = 1; i <= QTDE_NUMEROS; i++) {
            produtoImpares *= (i % 2 == 1 ? i : 1);
        }

        System.out.printf("O produto dos números ímpares até 15 é: %,d.", produtoImpares);
    }
}
