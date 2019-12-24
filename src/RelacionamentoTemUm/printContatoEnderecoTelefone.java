package RelacionamentoTemUm;

public class printContatoEnderecoTelefone {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.setName("Isaque");
		System.out.println("Nome: " + agenda.getName());
		
		//Tem um - Os valores dos atributos de uma classe sempre vão ser setadps pela classe principal
		Endereco endereco = new Endereco();
	
		//Tem um - Atribuindo valores para os atributos da classe Endereco
		endereco.setNomeRua("Osvaldo Cruz");
		endereco.setBairro("Povoaldo");
		endereco.setCidade("Brasilandia");
		endereco.setCep("321650-00");
		
		
		//Tem um - Setando//Transferindo os valores para o metodo de classe endereço 
		agenda.setEndereco(endereco);
		
		//Tem um - Tratativa de erro
		if (agenda != null && agenda.getEndereco() != null) {
			System.out.println("Rua: " + agenda.getEndereco().getNomeRua());
			System.out.println("Bairro: " + agenda.getEndereco().getBairro());
			System.out.println("Cidade: " + agenda.getEndereco().getCidade());
			System.out.println("CEP: " + agenda.getEndereco().getCep());
		}
		
		//----------------------------------------------------------------------
		
		//Tem muitos - Os valores dos atributos de uma classe sempre vão ser setadps pela classe principal
	
		Contatos telefone1 = new Contatos();
		Contatos telefone2 = new Contatos();
		Contatos telefone4 = new Contatos();

		
		
		
		//Tem muitos - Atribuindo valores para os atributos da classe Telefone
		telefone1.setDdd("31");
		telefone1.setNumTelefone("9377-9036");
		telefone1.setTipo("Celular");
		agenda.adicionarTelefone(telefone1);
		
		
		
		//Tem muitos - Atribuindo valores para os atributos da classe Telefone
		telefone2.setDdd("31");
		telefone2.setNumTelefone("3667-5136");
		telefone2.setTipo("Fixo");
		agenda.adicionarTelefone(telefone2);
		
		
		telefone4.setDdd("31");
		telefone4.setNumTelefone("5467-5326");
		telefone4.setTipo("Fixo");
		agenda.adicionarTelefone(telefone2);
		
		
		for(int i = 0; i < agenda.quantidadeTelefone(); i ++) {
			System.out.println(agenda.getTelefone(i).getNumTelefone());
			
		}
		
		//Tratativa de erro
		/*
		if(contato != null && contato.getTelefone() != null) {
			for (Contatos t : telefones) {
				System.out.println("Telefone: " + "(" + t.getDdd() +")" + t.getNumTelefone() + " - " + t.getTipo());	
				
			}
			*/
		}
		
	}
