package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Saída no formato de tabela) Escreva um aplicativo Java que utiliza
 * um loop para imprimir a seguinte tabela de valores:
 * N 10*N 100*N 1000*N
 * 1 10   100   1000
 * 2 20   200   2000
 * 3 30   300   3000
 * 4 40   400   4000
 * 5 50   500   5000
 */

public class Exercicio_22 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.22");
        System.out.println();

        Scanner t = new Scanner(System.in);

        System.out.println("N\t10*N\t100*N\t1000*N");

        final int LIMITE = 5;
        int cont = 1;

        while (cont <= LIMITE) {
            System.out.println(cont + "\t" + 10 * cont
                    + "\t" + 100 * cont + "\t" + 1000 * cont);
            cont++;
        }
        t.close();
    }
}