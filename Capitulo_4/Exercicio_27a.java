package Capitulo_4;

/* Code by Jadder Freitas Souza
 *
 * (Problema do else oscilante) Determine a saída para cada um dos conjuntos
 * dados de código quando x é 9 e y é 11 e quando x é 11 e y é 9. O compilador
 * ignora o recuo em um programa Java. Da mesma forma, o compilador Java sempre
 * associa um else com o if imediatamente precedente a menos que instruído a
 * fazer de outro modo pela colocação de chaves ({}). À primeira vista, o
 * programador pode não ter certeza de qual if um else particular corresponde
 * — essa situação é conhecida como "problema do else oscilante". Eliminamos
 * o recuo do seguinte código para tornar o problema mais desafiador.
 * [Dica: aplique as convenções de recuo que você aprendeu.]
 */

public class Exercicio_27a {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.27 a)");
        System.out.println();

        System.out.println("Considerando x = 9 e y = 11: ");

        int x = 9, y = 11;

        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        System.out.println();

        System.out.println("Considerando x = 11 e y = 9: ");

        x = 11;
        y = 9;

        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
    }
}