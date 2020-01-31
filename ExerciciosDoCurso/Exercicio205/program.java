package Exercicio205;

import java.util.Scanner;

public class program {
	

	public static void main(String[] args) {
		/*
		 * Este algoritmo cria cursos para um determinado instrutor,
		 * Inseri alunos no mesmo e apresenta os alunos e a quantidade de alunos para cada curso. 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		Instrutores instructor;
		Cursos course = new Cursos();
		Alunos student;
		Integer i = 0;
		

				
		System.out.println("System Register of Courses");
		
		System.out.println("Name of Instructor: ");
		instructor = new Instrutores(sc.next());
		
		System.out.println();
		System.out.println("Does wish promoter a new course? (y/n):");
		String input = sc.next();
		if(input.equalsIgnoreCase("y")) {
			
			while(true){	
						
				System.out.println("Name of course: ");
				course = new Cursos(sc.next(),instructor);
		
				instructor.setCursos(i,course);
				
				System.out.println("Does wish promoter a new course? (y/n):");
				input = sc.next();
				
				if(input.equalsIgnoreCase("y")) {
					i = i +1;
				}else {
					break;
				}
				
			}
			
			System.out.println("Cursos");
			
			instructor.printCourses();
			
			System.out.println("What course wish register a student? y/n: ");
			int var = sc.nextInt();
			
			while(true){
				
				System.out.println("Inform the number of register of student:");
				int regist = sc.nextInt();
				System.out.println("Inform the name of student: ");
				String name = sc.next();
				student = new Alunos(regist,name);
	
				student.setCursos(course);
				instructor.getCursos().get(var).setAlunos(student);
				
				System.out.println("Does wish register a new student? (y/n):");
				input = sc.next();
				
				if(input.equalsIgnoreCase("y")) {
					
				}else {
					break;
				}
				
			}
			
			
			System.out.println("Course: " + instructor.getCursos().get(var).getNome());
			
			System.out.println();
			
			System.out.println("Alunos matriculados:");
			for(Alunos e : instructor.getCursos().get(var).getAlunos()) {
				System.out.println(e.getNome());
			}
			
			//Alta complexidade
			for(i = 0; i < instructor.getCursos().size(); i ++) {
				Cursos y = instructor.getCursos().get(i);
				
				
				System.out.println("\n--------------------------------------------------------------------\n");
				System.out.println("Course: " + y.getNome() + " - Total of Students: " + instructor.getCursos().get(i).sizeAlunos());
				
				for(Alunos e : instructor.getCursos().get(i).getAlunos()) {
					System.out.println("Student: " + e.getNome() +  " - Registro: " + e.getRegistro());
				}
				
				System.out.println("\n--------------------------------------------------------------------\n");
			}
			sc.close();
		}
		else {
			System.out.println("End.");
			sc.close();
		}

	}
	

}
