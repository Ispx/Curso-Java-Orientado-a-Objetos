package HashCode_Equals;

public class EqualsEHashCode {

	public static void main(String[] args) {
		/*
		 *Toda classse do tipo primitivo tem consigo os métodos hashcode e Equals, para as demais devem ser criados dentro das mesmas.
		 *
		 *Esses métodos são tem por finalizadade avaliar se um objeto é igual ao o outro, tendo como contra partida
		 *algumas diferenças de velocidade de processamento.
		 *
		 *O método Equals é mais lento, porém seus retornos são 100% eficientes.
		 *O método hashcode é mais rapido e ideal para grandes volumes de dados, porém seus retornos podem ser falhos em algum momento.
		 *Pois, o método hashcode trabalha criando um código para um elemento especificado, e em algum momento pode ocorrer
		 *que um elemento diferente pode ter o mesmo código hash, gerando assim um conflito.
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
