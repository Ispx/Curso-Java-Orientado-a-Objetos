package ExercicioManipulandoArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo{
	private String caminho;
	private String nome;
	private boolean status;
	public Arquivo(String caminho, String nome) {
		this.caminho = caminho;
		this.nome = nome;
	}
	public void CriarFolder() {
		status = new File(caminho +"\\"+ nome).mkdir();
	}

	public void CriarFile(String nome) {
		
		try {
			new FileWriter(toString() + "\\" + nome,true);
		
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public boolean validaFoder(String caminho) {
		if(new File(caminho).exists() == true) {
			return false;
		}
		
		else {
			CriarFolder();
			return true;
	
		}
	}
	public boolean validaFile(String nome) {
		if(new File(toString()+ "\\" + nome).exists() == true) {
			return false;
		}
		else {
			CriarFile(nome);
			return true;
		}
	}
	public String getCaminho() {
		return this.caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	public boolean getStatus() {
		return status;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return  caminho + "\\" + nome;
	}
	
}
