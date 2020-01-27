package TypeSafaty;

/*
 * A tipagem <> � chamada de "Safaty"
 * A letra "T" � um objeto gen�rico n�o definido, 
 * mas que ser� instanciado seu verdadeiro tipo (String, int, Boolean, List, etc) na classe que implementar� esta classe.
 * Com isso, este m�todo TypeSafaty permite reuso da classe, j� que a mesma n�o esta muito bem definida.
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
