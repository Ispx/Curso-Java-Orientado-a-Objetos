package ManipulandoArquivos;
import java.io.File;


public class FolderAndFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File caminho = new File("C:\\Users\\isaqu\\OneDrive\\Documentos\\Documentos txt");
		File[] folders = caminho.listFiles(File::isDirectory);
		File[] files = caminho.listFiles(File::isFile);
		
		for(File folder : folders) {
			System.out.println("Folder: " + folder.getName());
		}
		for(File file : files) {
			System.out.println("File: " + file.getName());
		}
		
		//criando subpasta
		boolean status = new File("C:\\Users\\isaqu\\OneDrive\\Documentos\\novaPasta").mkdir();
		

	}

}
