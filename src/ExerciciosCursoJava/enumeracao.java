package ExerciciosCursoJava;

import java.util.Date;
import java.util.Scanner;

public enum enumeracao {
	Aguardando_pedido,
	Processando,
	Entrega;

}

class Situacao{
	
	private static int id;
	private static  Date data = new Date();
	private static  enumeracao status;
	public void dados(int id) {
		this.id = id;
		this.data = new Date();
		this.status = enumeracao.Processando;		
		
	}
	public static String print() {
		return "id: " + id + " data: " + data + " status: " + status;  
		
	}
	
	

}