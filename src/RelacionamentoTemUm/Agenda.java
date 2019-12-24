package RelacionamentoTemUm;
import java.util.ArrayList;

public class Agenda {
	private String name;
	// Relacionamento Tem muitos
	private ArrayList<Contatos> telefones; 
	// Relacionamento Tem um
	private Endereco endereco;
	
	
	
	public Agenda() {
		telefones = new ArrayList<Contatos>();
	}
	
	public int quantidadeTelefone() {
		return telefones.size();
	}
	public void adicionarTelefone(Contatos telefone) {
		this.telefones.add(telefone);
	}
	public void removerTelefone(Contatos telefone) {
		this.telefones.remove(telefone);
	}
	public Contatos getTelefone(int i) {
		return telefones.get(i);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
