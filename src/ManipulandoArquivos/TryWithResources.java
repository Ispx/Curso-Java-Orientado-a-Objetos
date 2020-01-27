package ManipulandoArquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\isaqu\\OneDrive\\Documentos"))) {
		
			String line = br.readLine();
			
			while(line != null) {
				
				System.out.println(line);
				line = br.readLine();
			
			}
		}
		
		catch(IOException e){
			System.err.print("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
