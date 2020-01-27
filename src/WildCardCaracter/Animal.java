package WildCardCaracter;

public abstract class Animal {
	private String som;
	private String especie;
	
	
	
	public Animal(String som, String especie) {

		this.som = som;
		this.especie = especie;
	}

	public abstract String som();
	public abstract String especie();
	
	
	public String getSom() {
		return this.som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	

}
