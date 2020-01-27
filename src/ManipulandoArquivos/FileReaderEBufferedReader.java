package ManipulandoArquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caminho = "C:\\Users\\isaqu\\OneDrive\\Documentos\\doc.xls";
	
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
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
