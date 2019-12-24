package RelacionamentoTemMuitos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class printAlunoTurma {

	public static void main(String[] args) throws ParseException {
		
		Turma turma = new Turma();
		Turma turma2 = new Turma();
		
		turma.setSigla("3B");
		turma.setAno("3º");
		turma2.setSigla("2A");
		turma2.setAno("2º");
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();

		Date data = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		aluno1.setNome("Isaque");
		data = sdf.parse("23/10/1998");
		aluno1.setDataNascimento(data);
		aluno1.setTurma(turma); //Informando que o aluno1 pertence a turma X 
		turma.adicionaAlunos(aluno1); // Informando que na turma X contém o aluno1
								
		aluno2.setNome("Maria");
		data = sdf.parse("15/11/1999");
		aluno2.setDataNascimento(data);
		aluno2.setTurma(turma);
		turma.adicionaAlunos(aluno2); 
		
		aluno3.setNome("Joana");
		data = sdf.parse("27/5/1998");
		aluno3.setDataNascimento(data);
		aluno3.setTurma(turma);
		turma.adicionaAlunos(aluno3); 
		
		
		aluno4.setNome("Joabe");
		data = sdf.parse("30/7/1998");
		aluno4.setDataNascimento(data);
		aluno4.setTurma(turma2);
		turma2.adicionaAlunos(aluno4); 
		
		System.out.println("========================================================================================");
		
		for(int i = 0; i < turma.quantidade() ; i ++) {
			System.out.println(turma.getAlunos(i).getNome());
			System.out.println("-----------------");
		}
		


	}

}
