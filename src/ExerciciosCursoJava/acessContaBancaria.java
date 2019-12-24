package ExerciciosCursoJava;

import java.util.Scanner;


public class acessContaBancaria {
	public static void main(String[] args) {
		//-------------------------------------
		double deposito;
		String nome;
		boolean b = true;
		double saque;
		//-------------------------------------		
		Scanner sc = new Scanner(System.in);
		String str = "======================================================================";
		System.out.println("CADASTRANDO CONTA BANCÁRIA");
		System.out.println(str);
		System.out.println("Informe o nome do titular da conta: ");
		ContaBancaria.setTitular(nome = sc.next());
		System.out.println("Valor a ser depositado ?" + "\n" + "1 - Sim" + "\n" + "2 - Não");
		int opc = sc.nextInt();
		switch(opc) {
			case 1:
				System.out.println("Informe o valor a ser depositado: ");
				ContaBancaria.setDeposito(deposito = sc.nextDouble());
				System.out.println("Parabéns, sua Conta foi Cadastrada com Sucesso!");
				System.out.println(str);
				System.out.println("Dados da conta cadastrada:");
				System.out.println(str);
				System.out.println("Número da conta: " + ContaBancaria.getnumConta());
				System.out.println("Nome do Titular: " + ContaBancaria.getTitular());
				System.out.println("Saldo: R$ " + ContaBancaria.getSaldo());
			break;
			case 2:
				System.out.println("Parabéns, sua Conta foi Cadastrado com Sucesso!");
				System.out.println(str);
				System.out.println("Dados da conta cadastrada:");
				System.out.println(str);
				System.out.println("Número da conta: " + ContaBancaria.getnumConta());
				System.out.println("Nome do Titular: " + ContaBancaria.getTitular());
				System.out.printf("Saldo: R$ %.2f", ContaBancaria.getSaldo());
				System.out.println();
				System.out.println();
			break;
			default:
		}
		System.out.println("Deseja continuar?" + "\n" + "1 - Sim" + "\n" + "2 - Não");
		opc = sc.nextInt();
		b = opc == 1 ? true : false;
		if(b == true) {
			while( b == true) {
				System.out.println("Informe a operação:");
				System.out.println("1 - Saque" + "\n" + "2 - Depósito");
				opc = sc.nextInt();
				switch(opc) {
					case 1:
						if(ContaBancaria.getSaldo() <= 0) {
							System.out.println("Saldo insuficiente");
							System.out.println(str);
							System.out.println("Número da conta: " + ContaBancaria.getnumConta());
							System.out.println("Nome do Titular: " + ContaBancaria.getTitular());
							System.out.printf("Saldo: R$ %.2f", ContaBancaria.getSaldo());
							System.out.println();
							System.out.println();
						}
						else {
							System.out.println("Taxa administrativa: R$ 5,00");
							System.out.println(str);
							System.out.println("Valor do saque: ");
							ContaBancaria.setSaque(saque = sc.nextDouble());
							
							System.out.println(str);
							System.out.println("Número da conta: " + ContaBancaria.getnumConta());
							System.out.println("Nome do Titular: " + ContaBancaria.getTitular());
							System.out.printf("Saldo: R$ %.2f", ContaBancaria.getSaldo());
							System.out.println();
							System.out.println();
						}
						break;
					case 2:
						System.out.println("Valor:");
						ContaBancaria.setDeposito(deposito = sc.nextDouble());
						System.out.println(str);
						System.out.println("Número da conta: " + ContaBancaria.getnumConta());
						System.out.println("Nome do Titular: " + ContaBancaria.getTitular());
						System.out.printf("Saldo: R$ %.2f", ContaBancaria.getSaldo());
						System.out.println();
						System.out.println();
					default:	
				}
			}
		}		
		else {
			System.out.println("Agradecemos por utiliza nossos serviços!");
			System.out.println();
		}	
		sc.close();
	}
}
