package ExercicioHerança;

import java.util.ArrayList;
import java.util.Scanner;

public class print {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = null;
		Double value = 0.0;
		Integer hour = 0;
		Double charge = 0.0;
		
		
		
		Employee funcionarios = new Employee(name, hour, value);
		Employee funcionario;
		
		
		Employee fterceiros = new OutSourceEmployee(name, hour, value, charge);
		Employee fterceiro;
		
		
		
		System.out.println("Quantidade de funcionários: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i <= qtd; i ++) {
			System.out.println("Outsourced ? (y/n)");
			String str = sc.next();
			 
			if(str.toLowerCase().equals("n")) {
			
				System.out.println("Nome: ");
				name = sc.next();
				System.out.println("Value Hour: " );
				value = sc.nextDouble();
				System.out.println("Quantity hour: ");
				hour = sc.nextInt();
				funcionario = new Employee(name, hour, value);		
				funcionarios.addFuncionario(funcionario);	
			
			}
			
			else if(str.toLowerCase().equals("y")){
				System.out.println("Nome: ");
				name = sc.next();
				System.out.println("Value Hour: " );
				value = sc.nextDouble();
				System.out.println("Quantity hour: ");
				hour = sc.nextInt();
				System.out.println("Addicional Charge: ");
				charge = sc.nextDouble();
				fterceiro = new OutSourceEmployee(name, hour, value, charge);
				fterceiros.addFuncionario(fterceiro);
			}
			else {
				System.out.println("Opção invalida!");
			}
				
		}
		System.out.println("PAYMENTS");

		
		for(int i = 0; i < funcionarios.quantity(); i ++) {
			
			System.out.println("Name: "+ funcionarios.getFuncionario(i).getName() + " - $ " + funcionarios.getFuncionario(i).payment());
		}
		
		for(int i = 0; i < fterceiros.quantity(); i ++) {
			
			System.out.println("Name: "+ fterceiros.getFuncionario(i).getName() + " - $ " + fterceiros.getFuncionario(i).payment());

		}
	}
	}