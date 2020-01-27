package ExerciciosCursoJava;

import java.util.Random;

public class ContaBancaria {
	
	static Random r = new Random();
	
	private static String titular;
	private static int numConta = r.nextInt(1000);
	private static double saldo;

	public static void setTitular(String Nome) {
		ContaBancaria.titular = Nome;
	}

	public static void setDeposito(double deposito) {
		ContaBancaria.saldo += deposito;
	}
	
	public static void setSaque(double saque) {
		ContaBancaria.saldo -= saque + 5;
	}
		
	public static String getTitular() {
		return ContaBancaria.titular;
	}

	public static double getSaldo() {
		return ContaBancaria.saldo;
	}
	public static int getnumConta() {
		return ContaBancaria.numConta;
	}
}
