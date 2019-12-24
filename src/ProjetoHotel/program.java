package ProjetoHotel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class program {
	
	public static void main(String[] args) {
		Reservation reservation = new Reservation();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date dataI = null, dataF = null;
		Calendar cal = Calendar.getInstance();
		Date hoje = new Date();
		System.out.println("Number romm: ");
		int num = sc.nextInt();
		System.out.println("Date check-in: " );
		
		try {
			dataI = sdf.parse(sc.next());
		} catch (ParseException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		System.out.println("Date check-out: ");
		try {
			dataF = sdf.parse(sc.next());
		} catch (ParseException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		reservation.Reservation(num,dataI,dataF);
		
		
		System.out.println(reservation.toString());
		
		System.out.println("Enter with new dates: ");
		System.out.println("Check-in: ");
		try {
		dataI = sdf.parse(sc.next());
		}
		catch(ParseException e){
			System.out.println("Erro: " + e.getMessage());
		}
		try {
		System.out.println("Check-out: ");
		dataF = sdf.parse(sc.next());
		}
		catch(ParseException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		reservation.updataDates(dataI,dataF);
		System.out.println(reservation.toString());
		
		
		
	}

}
