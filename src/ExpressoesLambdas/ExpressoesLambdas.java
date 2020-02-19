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
	 * Expressões Lambdas?
	 * Função anônima de primeira classe
	 *
	 * Calculo lambda são expressões lamdas?
	 * Não
	 *
	 *
	 * Expressões lambdas só funcionam com INTERFACES FUNCIONAIS.
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
	 * Interface funcional são todas aquelas que possuem apenas um método e que é abstrato, suas implementações podem/serão tratadas através de expressão lambda.
	 * 	 *
	 * Function: Uma função que recebe dois valores como parâmetro e retorna um tipo de valor, sendo esté tipo e segundo parâmetro.
	 * 	 *
	 * Predicate: Função que recebe um único parâmetro e devolve um booleano - Sua principal função é realizar análises para manipulação dos valores do objeto através de outro método.
	 * 
	 * Consumer: Função que recebe um único parâmetro e não devolve nada - Sua principal funcionalidade é manipular os valores de um objeto
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
		 * Devemos ficar atento ao tipo de retorno do método da interface funcional,
		 * pois m�todos com retorno diferente de void a demostração do resultado ocorrer� atrav�s da instancia��o dos par�metros do m�todo da interface
		 * dentro do método System.out.print
		 * 
		 */
		
		/*
		 * N�o somos obrigados a especificar o type do par�metro na instanciação do método da interace, pode ser feito implicitamente.
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
		InterfaceFuncional f = () -> 1;
		
		
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
