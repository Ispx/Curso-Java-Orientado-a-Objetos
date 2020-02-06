package Exercicio207;


import java.util.HashMap;
import java.util.Map;


public class Eleitores {
	
    LerArquivo arquivo;
 
    Map<String,Integer> eleitores = new HashMap<String, Integer>();
    
    public Eleitores(LerArquivo arquivo) {
		this.arquivo = arquivo;
	}

	public void removeDuplicates() {     
	int soma = 0;
		for(int i = 0; i < arquivo.sizeEleitores(); i ++) {
			
			if(eleitores.containsKey(arquivo.getEleitores(i).getNome()) == true){
				
				soma = eleitores.get(arquivo.getEleitores(i).getNome()) + arquivo.getEleitores(i).getVoto();
				eleitores.put(arquivo.getEleitores(i).getNome(), soma);
				
			}
			else {
				eleitores.put(arquivo.getEleitores(i).getNome(), arquivo.getEleitores(i).getVoto());
			}
		}
	}
	
	
	
	

	public Map<String, Integer> getEleitores() {
		return this.eleitores;
	}

	public void setEleitores(String key,Integer value) {
		this.eleitores.put(key, value);
	}

	public LerArquivo getArquivo() {
		return this.arquivo;
	}

	public void setArquivo(LerArquivo arquivo) {
		this.arquivo = arquivo;
	}
	
	
	
	
	
	
	

}
