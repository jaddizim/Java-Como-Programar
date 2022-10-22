package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 *
 * (Quilometragem de combustível) Os motoristas se preocupam com a
 * quilometragem obtida por seus automóveis. Um motorista monitorou
 * várias viagens registrando a quilometragem dirigida e a quantidade
 * de combustível em litros utilizados para cada tanque cheio.
 * Desenvolva um aplicativo Java que receba como entrada os quilômetros
 * dirigidos e os litros de gasolina consumidos (ambos como inteiros)
 * para cada viagem. O programa deve calcular e exibir o consumo em
 * quilômetros/litro para cada viagem e imprimir a quilometragem total
 * e a soma total de litros de combustível consumidos até esse ponto
 * para todas as viagens. Todos os cálculos de média devem produzir
 * resultados de ponto flutuante. Utilize classe Scanner e repetição
 * controlada por sentinela para obter os dados do usuário.
 */

public class Exercicio_17 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.17");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int totalKm = 0, totalL = 0, contador = 1, qtKm = 0, qtL = 0, sair = -1;

        while (sair != 0) {
            System.out.printf("Quilometragem rodada na %dª viagem ou 0 para sair: ", contador);
            qtKm = t.nextInt();

            if (qtKm == 0)
                sair = qtKm;
            else {
                System.out.printf("Combustível consumido na %dª viagem ou 0 para sair: ", contador);
                qtL = t.nextInt();

                if (qtL == 0) {
                    sair = qtL;
                    contador--;
                } else {
                    totalKm += qtKm;
                    totalL += qtL;
                    contador++;

                    System.out.printf("\nConsumo médio  : %.2f km/L.%n", (double) qtKm / qtL);
                    System.out.println("Km total       : " + totalKm + " km.");
                    System.out.println("Consumo total  : " + totalL + "L.\n");
                }
            }
        }
        System.out.println("\nPrograma encerrado.\n");

        if (contador >= 1 && totalKm > 0) {
            System.out.println("Número de viagens  : " + contador);
            System.out.println("Quilometragem total: " + totalKm + " km.");
            System.out.println("Combustível total  : " + totalL + "L.");
            System.out.println("Consumo médio      : " + (double) totalKm / totalL + " km/L.");
        }
        t.close();
    }
}