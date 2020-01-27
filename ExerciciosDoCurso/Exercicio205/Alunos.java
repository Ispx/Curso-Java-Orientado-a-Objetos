package Exercicio205;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
	
	private Integer registro;
	private String nome;
	private List<Cursos> cursos = new ArrayList<>();
	
	
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
	

	
}
