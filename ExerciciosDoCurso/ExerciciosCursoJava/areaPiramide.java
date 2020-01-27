package ExerciciosCursoJava;

import java.util.Scanner;

import OperadoresBasicos.locale;

class areaPiramide {
	
	public double area (double a,double b,double c) {
		double p = (a+b+c)/2;
		double varea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return varea;
	}
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC = 0;
		double yA, yB, yC = 0;
		String str = null;
		areaPiramide obj = new areaPiramide();
		
		System.out.println("Informe os valores da pirâmide X: " );
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Informe os valores da pirâmide Y: " );
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		
		System.out.printf("Área da pirâmide X: %.2f %n %n", obj.area(xA,xB,xC));
		System.out.printf("Área da pirâmide Y: %.2f %n %n", obj.area(yA,yB,yC));
		
		str = obj.area(xA, xB, xC) > obj.area(yA, yB, yC) ? "A pirâmide X é maior!" : "A pirâmide Y é Maior!";
		System.out.println(str);
	
	}
}