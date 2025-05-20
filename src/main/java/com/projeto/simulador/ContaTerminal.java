package com.projeto.simulador;

import com.projeto.simulador.banco.ContaBancaria;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContaTerminal {

	public static void main(String[] args) {
		SpringApplication.run(ContaTerminal.class, args);

		Scanner scanner = new Scanner(System.in);
		System.out.println("=== Cadastro de Conta Bancária ===");

		System.out.print("Digite o número da conta: ");
		int numero = scanner.nextInt();

		System.out.print("Digite o número da agência: ");
		int agencia = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer

		System.out.print("Digite o nome do cliente: ");
		String nome = scanner.nextLine();

		System.out.print("Digite o saldo inicial: ");
		double saldo = scanner.nextDouble();

		// Cria uma instância da conta
		ContaBancaria conta = new ContaBancaria(numero, agencia, nome, saldo);

		//Exibindo em uma frase
		System.out.printf("\n Olá %s , obrigado por criar uma conta em nosso banco, " +
				"sua agência é %s , Numero %s e seu saldo é %s  já está disponível para saque \n", nome, agencia, numero, saldo );


		// Exibe os dados
		System.out.println("\n=== Dados da Conta ===");
		System.out.println("Cliente: " + conta.getNome());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número da Conta: " + conta.getNumero());
		System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());

		scanner.close();
	}

}
