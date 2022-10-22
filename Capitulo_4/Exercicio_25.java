package Capitulo_4;

/* Code by Jadder Freitas Souza
 * 
 * O que o seguinte programa imprime?
 */

public class Exercicio_25 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.25");
        System.out.println();
        int count = 1;
        while (count <= 10) {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }
    }
}