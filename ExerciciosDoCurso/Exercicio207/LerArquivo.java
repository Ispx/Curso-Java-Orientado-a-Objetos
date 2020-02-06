package Exercicio207;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LerArquivo {
	
	private String path;
    private Eleitor eleitor;
    private List<Eleitor> eleitores = new ArrayList<>();

    
    public LerArquivo(String path) {
		this.path = path;
    }



	public void LerArquivo() {

         

    try(BufferedReader  br = new BufferedReader(new FileReader(getPath()))){
    	
    	String str = br.readLine();

    	while(str != null) {
    		
    		eleitor = new Eleitor(str.substring(0, str.indexOf(",")),Integer.parseInt(str.substring(str.lastIndexOf(",")+1,str.length())));

    		eleitores.add(eleitor);
    		
    		str = br.readLine();     
    		
    	}
    	
    } catch (FileNotFoundException e) {
		
		      // TODO Auto-generated catch block
		
		      e.printStackTrace();
		
		      System.out.println(e.getMessage());
		
		      System.out.println(e.getCause());
		
		} catch (IOException e) {
		
		      // TODO Auto-generated catch block
		
		          e.printStackTrace();
		
		          System.out.println(e.getMessage());
		
		          System.out.println(e.getCause());
		
		    }
    }


    public int getIndexEleitor(Eleitor eleitor) {

        return eleitores.indexOf(eleitor);

  }

    public List<Eleitor> getEleitores() {

        return eleitores;

  }
    public Eleitor getEleitores(int i) {

          return eleitores.get(i);

    }
    
    public void removeEleitor(int i) {
    	this.eleitores.remove(i);
    }




    public void setEleitores(Eleitor eleitores) {

          this.eleitores.add(eleitores);

    }

   

    public int sizeEleitores() {

          return this.eleitores.size();

    }



	public String getPath() {
		return this.path;
	}



	public void setPath(String path) {
		this.path = path;
	}

   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
