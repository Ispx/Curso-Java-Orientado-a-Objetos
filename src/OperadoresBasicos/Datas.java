package OperadoresBasicos;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {

	public static void main(String[] args) throws ParseException {
		
		// Instanciando um objeto para o formato data
		SimpleDateFormat dataf1 = new SimpleDateFormat("dd/mm/yyyy"); // Objeto instânciado para formato dia mês e ano
		SimpleDateFormat dataf2 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss"); // Objeto instânciado para formato dia , mês , ano e horas/minutos/segundos
		
		//Instaciando um objeto para formato horas
		SimpleDateFormat horasf1 = new SimpleDateFormat("HH:mm:ss"); //Objeto instânciado para formato horas, minutos e segundos
		
		//Chamando a variável tipo data
		
		Date data = dataf1.parse("13/10/2019"); // função do SDF parse para inserir valores
		Date data2 = dataf2.parse("12/10/2019 07:45:00"); // função do SDF parse para inserir valores
		
		
		// Instanciando objeto data agora
		Date dataAgora = new Date(); // Date now
		Date dataAgora2 = new Date(System.currentTimeMillis()); // Converte milisegudos em data e minutos , horas e data
	
		//Imprimindo valores
		System.out.println("Horas: " + horasf1.format(dataAgora));
		System.out.println("data: " + dataf1.format(data));
		System.out.println("data2: " + dataf2.format(data2));
		System.out.println("Data agora: " + dataf1.format(dataAgora));
		System.out.println("Data agora + horas: " + dataf2.format(dataAgora));
		System.out.println("Data agora (milisegundos) : " + dataf2.format(dataAgora2));
		
		
		
		
	}

}
