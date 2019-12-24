package CursoJava;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatado {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		String dataFormat= DateFormat.getInstance().format(data); // data e hora
		System.out.println(dataFormat);
		
		String dataFormat2 = DateFormat.getTimeInstance().format(data);
		System.out.println(dataFormat2);

		String dataFormat3 = DateFormat.getTimeInstance(DateFormat.SHORT).format(data);
		System.out.println(dataFormat3);
		
		String dataFormat4 = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(data);
		System.out.println(dataFormat4);
		
		String dataFormat5 = DateFormat.getTimeInstance(DateFormat.LONG).format(data);
		System.out.println(dataFormat5);
		
		String dataFormat6 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG).format(data);
		System.out.println(dataFormat6);
		
		
		String dataFormat7 = DateFormat.getDateInstance().format(data);
		System.out.println(dataFormat7);
		
		

	}

}
