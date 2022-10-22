package Capitulo_5;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 *
 * (Calculando vendas) Um varejista on-line vende cinco produtos cujos
 * preços no varejo são como a seguir: produto 1, US$ 2,98; produto 2,
 * US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87.
 * Escreva um aplicativo que leia uma série de pares de números como segue:
 *  a) número de produto
 *  b) quantidade vendida
 * Seu programa deve utilizar uma instrução switch para determinar o preço
 * de varejo de cada produto. Você deve calcular e exibir o valor de
 * varejo total de todos os produtos vendidos. Utilize um loop controlado
 * por sentinela para determinar quando o programa deve parar o loop e
 * exibir os resultados finais.
 */

public class Exercicio_17 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.17");
        System.out.println();

        Scanner t = new Scanner(System.in);

        double valor = 1, total = 0;
        int produto, quantidade;

        System.out.println("PRODUTO 1: US$ 2,98");
        System.out.println("PRODUTO 2: US$ 4,50");
        System.out.println("PRODUTO 3: US$ 9,98");
        System.out.println("PRODUTO 4: US$ 4,49");
        System.out.println("PRODUTO 5: US$ 6,87");

        do {
            System.out.println();
            System.out.print("Digite o nº produto ou 0 para sair: ");
            produto = t.nextInt();

            if (produto == 0) break;

            switch (produto) {
                case 1 -> valor = 2.98;
                case 2 -> valor = 4.50;
                case 3 -> valor = 9.98;
                case 4 -> valor = 4.49;
                case 5 -> valor = 6.87;
            }

            System.out.print("Digite a quantidade comprada: ");
            quantidade = t.nextInt();

            total += valor * quantidade;

            System.out.printf("Total parcial: US$ %.2f.%n", total);
        } while (produto != 0);

        t.close();

        System.out.printf("%nTotal das compras: US$ %.2f.", total);
    }
}