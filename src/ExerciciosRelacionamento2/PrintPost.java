package ExerciciosRelacionamento2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrintPost {

	public static void main(String[] args) {
		Comment cm1 = new Comment();
		Comment cm2 = new Comment();
		Comment cm3 = new Comment();
		
		Post pt = new Post();
		Scanner sc = new Scanner(System.in);
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
		
		System.out.println("Titulo do Post: ");
		String title = sc.nextLine();
		System.out.println("Content: ");
		String content = sc.nextLine();
		System.out.println("Likes: ");
		int like = sc.nextInt();
		pt.setPost(data, title, content, like);
		cm1.setText("Muito bom seu texto");
		cm2.setText("Caramba como ele é inteligente!");
		cm3.setText("Vocês são muito foda!");
		pt.addComment(cm1);
		pt.addComment(cm2);
		pt.addComment(cm3);
		
		System.out.println();
		System.out.println();
		System.out.println(pt.getTitle());
		System.out.println(pt.getLikes() + " Linkes - " + sdf.format(pt.getMoment()));
		System.out.println(pt.getContent());
		
		System.out.println();
		System.out.println();
		System.out.println(pt.getTitle());
		System.out.println("Likes: " +  pt.getLikes() + " Data: " + sdf.format(pt.getMoment()));
		System.out.println("Content: " + pt.getContent());
		System.out.println();
		
		System.out.println("Comentários:");
		for(int i = 0; i < pt.quantity(); i ++) {
			System.out.println("Comentário: " + pt.getComment(i).getText());
		}

	}
}
