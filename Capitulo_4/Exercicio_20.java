package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Calculador de salários) Desenvolva um aplicativo Java que
 * determina o salário bruto de cada um de três empregados.
 * A empresa paga as horas normais pelas primeiras 40 horas
 * trabalhadas por cada funcionário e 50% a mais por todas
 * as horas trabalhadas além das 40 horas. Você recebe uma
 * lista de empregados, o número de horas trabalhadas por
 * eles na semana passada e o salário-hora de cada um. Seu
 * programa deve aceitar a entrada dessas informações para
 * cada empregado e, então, determinar e exibir o salário
 * bruto do empregado. Utilize a classe Scanner para inserir
 * os dados.
 */

public class Exercicio_20 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.20");
        System.out.println();

        Scanner t = new Scanner(System.in);

        final int QTDE_EMPREGADOS = 3;
        int horas;
        double sal, salBruto;

        for (int i = 1; i <= QTDE_EMPREGADOS; i++) {
            System.out.print("Digite o nº de horas trabalhadas do empregado " + i + ": ");
            horas = t.nextInt();

            System.out.print("Digite o valor da hora do empregado " + i + ": R$ ");
            sal = t.nextDouble();

            salBruto = ((horas <= 40) ? (horas * sal) : (40 * sal + (horas - 40) * sal * 1.5));
            System.out.println("O salário bruto do empregado " + i + " é de R$ " + salBruto);

            System.out.println();
        }
        t.close();
    }
}
