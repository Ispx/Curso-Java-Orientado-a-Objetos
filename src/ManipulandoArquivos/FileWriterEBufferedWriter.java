package ManipulandoArquivos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] valores = new String[] {"valor 1", "valor 2", "valor 3", "valor 4", "valor 5","linha 6","linha  7"};
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\isaqu\\OneDrive\\Documentos\\Doc.xls",true))){
			
			for (String valor : valores) {
				bw.write(valor);
				bw.newLine();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
	}

}
