package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 * 
 * (Validando entrada de usuário) Modifique o programa na Figura 4.12
 * para validar suas entradas. Para qualquer entrada, se o valor entrado
 * for diferente de 1 ou 2, continue o loop até o usuário inserir um
 * valor correto.
 */

public class Exercicio_24 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.24");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int passes = 0, failures = 0, studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.println("Enter result (1 = pass, 2 = fail): ");

            int result = t.nextInt();

            if (result == 1 || result == 2) {
                studentCounter += 1;
                if (result == 1)
                    passes += 1;
                else
                    failures += 1;
            } else {
                System.out.print("Invalid! ");
            }
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8)
            System.out.println("Bonus to instructor!");

        t.close();
    }
}