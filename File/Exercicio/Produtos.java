package Exercicio;

public class Produtos{
	private String name;
	private double value;
	private int quantidade;
	
public Produtos(String name, double value, int quantidade) {
	this.name = name;
	this.value = value;
	this.quantidade = quantidade;
}

@Override
public String toString() {
	return name + "," + value + "," + quantidade;
}

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}

public double getValue() {
	return this.value;
}

public void setValue(double value) {
	this.value = value;
}

public int getQuantidade() {
	return this.quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

}
