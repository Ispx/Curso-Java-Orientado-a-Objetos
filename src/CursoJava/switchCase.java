package CursoJava;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		byte num;
		String str = null;
		System.out.println("Informe um valor: ");
		num = valor.nextByte();
		switch(num) {
		case  10:
			str = "10";
			break;
		case 20:
			str = "20";
			break;
		case 30:
			str = "30";
			break;
		default:
			System.out.println("Valores validos 10,20,30");		
		}
		System.out.println(str);
		
		
	}

}
