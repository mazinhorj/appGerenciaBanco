/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

/**
 *
 * @author Osmar Menezes da Silva
 */
import java.util.Scanner;

public class GerenciaBanco {
    private static final String MSG_FINAL = "Obrigado por usar o MZ-Anhanguera. Tenha um ótimo dia!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bem vindo ao banco MZ-Anhanguera!");

        // Informações do usuário
        System.out.print("\nDigite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        // Saldo inicial
        double saldo = 0.0;

        while (true) {
            // Exibir menu de opções
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Consulta Saldo");
            System.out.println("2. Depósito");
            System.out.println("3. Saque");
            System.out.println("4. Encerrar");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    // Consultar saldo
                    System.out.println("Seu saldo é: R$" + saldo);
                    if (saldo == 0) {
                        System.out.println("\nFaça um depósito e aproveite nossos benefícios!");
                    }
                    break;
                case 2:
                    // Depositar
                    System.out.print("Digite o valor do depósito: ");
                    double depositoValor = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    saldo += depositoValor;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("\nSeu novo saldo é: R$" + saldo);
                    break;
                case 3:
                    // Retirar
                    System.out.print("Digite o valor da retirada: ");
                    double saqueValor = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    if (saqueValor <= saldo) {
                        saldo -= saqueValor;
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("\nSeu novo saldo é: R$" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 4:
                    // Sair
                    System.out.println(MSG_FINAL);
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
