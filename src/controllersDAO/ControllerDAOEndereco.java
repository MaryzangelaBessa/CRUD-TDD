package controllersDAO;

import entities.Endereco;

public class ControllerDAOEndereco {
	
	public Endereco criarEndereco(String rua, String bairro, String cidade, String estado, int numero) throws Exception {
		return new Endereco(rua, bairro, cidade, estado, numero);
	}
	
	public Endereco alterarEndereco(String rua, String bairro, String cidade, String estado, int numero) throws Exception {
		return new Endereco(rua, bairro, cidade, estado, numero);
	}
}
