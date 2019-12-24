package MétodosAbstratos;

public final class Triangulo extends Forma{
	
	public Double altura;
	public Double base;
	
	@Override
	public Double area() {
		return base * (altura * altura);
	}

	public Triangulo(Double altura, Double base) {
		this.altura = altura;
		this.base = base;
	}



	public Double getAltura() {
		return altura;
	}



	public void setAltura(Double altura) {
		this.altura = altura;
	}



	public Double getBase() {
		return base;
	}



	public void setBase(Double base) {
		this.base = base;
	}
	
}
