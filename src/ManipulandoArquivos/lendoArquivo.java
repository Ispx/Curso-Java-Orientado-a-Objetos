package ManipulandoArquivos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class lendoArquivo {
	public static void main(String[] args) {
		
		File file;
		Scanner sc = null;
		String caminho = "C:\\Users\\isaqu\\OneDrive\\Documentos\\texto.txt";
		
		try {
			file = new File(caminho);
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.err.print(e.getMessage());
		}
		
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	
	}
}

