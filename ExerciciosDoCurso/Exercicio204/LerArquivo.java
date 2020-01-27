package Exercicio204;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo extends Arquivo {
	
	
	private String line;
	private Linked linked;
	public LerArquivo(String file) {
		super(file);
	}


	public void lendoArquivo() {
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(getFile()))) {
			
			String valor = br.readLine();
			this.line = valor.substring(0, valor.indexOf(" "));
			linked = new Linked(line);
			
		while(valor != null){
			
			this.line = valor.substring(0, valor.indexOf(" "));
			linked.setLinked(this.line);

			valor = br.readLine();
			
		}
		

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("Mensagem " + e.getMessage());
			System.out.println("Localização: " + e.getLocalizedMessage());
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Mensagem: " + e.getMessage());
			System.out.println("Localização: " + e.getLocalizedMessage());
		}
		
	}


	public String getLine() {
		return this.line;
	}


	public Linked getLinked() {
		return this.linked;
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
