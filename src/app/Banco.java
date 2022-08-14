package app;

import java.util.Scanner;

import core.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria contaBancaria = new ContaBancaria(1001, 3, "Welton Vitor", "123.658.958-xx", 200.00);
		
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("****BankOfBank - Seu Banco Digital*****");
			System.out.println("Digite 1-Depósito | 2-Saque | 3-Info | 0-Sair");
			opcao = scan.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println(">>> Depósito - Digite o Valor: ");
					valor = scan.nextDouble();
					contaBancaria.depositar(valor);		
					break;
				case 2:
					System.out.println(">>> Saque - Digite o Valor: ");
					valor = scan.nextDouble();
					if (contaBancaria.sacar(valor)) {
						System.out.println("     SAQUE EFETUADO!");
						
					} else {
						System.out.println("     SALDO INSUFICIENTE!");

					}
					break;
				case 3:
					System.out.println(">>> Info - Digite o Valor: " + contaBancaria.exibirDados()	);
						
					break;	
				case 0:
					System.out.println(">>> Sair - OBRIGADO PELA PREFERÊNCIA!!! ");
					break;	

				default:
					System.out.println("Opção Inválida!!!!");
					break;
			}
			
		} while (opcao != 0);
		
		scan.close();

	}

}
