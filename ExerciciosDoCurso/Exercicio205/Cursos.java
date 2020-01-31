package Exercicio205;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cursos {
	/*
	 * A classe Cursos é responsável por gerar um curso para um instrutor.
	 * Um curso pode ter vários alunos, porém não repitido.
	 * Está regra de negócio é garantido através dos métodos equals e hashCode estabelecidos dentro da classe Alunos, 
	 * Onde o objeto alunos do tipo Set, só faz respeita-lá.
	 * 
	 */
	
	private String nome;
	private Instrutores instrutor;
	private Set<Alunos> alunos = new HashSet<>();
	
	
	public Cursos() {

	}
	public Cursos(String nome, Instrutores instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}


	public Set<Alunos> getAlunos() {
		return this.alunos;
	}
	
	public int sizeAlunos() {
		return alunos.size();
	}

	public void setAlunos(Alunos alunos) {
		this.alunos.add(alunos);
	}


	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Instrutores getInstrutor() {
		return this.instrutor;
	}


	public void setInstrutor(Instrutores instrutor) {
		this.instrutor = instrutor;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.instrutor == null) ? 0 : this.instrutor.hashCode());
		result = prime * result + ((this.nome == null) ? 0 : this.nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cursos other = (Cursos) obj;
		if (this.instrutor == null) {
			if (other.instrutor != null)
				return false;
		} else if (!this.instrutor.equals(other.instrutor))
			return false;
		if (this.nome == null) {
			if (other.nome != null)
				return false;
		} else if (!this.nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
