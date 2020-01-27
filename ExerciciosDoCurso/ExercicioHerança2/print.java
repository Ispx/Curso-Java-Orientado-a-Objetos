package ExercicioHerança2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class print {

	public static void main(String[] args) throws ParseException {
				
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> list = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println("Enter with the number of products:");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i ++) {
			System.out.println("Common, used or imported ? (c/u/i)");
			String opc = sc.next();
			
			if(opc.toUpperCase().equals("C")) {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				Product pComun = new Product(name,price);
				list.add(pComun);
				
			}
			else if(opc.toUpperCase().equals("U")) {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				System.out.println("Date manifacture: ");
				Date data = sdf.parse(sc.next());
				Product pUsed = new UsedProduct(name, price, data);
				list.add(pUsed);
								
			}
			else if(opc.toUpperCase().equals("I")) {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				System.out.println("Customs fee: ");
				Double customs = sc.nextDouble();
				Product pImported = new ImporteProduct(name, price, customs);
				list.add(pImported);
			}
			else {
				System.out.println("Opção inválida!");
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i).priceTag());
		}
		
		
		sc.close();	
	}
	

}
