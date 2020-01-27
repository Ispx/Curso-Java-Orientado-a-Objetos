package OperadoresBasicos;

public class sobreCargaDeMetodos {

	// Para fazer sobre carga de função, os atributos devem ser do mesmo tipo
	
	public int soma(int num, int num2) {
		return num + num2;
	}
	int soma(int num, int num2, int num3) {
		return num + num2 + num3;
	}
	int soma(int num, int num2, int num3, int num4) {
		return num + num2 + num3 + num4;
	}
	
	int subtracao(int num, int num2) {
		return num - num2;
	}
	int subtracao(int num, int num2, int num3) {
		return num - num2 - num3;
	}
	int subtracao(int num, int num2, int num3, int num4) {
		return num - num2 - num3 - num4;
	}
	int multiplicacao(int num, int num2) {
		return num * num2;
	}
	int multiplicacao(int num, int num2, int num3) {
		return num * num2 * num3;
	}
	int multiplicacao(int num, int num2, int num3, int num4) {
		return num * num2 * num3 * num4;
	}
	int divisao(int num, int num2) {
		return num / num2;
	}
	int divisao(int num, int num2, int num3) {
		return num / num2 / num3;
	}
	int divisao(int num, int num2, int num3, int num4) {
		return num / num2 / num3 / num4;
	}
	int potenciacao(int num, int num2) {
		return num ^ num2;
	}
	int potenciacao(int num, int num2, int num3) {
		return num ^ num2 ^ num3;
	}
	int potenciacao(int num, int num2, int num3, int num4) {
		return num ^ num2 ^ num3 ^ num4;
	}

}
