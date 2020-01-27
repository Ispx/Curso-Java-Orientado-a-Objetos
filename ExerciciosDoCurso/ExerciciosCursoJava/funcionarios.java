package ExerciciosCursoJava;

import java.util.ArrayList;


public class funcionarios {
	private static ArrayList<Integer> id = new ArrayList<Integer>();
	private static ArrayList<String> nome = new ArrayList<String>();
	private static ArrayList<Double> salario = new ArrayList<Double>();

	public static int tamanho() {
		return funcionarios.id.size();
	}
	
	public static Integer getNumId(int i) {
		return funcionarios.id.get(i);
	}
	public static Integer getId(int id) {
		if(funcionarios.id.indexOf(id) < 0) {
			System.out.println("Alerta: Id não identificado.");
			System.out.println("Tente novamente!");
		}
		return funcionarios.id.get(funcionarios.id.indexOf(id));
	}
	
	public static String getNumNome(int i) {
		return funcionarios.nome.get(i);
	}
	public static String getNome(int id) {
		if(funcionarios.id.indexOf(id) < 0) {
			System.out.println("Alerta: Id não idenficado.");
			System.out.println("Tente novamente!");
		}
		return funcionarios.nome.get(funcionarios.id.indexOf(id));
	}
	
	public static Double getNumSalario(int i) {
		
		return funcionarios.salario.get(i);
		
	}
	public static Double getSalario(int id) {
		if(funcionarios.id.indexOf(id) < 0) {
			System.out.println("Alerta: Id não identificado.");
			System.out.println("Tente novamente!");
		}
		
		return funcionarios.salario.get(funcionarios.id.indexOf(id));
		
	}
	//--------------------------------------------
	public static void setId(int id) {
		if(funcionarios.id.indexOf(id) >= 0){
			System.out.println("Alerta: Id já cadastrado em nosso sistema!");
			System.out.println("Tente novamente!");
			
		}
		funcionarios.id.add(id);
	}
	
	public static void setNome(String nome) {
			funcionarios.nome.add(nome);
	}
	
	public static void setSalario(Double salario) {
		funcionarios.salario.add(salario);
	}
	
	public static void reajusteSalario(int Id, double taxa ) {
		 if (funcionarios.id.indexOf(Id) < 0) {
			 System.out.println("Alerta: Id não identificado.");
			 System.out.println("Tente novamente!");
		 }
		 double aumento = funcionarios.salario.get(funcionarios.id.indexOf(Id)) * (1+(taxa/100)); 
		 funcionarios.salario.add(funcionarios.id.indexOf(Id), aumento);
	}
}
