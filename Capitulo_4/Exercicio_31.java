package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo
 * que insere um número inteiro que contém somente 0s e 1s (isto é, um número
 * inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores
 * de resto e divisão para pegar os dígitos do número binário um de cada vez da
 * direita para a esquerda. No sistema de números decimais, o dígito mais à direita
 * tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de
 * 10, depois 100, depois 1.000 e assim por diante. O número decimal 234 pode ser
 * interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito
 * mais à direita tem um valor posicional de 1, o próximo dígito à esquerda um valor
 * posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
 * do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]
 */

public class Exercicio_31 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.31");
        System.out.println();

        Scanner t = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String binario = t.nextLine();

        int contador = 0, decimal = 0;

        while (contador < binario.length()) {
            decimal += (int) (Character.getNumericValue(binario.charAt(contador))
                    * Math.pow(2, binario.length() - 1 - contador));
            contador++;
        }

        System.out.println();

        System.out.printf("O número binário %s é equivalente" +
                "ao número decimal %d.", binario, decimal);

        t.close();
    }
}