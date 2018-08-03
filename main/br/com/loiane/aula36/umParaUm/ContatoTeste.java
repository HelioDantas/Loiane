package Loiane.main.br.com.loiane.aula36.umParaUm;

public class ContatoTeste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		Endereco end = new Endereco();
		end.setCep("1111111");
		end.setCidade("KingLand");
		end.setComplemento("");
		end.setEstado("estero");
		end.setNomeRua("Rua game of trones");
		end.setNumero("44");
		
		Telefone tel = new Telefone();
		tel.setTipo("Telefone");
		tel.setDdd("21");
		tel.setNumero("99999999");		
		
		contato.setName("Tyrion");
		contato.setEndereco(end);
		contato.setTelefones(tel);
		
		System.out.println(contato.getName());
		System.out.println(contato.getEndereco().getEstado());
		System.out.println(contato.getEndereco().getNomeRua());
		
		System.out.println(contato.getTelefones());
		

	}

}
