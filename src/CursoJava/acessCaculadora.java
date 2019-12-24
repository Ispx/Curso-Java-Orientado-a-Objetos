package CursoJava;

public class acessCaculadora {

	public static void main(String[] args) {
		sobreCargaDeMetodos calculos = new sobreCargaDeMetodos();
		String str = "==============================================";

		System.out.println("Soma:");
		System.out.println(calculos.soma(10,5));
		System.out.println(calculos.soma(10,5,2));
		System.out.println(calculos.soma(10,5,2,10));
		System.out.println(str);


		System.out.println("Subtração:");
		System.out.println(calculos.subtracao(10,5));
		System.out.println(calculos.subtracao(10,5,2));
		System.out.println(calculos.subtracao(10,1,2,2));
		System.out.println(str);
		
		System.out.println("Multipliacação:");
		System.out.println(calculos.multiplicacao(10,5));
		System.out.println(calculos.multiplicacao(10,5,2));
		System.out.println(calculos.multiplicacao(10,1,2,2));
		System.out.println(str);
		
		System.out.println("Divisão:");		
		System.out.println(calculos.divisao(10,5));
		System.out.println(calculos.divisao(10,2,2));
		System.out.println(calculos.divisao(100,2,2,2));
		System.out.println(str);
		
		System.out.println("Potenciação:");	
		System.out.println(calculos.potenciacao(10,2));
		System.out.println(calculos.potenciacao(10,2,2));
		System.out.println(calculos.potenciacao(10,2,2,2));
		System.out.println(str);
	}

}
