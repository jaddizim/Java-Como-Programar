package Capitulo_5;

/* Code by Jadder Freitas Souza
 *
 * (Programa de juros compostos modificado) Modifique o aplicativo
 * de juros compostos da Figura 5.6 para repetir os passos para taxas
 * de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para
 * variar a taxa de juros.
 */

public class Exercicio_14 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.14");
        System.out.println();

        double amount; // quantia em depósito ao fim de cada ano
        double principal = 1000; // quantidade inicial antes dos juros
        double rate = 0.05; // taxa de juros

        for (int j = 5; j <= 10; j++) {
            System.out.printf("TAXA DE JUROS: %,7.1f%%.%n", rate * 100);
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");

            for (int year = 1; year <= 10; year++) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }

            rate += 0.01;

            System.out.println();
        }
    }
}
