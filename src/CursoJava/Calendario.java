package CursoJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance(); /* a classe Calendar não pode ser instanciada do modelo padrão,
												Porém a mesma possui uma função para instaciação da mesma
												*/
		int today = cal.get(cal.DAY_OF_MONTH); //.DAY_OF_MONTH
		int month = cal.get(cal.MONTH);	//.MONTH
		int year = cal.get(cal.YEAR); // .YEAR
		
		//Transferindo um valor de um objeto Date para um Objeto Calendar
		Date data = new Date();
		cal.setTime(data);
		//--------------------------------------------------------------
		
		System.out.println("DIA_ATUAL: " + today);
		System.out.println("MêS_ATUAL: " + month);
		System.out.println("ANO_ATUAL: "+ year);
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.printf("%d/%02d/%d", today,month,year);
		System.out.println();
		System.out.printf("%d:%d:%02d", cal.get(cal.HOUR_OF_DAY), cal.get(cal.MINUTE), cal.get(cal.SECOND)); //.HOUR_OF_DAY , .MINUTE, .SECOND
		System.out.println();
		System.out.printf("%d:%d:%02d", cal.get(cal.HOUR), cal.get(cal.MINUTE), cal.get(cal.SECOND)); //.HOUR, .MINUTE, .SECOND

	}

}
