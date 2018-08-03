package Loiane.main.br.com.loiane.aula36.umParaMuitos;


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
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("casa");
		tel2.setDdd("21");
		tel2.setNumero("345555555");
		
		Telefone[] telefones = new Telefone[2] ;
		telefones[0] = tel;
		telefones[1] = tel2;
					
		contato.setName("Tyrion");
		contato.setEndereco(end);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getName());
		System.out.println(contato.getEndereco().getEstado());
		System.out.println(contato.getEndereco().getNomeRua());
		
		for (int i = 0; i < telefones.length; i++) {
			System.out.println(contato.getTelefone()[i].getDdd() + " " + contato.getTelefone()[i].getNumero());

			
		}
		
		
	
	}
}
