package OperadoresBasicos;

public class funcoesString {
	public static void main(String[] args) {
		
		String str = "Hoje o dia est� belo demais!";
		
		//Arruma String
		System.out.println(str.trim());
		
		//Formata��o Minuscula
		System.out.println("toLowerCase = " + str.toLowerCase());
		
		//Formata��o Maiuscula
		System.out.println("toUpperCase = " + str.toUpperCase());
		
		//Fatiamento 01
		System.out.println("Fatiamento 01 = " + str.substring(3));
		
		//Fatiamentp 02
		System.out.println("Fatiamento 02 = " + str.substring(3,8));
		
		//Substitu��o de valores
		System.out.println("Replace = "  + str.replace("Hoje","Como"));
		
		//�ndice (posi��o)
		System.out.println(str.indexOf("belo"));
		
		//Pr�ximo �ndice de... (pr�xima posi��o de uma refer�ncia)
		System.out.println(str.lastIndexOf("belo"));
		
		//Fatiamento de String por vetor com base em uma refer�ncia
		String[] vetor = str.split(" ");
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println(vetor[i]);
		}
		
		
		
	}
}
