package RelacionamentoTemMuitos;

import java.util.Date;

public class Aluno {
	private String nome;
	private Date dataNascimento = new Date();
	private Date avaliacao = new Date();
	private Turma turma;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNascimento(Date nascimento) {
		dataNascimento = nascimento;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public Date getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Date avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	

}
