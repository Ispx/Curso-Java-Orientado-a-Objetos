package Exercicio205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Instrutores {
	
	/*
	 * A classe Instrutores � respons�vel por gerar um instrutor.
	 * Um instrutor pode ter v�rios alunos n�o repitidos.
	 * Um instrutor pode ter v�rios cursos, por�m os cursos s�o implementados atrav�s de uma lista (O que permite valores duplicados).
	 * Isto � necess�rio para poder acessar um curso especif�co e assim acessar os alunos deste curso especif�co.
	 * Em suma, fazer uma pesquisa especifica.
	 * 
	 */
	
	private String nome;
	private Map<Integer,Cursos> cursos = new HashMap<>();
	private Set<Alunos> alunos = new HashSet<>();
	
	
	public Instrutores(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void printCourses() {
		
		for(int i = 0; i < getCursos().size();i++) {
			Cursos e = getCursos().get(i);
			System.out.println(i + " - " + e.getNome());
		}
		
	}
	
	public Map<Integer, Cursos> getCursos() {
		return this.cursos;
	}

	public void setCursos(Integer i , Cursos cursos) {
		this.cursos.put(i, cursos);
	}

	public Set<Alunos> getAlunos() {
		return this.alunos;
	}

	public void setAlunos(Alunos alunos) {
		this.alunos.add(alunos);
	}


	
	
	
	
	

}
