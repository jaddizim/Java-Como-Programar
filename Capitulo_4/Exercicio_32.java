package Capitulo_4;

/* Code by Jadder Freitas Souza
 * 
 * (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo
 * que utiliza apenas as instruções de saída
 * System.out.print("* ");
 * System.out.print(" ");
 * System.out.println();
 * para exibir o padrão de tabuleiro de damas a seguir. Uma chamada
 * de método System.out.println sem argumentos faz com que o programa
 * gere saída de um único caractere de nova linha. [Dica: as instruções
 * de repetição são requeridas.]

 * * * * * * *
  * * * * * * *
 * * * * * * *
  * * * * * * *
 * * * * * * *
  * * * * * * *
 * * * * * * *
  * * * * * * *
 */

public class Exercicio_32 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.32");
        System.out.println();

        int linha = 1, coluna = 1;

        while (linha < 9) {
            while (coluna < 9) {
                System.out.print(linha % 2 == 0 ? " *" : "* ");
                coluna++;
            }
            System.out.println();
            coluna = 1;// reinicia o contador de colunas
            linha++;
        }
    }
}