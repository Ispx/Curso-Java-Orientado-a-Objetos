package CursoJava;

import java.util.Random;

public class CondicaoTernaria {

	public static void main(String[] args) {
		Random rd = new Random();
		int x = rd.nextInt(10);
		int y;
		
		// x � menor do que 5 ? Se sim x * x + 1, se n�o ent�o retorna  x
		y = x < 5 ? x * x + 1 : x;
		
		
		System.out.println(x + "\n" + y);

	}

}
