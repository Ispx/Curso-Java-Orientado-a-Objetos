package RelacionamentoTemMuitos;

import java.util.ArrayList;

public class Turma {
	private String ano;
	private String sigla;
	private ArrayList<Aluno> alunos;
	
	public Turma(){
		 alunos = new ArrayList<Aluno>();
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void adicionaAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void removeAlunos(Aluno aluno) {
		this.alunos.remove(aluno);
	}
	public int quantidade() {
		return alunos.size();
	}
	public Aluno getAlunos(int i) {
		return this.alunos.get(i);
	}

}
