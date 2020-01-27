package HashCode_Equals;

public class EqualsEHashCode {

	public static void main(String[] args) {
		/*
		 *Toda classse do tipo primitivo tem consigo os m�todos hashcode e Equals, para as demais devem ser criados dentro das mesmas.
		 *
		 *Esses m�todos s�o tem por finalizadade avaliar se um objeto � igual ao o outro, tendo como contra partida
		 *algumas diferen�as de velocidade de processamento.
		 *
		 *O m�todo Equals � mais lento, por�m seus retornos s�o 100% eficientes.
		 *O m�todo hashcode � mais rapido e ideal para grandes volumes de dados, por�m seus retornos podem ser falhos em algum momento.
		 *Pois, o m�todo hashcode trabalha criando um c�digo para um elemento especificado, e em algum momento pode ocorrer
		 *que um elemento diferente pode ter o mesmo c�digo hash, gerando assim um conflito.
		 */
		
		String text1 =  "ola";
		String text2 = "Ola";
		
		System.out.println("--------------Equals--------------");
		//Equals
		System.out.println(text1.equals(text2));
		System.out.println(text1.equalsIgnoreCase(text2));
		
		System.out.println("--------------HashCode--------------");
		//HashCode
		System.out.println(text1.hashCode());
		System.out.println(text2.hashCode());
		System.out.println(text1.hashCode() == text2.hashCode());
		
		
		
		
		
		

	}

}
