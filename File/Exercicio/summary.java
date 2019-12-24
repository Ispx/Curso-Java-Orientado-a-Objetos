package Exercicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class summary extends Produtos{
	private double summary;
	
	public summary(String name, double value, int quantidade) {
		super(name, value, quantidade);
		summary = value * quantidade;
	}
	

	public double getSummary() {
		return this.summary;
	}
	
	@Override
	public String toString() {
		return getName() + ", R$ " + summary; 
	}
	public boolean validaSummary(String caminhoFolder,String nomeFile) {
		if(new File(caminhoFolder + "out").exists() == false) {
			new File(caminhoFolder + "out").mkdir();
			try {
				new FileWriter(caminhoFolder +"\\"+ nomeFile,true);
			} catch (IOException e1) {
				e1.getMessage();
				e1.printStackTrace();
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
