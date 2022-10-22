package Capitulo_5;

/* Code by Jadder Freitas Souza
 * 
 * (Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade.
 * O fatorial de um inteiro positivo n (escrito como n! e pronunciado como
 * “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n.
 * Escreva um aplicativo que calcula os fatoriais de 1 a 20. Utilize o tipo
 * long.
 * Exiba os resultados em formato tabular. Que dificuldade poderia impedir você
 * de calcular o fatorial de 100?
 */

public class Exercicio_13 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.13");

        final int QTDE_NUMEROS = 20;
        long fatorial;
        for (int i = 0; i <= QTDE_NUMEROS; i++) {
            System.out.printf("%2s! = ", i);

            fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println(fatorial);
        }
    }
}
/*
 * A dificuldade de se imprimir o fatorial de 100, neste caso,
 * seria o número não caber no tipo long.
 */