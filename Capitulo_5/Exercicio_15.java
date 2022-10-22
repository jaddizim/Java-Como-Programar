package Capitulo_5;

/* Code by Jadder Freitas Souza
 *
 * (Programa para impressão de triângulos) Escreva um aplicativo que exibe os
 * seguintes padrões separadamente, um embaixo do outro. Utilize loops for
 * para gerar os padrões. Todos os asteriscos (*) devem ser impressos por
 * uma única instrução na forma System.out.print('*'); o que faz com que os
 * asteriscos sejam impressos lado a lado.
 * Uma instrução na forma System.out.println(); pode ser utilizada para
 * mover-se para a próxima linha. Uma instrução na forma System.out.print(' ');
 * pode ser utilizada para exibir um espaço para os últimos dois padrões.
 * Não deve haver outras instruções de saída no programa.
 * [Dica: os dois últimos padrões requerem que cada linha inicie com um número
 * adequado de espaços em branco.]
 */

public class Exercicio_15 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 5.15");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 10 - i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 10; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}