package EstruturaTryCacth;

import java.util.InputMismatchException;
import java.util.Scanner;


public class program {
	
	
	public static void method(String vetor[], int i) {
		try {
			System.out.println(vetor[i]);
		}
		
		catch(ArrayIndexOutOfBoundsException tc){
			System.out.println("Invalid position!");
			tc.printStackTrace();		
		}
		catch(InputMismatchException tc) {
			System.out.println("Value invalid!");
			tc.printStackTrace();
		}
	}
	
	public static void methodNaoTratado (String vetor[], int i) throws Exception {
			System.out.println(vetor[i]);
		
	}
	public static void main(String[] args) {
		
		String str;
		int position = 0;
		String[] vetor = new String[4];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Frase: ");
		vetor = sc.nextLine().split(" ");
		System.out.println("Position: ");
		position = sc.nextInt();
		method(vetor,position);
		System.out.println("Throws = M�todo n�o tratado diretamente, se cria um m�todo e cada usu�rio que chamar este m�todo deve tratar o mesmo");
		try {
			methodNaoTratado(vetor, position);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("===========================");
			e.printStackTrace();
		}
		
	System.out.println(".....");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
}
