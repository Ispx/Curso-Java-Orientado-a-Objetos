package HashCode_Equals;

public class program {

	public static void main(String[] args) {
		/*
		 * O método de comparação equals e HashCode só funciona se os objetos forem da mesma classe/tipo.
		 * 
		 */
		
		Classe obj1 = new Classe("Isaque",21);
		Classe obj2 = new Classe("Isaque",22);
		String str = "Isaque";
		
		
		System.out.println("Equals >-----Mesmo tipo---------");
		System.out.println(obj1.equals(obj2));
		
		System.out.println("Equals >------Tipo diferente---------");
		System.out.println(obj1.equals(str));
		
		System.out.println();
		
		System.out.println("HashCode >-----Mesmo tipo-----------");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.hashCode() == obj2.hashCode());
		
		
		System.out.println("HashCode >----Tipo diferente----------");
		System.out.println(obj1.hashCode());
		System.out.println(str.hashCode());
		System.out.println(obj1.hashCode() == str.hashCode());
	}

}
