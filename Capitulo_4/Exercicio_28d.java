package Capitulo_4;

/* Code by Jadder Freitas Souza
 * 
 * (Outro problema do else oscilante) Modifique o código dado para
 * produzir a saída mostrada em cada parte do problema. Utilize
 * técnicas de recuo adequadas. Não faça nenhuma alteração além de
 * inserir chaves e alterar o recuo do código. O compilador ignora
 * recuo em um programa Java. Eliminamos o recuo do código fornecido
 * para tornar o problema mais desafiador. [Observação: é possível que
 * não seja necessária nenhuma modificação para algumas das partes.]
 */

public class Exercicio_28d {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.28 d)");
        System.out.println();

        int x = 5, y = 7;

        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}