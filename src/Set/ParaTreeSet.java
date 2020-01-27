package Set;

public class ParaTreeSet implements Comparable<ParaTreeSet>{
	
	private String name;
	private Integer idade;

	public ParaTreeSet(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.idade;
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
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
		ParaTreeSet other = (ParaTreeSet) obj;
		if (this.idade != other.idade)
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		return true;
	}



	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}



	@Override
	public int compareTo(ParaTreeSet o) {
		// TODO Auto-generated method stub
		return idade.compareTo(o.getIdade());
	}
	


}
