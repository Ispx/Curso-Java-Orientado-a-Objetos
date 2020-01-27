package TypeSafaty;

public class program {

	public static void main(String[] args) {
		
		//Neste momento estou instanciando o tipo primitivo da classe como Integer e outra variavel como String
		 
		ClasseTipoGenerico<Integer> tipoInt;
		ClasseTipoGenerico<String> tipoString;
		tipoInt = new ClasseTipoGenerico<Integer>(5);
		
		System.out.println(tipoInt.getValor());
		
		
		tipoString = new ClasseTipoGenerico<String>("Bom");
		System.out.println(tipoString.getValor());
		
		
		
		
		
		
		
	}

}
