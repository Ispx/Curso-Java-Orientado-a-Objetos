package OperadoresBasicos;

public class funcoesString {
	public static void main(String[] args) {
		
		String str = "Hoje o dia está belo demais!";
		
		//Arruma String
		System.out.println(str.trim());
		
		//Formatação Minuscula
		System.out.println("toLowerCase = " + str.toLowerCase());
		
		//Formatação Maiuscula
		System.out.println("toUpperCase = " + str.toUpperCase());
		
		//Fatiamento 01
		System.out.println("Fatiamento 01 = " + str.substring(3));
		
		//Fatiamentp 02
		System.out.println("Fatiamento 02 = " + str.substring(3,8));
		
		//Substitução de valores
		System.out.println("Replace = "  + str.replace("Hoje","Como"));
		
		//Índice (posição)
		System.out.println(str.indexOf("belo"));
		
		//Próximo índice de... (próxima posição de uma referência)
		System.out.println(str.lastIndexOf("belo"));
		
		//Fatiamento de String por vetor com base em uma referência
		String[] vetor = str.split(" ");
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println(vetor[i]);
		}
		
		
		
	}
}
