package Exercicio205;

import java.util.HashSet;
import java.util.Set;

public class Alunos {
	/*Observações:
	 * 
	 * A classe Alunos é responsável por gerar um registro e nome de um aluno;
	 * Um aluno tem vários cursos e os mesmos não se repete.
	 * Um aluno não pode ser gerado com o mesmo número de registro já existente, 
	 * Isto é garantido através do Objeto Alunos do tipo Set dentro do módulo Cursos
	 * Que obedece a regra  estabelecida através dos métodos equals e hashCode dentro da classe Alunos.
	 * 
	 */
	
	private Integer registro;
	private String nome;
	private Set<Cursos> cursos = new HashSet<>();

	
	public Alunos(Integer registro, String nome) {
		this.registro = registro;
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.registro == null) ? 0 : this.registro.hashCode());
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
		Alunos other = (Alunos) obj;
		if (this.registro == null) {
			if (other.registro != null)
				return false;
		} else if (!this.registro.equals(other.registro))
			return false;
		return true;
	}
	
	public Integer getRegistro() {
		return this.registro;
	}
	public void setRegistro(Integer registro) {
		this.registro = registro;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Cursos> getCursos() {
		return this.cursos;
	}
	public void setCursos(Cursos cursos) {
		this.cursos.add(cursos);
	}
	
	

	
}
