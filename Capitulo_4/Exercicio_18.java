package Capitulo_4;

import java.util.Scanner;

/* Code by Jadder Freitas Souza
 *
 * (Calculador de limite de crédito) Desenvolva um aplicativo Java que determina
 * se um cliente de uma loja de departamentos excedeu o limite de crédito em uma
 * conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
 * a) Número de conta.
 * b) Saldo no início do mês.
 * c) Total de todos os itens cobrados desse cliente no mês.
 * d) Total de créditos aplicados ao cliente no mês.
 * e) Limite de crédito autorizado.
 * O programa deve inserir todos esses dados como inteiros, calcular o novo saldo
 * (= saldo inicial + despesas – créditos), exibir o novo saldo e determinar se o
 * novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo
 * limite de crédito foi excedido, o programa deve exibir a mensagem
 * "Limite de crédito excedido".
 */

public class Exercicio_18 {
    public static void main(String[] args) {
        System.out.println("RESOLUÇÃO DO EXERCÍCIO 4.18");
        System.out.println();

        Scanner t = new Scanner(System.in);

        int conta, saldoInicial, despesas, creditos, limiteDeCredito, novoSaldo, sair = -1;

        while (sair != 0) {
            System.out.print("Digite o número da conta ou 0 para sair: ");
            conta = t.nextInt();

            if (conta == 0)
                sair = conta;
            else {
                System.out.print("Saldo Inicial: R$ ");
                saldoInicial = t.nextInt();

                System.out.print("Despesas: R$ ");
                despesas = t.nextInt();

                System.out.print("Créditos: R$ ");
                creditos = t.nextInt();

                System.out.print("Limite de Crédito: R$ ");
                limiteDeCredito = t.nextInt();

                novoSaldo = saldoInicial + despesas - creditos;

                System.out.println("Novo saldo: R$ " + novoSaldo +
                        (novoSaldo > limiteDeCredito ? ". Limite de crédito excedido." : ""));

                System.out.println();
            }
        }
    }
}

