package ExpressoesLambdas;

public class ExpressoesLambdas {
	
	/*Sintaxe Lambdas (Predicate)
	 * 
	 * (int x) -> {System.out.println(x)}
	 * 
	 * Ex 1:
	 * (int x) - Lista de argumentos/par�metros expl�cita
	 *  -> - seta/flexa 
	 *  {System.out.println(x)}	 - Corpode express�o
	 * 
	 * Ex 2:
	 * (y,z) -> {y.getNum() + z.getNum()}
	 * 
	 * (y,z) - Lista de argumentos/par�metros implicito
	 * -> - Seta/flexa
	 * {System.out.println( y.getNum() + z.getNum() )} - Corpo da express�o
	 * 
	 */
	
	
	
	/*
	 * Express�es Lambdas?
	 * Express�es lambdas s� funcionam com INTERFACES FUNCIONAIS.
	 *
	 *
	 * Express�es lambdas implementa os m�todos que est�o definidos em uma interface funcional
	 * Sua finalidade � a substitui��o de classes an�nimas
	 *
	 * 
	 * 
	 */

	
	/*
	 * Interface funcional
	 * 
	 * Interface funcional s�o todas aquelas que possuem apenas um m�todo e que s�o abstratos, todas essas podem ser trabalhadas com express�es lambda
	 * 
	 * Function: Uma fun��o que recebe um �nico argumento
	 * 
	 * Predicate: Fun��o que recebe um �nico par�metro e devolve um booleano
	 * 
	 * Consumer: Fun��o que recebe um �nico par�metro e n�o devolve nada
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		
		
		//instanciando classe anonima
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Implementa��o sem express�o lambda");	
			}
		};
		
		
		Runnable r2 = ()-> System.out.println("Implementa��o com express�o lambda");
		
		
		/*
		Runnable r2; 
				r2 () - Lista de argumentos
				-> - Seta ou flexa que indica que estamos trabalhando com express�es lambda
				System.out.println("Implementa��o com express�o lambda"); - Corpo da express�o
	    */	
		

		/*
		 * Devemos ficar atento ao tipo de retorno do m�todo da interface funcional,
		 * pois m�todos com retorno diferente de void a demostra��o do resultado ocorrer� atrav�s da instancia��o dos par�metros do m�todo da interface
		 * dentro do m�todo System.out.print
		 * 
		 */
		
		/*
		 * N�o somos obrigados a especificar o type do par�metro na instancia��o do m�todo da interace, pode ser feito implicitamente.
		 * Caso contr�rio se houver mais de um par�metro que quiser especificar o tipo do mesmo, todos os par�metros dever�o ser especificados.
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
		 * corpo da express�o com condicional if
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
