package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ContaBanco conta;
		
		System.out.print("Entre com o número da conta: ");
		int num = sc.nextInt();
		
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.print("Deseja efetuar um depósito inicial? (s/n) ");
		char resp = sc.next().charAt(0);
		
		if(resp == 's') {
			System.out.print("Entre com o valor do depósito inicial: ");
			double depInicial = sc.nextDouble();
			conta = new ContaBanco(num, titular, depInicial);
		}else {
			conta = new ContaBanco(num, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		conta.efetuarDeposito(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		conta.efetuarSaque(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println(conta);
		
		sc.close();
	}

}
