package Exercicio205;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
	
	private String nome;
	private Instrutores instrutor;
	private List<Alunos> alunos = new ArrayList<>();
	
	
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
