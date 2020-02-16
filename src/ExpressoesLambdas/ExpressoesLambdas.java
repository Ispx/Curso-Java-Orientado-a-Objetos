package ExpressoesLambdas;

public class ExpressoesLambdas {
	
	/*Sintaxe Lambdas (Predicate)
	 * 
	 * (int x) -> {System.out.println(x)}
	 * 
	 * Ex 1:
	 * (int x) - Lista de argumentos/parâmetros explícita
	 *  -> - seta/flexa 
	 *  {System.out.println(x)}	 - Corpode expressão
	 * 
	 * Ex 2:
	 * (y,z) -> {y.getNum() + z.getNum()}
	 * 
	 * (y,z) - Lista de argumentos/parâmetros implicito
	 * -> - Seta/flexa
	 * {System.out.println( y.getNum() + z.getNum() )} - Corpo da expressão
	 * 
	 */
	
	
	
	/*
	 * Expressões Lambdas?
	 * Expressões lambdas só funcionam com INTERFACES FUNCIONAIS.
	 *
	 *
	 * Expressões lambdas implementa os métodos que estão definidos em uma interface funcional
	 * Sua finalidade é a substituição de classes anônimas
	 *
	 * 
	 * 
	 */

	
	/*
	 * Interface funcional
	 * 
	 * Interface funcional são todas aquelas que possuem apenas um método e que são abstratos, todas essas podem ser trabalhadas com expressões lambda
	 * 
	 * Function: Uma função que recebe um único argumento
	 * 
	 * Predicate: Função que recebe um único parâmetro e devolve um booleano
	 * 
	 * Consumer: Função que recebe um único parâmetro e não devolve nada
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		
		
		//instanciando classe anonima
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Implementação sem expressão lambda");	
			}
		};
		
		
		Runnable r2 = ()-> System.out.println("Implementação com expressão lambda");
		
		
		/*
		Runnable r2; 
				r2 () - Lista de argumentos
				-> - Seta ou flexa que indica que estamos trabalhando com expressões lambda
				System.out.println("Implementação com expressão lambda"); - Corpo da expressão
	    */	
		

		/*
		 * Devemos ficar atento ao tipo de retorno do método da interface funcional,
		 * pois métodos com retorno diferente de void a demostração do resultado ocorrerá através da instanciação dos parâmetros do método da interface
		 * dentro do método System.out.print
		 * 
		 */
		
		/*
		 * Não somos obrigados a especificar o type do parâmetro na instanciação do método da interace, pode ser feito implicitamente.
		 * Caso contrário se houver mais de um parâmetro que quiser especificar o tipo do mesmo, todos os parâmetros deverão ser especificados.
		 * 
		 * Ex explicito:
		 * funcional fx = (int x, int y) -> x/y;
		 * 
		 * Ex implicito:
		 * 
		 * funcional fx = (x,y) -> x/y;
		 */
		
		//return type int
		funcional f = () -> 1;
		
		
		System.out.println(f.valor());
		
		
		//return type void
		funcional2 f2 = (x,y) -> System.out.println(x + " - " + y);
		
		f2.textos("Ola","Bom");
		
		/*
		 * corpo da expressão com condicional if
		 * 
		 */
		
		
		
		/*
		 * 
		 * 
		 */
		
		
		funcional3 f3 = (x,y) -> {
			
			if(x>y) {
				return true;
			}
			
			return false;
		};
		
		
		System.out.println(f3.valores(3, 5));
		
	}
	
	

}
