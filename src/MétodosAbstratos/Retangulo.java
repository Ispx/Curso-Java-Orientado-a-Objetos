package MétodosAbstratos;

public final class Retangulo extends Forma {
	public Double base;
	public Double altura;
	
	//Sobre posição de método
	@Override
	public Double area() {
		return base * altura;
	}

	public Retangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	
	
	
	
	

}
