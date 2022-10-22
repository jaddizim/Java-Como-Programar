package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 *
 * (Calculador de comissão de vendas) Uma grande empresa paga seu pessoal
 * de vendas com base em comissões. O pessoal de vendas recebe R$ 200
 * por semana mais 9% de suas vendas brutas durante esse período.
 * Por exemplo, um vendedor que realiza um total de vendas de mercadorias
 * de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total
 * de R$ 650. Foi-lhe fornecida uma lista dos itens vendidos por cada vendedor.
 * Os valores desses itens são como segue:
 * Item Value
 * 1    239.99
 * 2    129.75
 * 3    99.95
 * 4    350.89
 * Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um
 * vendedor durante a última semana e calcula e exibe os rendimentos do
 * vendedor. Não existe nenhum limite para o número de itens que pode ser
 * vendido.
 */

public class Exercicio_19 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.19");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int item, qtItem = 0;
        double preco = 0, total = 0;

        System.out.printf("%-18sR$%7s%n", "Item 01", "239,99");
        System.out.printf("%-18sR$%7s%n", "Item 02", "129,75");
        System.out.printf("%-18sR$%7s%n", "Item 03", "99,95");
        System.out.printf("%-18sR$%7s%n%n", "Item 04", "350,89");

        do {
            System.out.print("Digite o código do item vendido ou 0 para sair: ");
            item = t.nextInt();

            switch (item) {
                case 0:
                    preco = 0;
                    break;
                case 1:
                    preco = 239.99;
                    break;
                case 2:
                    preco = 129.75;
                    break;
                case 3:
                    preco = 99.95;
                    break;
                case 4:
                    preco = 350.89;
                    break;
                default: {
                    System.out.println("Opção inválida.");
                    item = 0;
                }
            }

            if (item != 0) {
                System.out.print("Qual a quantidade vendida? ");
                qtItem = t.nextInt();
                if (qtItem > 0) total += preco * qtItem;
                else {
                    System.out.println("Quantidade inválida.\n");
                    qtItem = 1;
                }
            }
        } while (item != 0);

        if (total == 0)
            System.out.print("\nPrograma encerrado.");
        else
            System.out.printf("%n%s%.2f%n", "Rendimento semanal do vendedor: R$ ", total * 0.09 + 200);

        t.close();
    }
}