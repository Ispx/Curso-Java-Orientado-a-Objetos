package Exercicio; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String caminhoFolder = "C:\\Users\\isaqu\\";
		String nomeFolder = "Pasta dos Produtos";
		String nomeFile = "Produtos Cadastrados.txt";
		String caminhoFile = caminhoFolder+nomeFolder+"\\"+nomeFile;
		
		
		
		Arquivo arq = new Arquivo(caminhoFolder,nomeFolder);
		Produtos pr;
		summary sum;
		
		if(arq.validaFoder(caminhoFolder+nomeFolder) == true) {
			arq.CriarFolder();
			System.out.println("Pasta Criada Com Sucesso!");
		}
		else {
			System.err.println("Pasta já existente!");
		}
		
		if(arq.validaFile(nomeFile) == true) {
			System.out.println("Arquivo Criado com Suscesso!");
		}
		else {
			System.err.println("Arquivo já existente!");
		}
		
		//Operação
		for(int i = 0; i <= 2; i ++) {
			System.out.println("Nome do produto: ");
			String name = sc.next();
			System.out.println("Valor do produto: R$ ");
			Double value = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			pr = new Produtos(name,value,quantidade);
			sum = new summary(name,value,quantidade);
			
			//Operação
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoFile,true))){
				bw.write(pr.toString());
				bw.newLine();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			
			//Operação
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoFolder+"out\\summary.txt",true))){
				bw.write(sum.toString());
				bw.newLine();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			
			
		}
		
		//Operação
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoFile))){
			
			String line = br.readLine();
			//Operação
			while(line != null){
				System.out.println(line);
				line = br.readLine();

			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		
		
		
			
		
		

		
		
		
		
		
		
		sc.close();
	}
	

}
