package TypeSafaty;

/*
 * A tipagem <> é chamada de "Safaty"
 * A letra "T" é um objeto genérico não definido, 
 * mas que será instanciado seu verdadeiro tipo (String, int, Boolean, List, etc) na classe que implementará esta classe.
 * Com isso, este método TypeSafaty permite reuso da classe, já que a mesma não esta muito bem definida.
 * 

 */
public class ClasseTipoGenerico<T> {
	
	private T valor;
	

	public ClasseTipoGenerico(T tipo) {
		this.valor = tipo;
	}

	public T getValor() {
		return this.valor;
	}

	public void setValor(T tipo) {
		this.valor = tipo;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
