package controllersDAO;

import java.util.ArrayList;
import java.util.List;

import entities.Endereco;
import entities.Usuario;
import util.Validacoes;

public class ControllerDAOUsuario {
	
	private static ControllerDAOUsuario controllerUsuario;
	
	private ControllerDAOUsuario() {
	}
	
	public static synchronized ControllerDAOUsuario getInstace() {
		if(controllerUsuario == null)
			controllerUsuario = new ControllerDAOUsuario();

		return controllerUsuario;
	}
	
	// TODO: Build singleton the BD for Users
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	private ControllerDAOEndereco contEndereco = new ControllerDAOEndereco();

	private Validacoes validacao = new Validacoes();

	// CRUD USUÁRIOS

	public boolean addUsuario(String nome, String rua, String bairro, String cidade, String estado, int numero,
			String contato, double salario) throws Exception {

		if (!validacao.ehTextoValido(nome) || !validacao.ehTextoValido(rua) || !validacao.ehTextoValido(bairro)
				|| !validacao.ehTextoValido(cidade) || !validacao.ehTextoValido(estado)
				|| !validacao.ehNumeroValido(numero) || !validacao.ehContatoValido(contato)
				|| !validacao.ehSalarioValido(salario)) {

			return false;
		}

		Endereco endereco = contEndereco.criarEndereco(rua, bairro, cidade, estado, numero);

		Usuario usuario = new Usuario(nome, endereco, contato, salario);
		try {
			if (!usuarios.contains(usuario)) {
				this.usuarios.add(usuario);
				System.out.println("Usuário cadastrado com sucesso!");
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return false;

	}

	public List<Usuario> listarUsuarios() throws Exception {

		return this.usuarios;
	}

	public void MostrarUsuarios() throws Exception {

		if (this.listarUsuarios().isEmpty())
			System.out.println("Nenhum usuário cadastrado.");

		try {
			System.out.println("\n-----LISTA DE USUÁRIOS------");
			for (Usuario usuario : this.listarUsuarios()) {
				System.out.println(usuario.toString());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public String showUser(int id) throws Exception {

		if (!validacao.ehIdValido(id, this.usuarios)) {
			return null;
		}
		System.out.println("\n----DETALHES DO USUÁRIO-----");
		return this.usuarios.get(id - 1).toString();
	}

	public boolean updateNome(int id, String nome) throws Exception {

		if (!validacao.ehIdValido(id, this.usuarios) || !validacao.ehTextoValido(nome)) {
			return false;
		}

		try {
			for (Usuario usuario : usuarios) {
				if (usuario.getId() == id) {
					usuario.setNome(nome);
					System.out.println("Nome do usuário alterado com sucesso!");
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return false;
	}

	public boolean updateEndereco(int id, String rua, String bairro, String cidade, String estado, int numero)
			throws Exception {

		if (!validacao.ehIdValido(id, this.usuarios) || !validacao.ehTextoValido(rua)
				|| !validacao.ehTextoValido(bairro) || !validacao.ehTextoValido(cidade)
				|| !validacao.ehTextoValido(estado) || !validacao.ehNumeroValido(numero)) {
			return false;
		}

		Endereco newEndereco = contEndereco.alterarEndereco(rua, bairro, cidade, estado, numero);

		try {
			for (Usuario usuario : usuarios) {
				if (usuario.getId() == id) {
					usuario.setEndereco(newEndereco);
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return false;
	}

	public boolean updateContato(int id, String contato) throws Exception {

		if (!validacao.ehIdValido(id, this.usuarios) || !validacao.ehContatoValido(contato)) {
			return false;
		}

		try {
			for (Usuario usuario : usuarios) {
				if (usuario.getId() == id) {
					usuario.setContato(contato);
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return false;
	}

	public boolean updateSalario(int id, double salario) throws Exception {

		if (!validacao.ehIdValido(id, this.usuarios) || !validacao.ehSalarioValido(salario)) {
			return false;
		}

		try {
			for (Usuario usuario : usuarios) {
				if (usuario.getId() == id) {
					usuario.setSalario(salario);
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return false;
	}

	public boolean rmUsuario(int id) throws Exception {

		if (!validacao.ehIdValido(id, this.usuarios)) {
			return false;
		}

		try {
			for (Usuario usuario : usuarios) {
				if (usuario.getId() == id) {
					this.usuarios.remove(usuario);
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return false;
	}
}
