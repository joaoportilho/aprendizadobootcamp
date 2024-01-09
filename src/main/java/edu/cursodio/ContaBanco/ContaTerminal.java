package edu.cursodio.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Conta contaBanco = new Conta();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da sua agência: ");
        contaBanco.setAgencia(scanner.nextLine());

        System.out.print("Por favor, digite o número da sua conta: ");
        contaBanco.setNumeroConta(scanner.nextInt());

        System.out.print("Por favor, digite seu saldo: ");
        contaBanco.setSaldo(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Por favor, digite seu nome: ");
        contaBanco.setNomeCliente(scanner.nextLine());

        System.out.println(contaBanco);
    }
}