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
		System.out.println("CADASTRANDO CONTA BANC�RIA");
		System.out.println(str);
		System.out.println("Informe o nome do titular da conta: ");
		ContaBancaria.setTitular(nome = sc.next());
		System.out.println("Valor a ser depositado ?" + "\n" + "1 - Sim" + "\n" + "2 - N�o");
		int opc = sc.nextInt();
		switch(opc) {
			case 1:
				System.out.println("Informe o valor a ser depositado: ");
				ContaBancaria.setDeposito(deposito = sc.nextDouble());
				System.out.println("Parab�ns, sua Conta foi Cadastrada com Sucesso!");
				System.out.println(str);
				System.out.println("Dados da conta cadastrada:");
				System.out.println(str);
				System.out.println("N�mero da conta: " + ContaBancaria.getnumConta());
				System.out.println("Nome do Titular: " + ContaBancaria.getTitular());
				System.out.println("Saldo: R$ " + ContaBancaria.getSaldo());
			break;
			case 2:
				System.out.println("Parab�ns, sua Conta foi Cadastrado com Sucesso!");
				System.out.println(str);
				System.out.println("Dados da conta cadastrada:");
				System.out.println(str);
				System.out.println("N�mero da conta: " + ContaBancaria.getnumConta());
				System.out.println("Nome do Titular: " + ContaBancaria.getTitular());
				System.out.printf("Saldo: R$ %.2f", ContaBancaria.getSaldo());
				System.out.println();
				System.out.println();
			break;
			default:
		}
		System.out.println("Deseja continuar?" + "\n" + "1 - Sim" + "\n" + "2 - N�o");
		opc = sc.nextInt();
		b = opc == 1 ? true : false;
		if(b == true) {
			while( b == true) {
				System.out.println("Informe a opera��o:");
				System.out.println("1 - Saque" + "\n" + "2 - Dep�sito");
				opc = sc.nextInt();
				switch(opc) {
					case 1:
						if(ContaBancaria.getSaldo() <= 0) {
							System.out.println("Saldo insuficiente");
							System.out.println(str);
							System.out.println("N�mero da conta: " + ContaBancaria.getnumConta());
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
							System.out.println("N�mero da conta: " + ContaBancaria.getnumConta());
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
						System.out.println("N�mero da conta: " + ContaBancaria.getnumConta());
						System.out.println("Nome do Titular: " + ContaBancaria.getTitular());
						System.out.printf("Saldo: R$ %.2f", ContaBancaria.getSaldo());
						System.out.println();
						System.out.println();
					default:	
				}
			}
		}		
		else {
			System.out.println("Agradecemos por utiliza nossos servi�os!");
			System.out.println();
		}	
		sc.close();
	}
}
