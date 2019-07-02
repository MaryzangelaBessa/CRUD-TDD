package boundaries;

import java.util.Scanner;


import controllersDAO.ControllerDAOUsuario;
import util.Validacoes;

public class SysMary {
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		boolean run = true;
		scanner = new Scanner(System.in);
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		Validacoes validacao = new Validacoes();
		int id = -1;
		contDAOUser.addUsuario("UsuarioTeste1", "RuaTeste1", "BairroTeste1", "CidadeTeste1", "EstadoTeste1", 123, "88996066716", 150.5);
		contDAOUser.addUsuario("UsuarioTeste2", "RuaTeste2", "BairroTeste2", "CidadeTeste2", "EstadoTeste2", 123, "88996066716", 1252.1);
		
		contDAOUser.addUsuario("UsuarioTeste", "RuaTeste", "BairroTeste", "CidadeTeste", "EstadoTeste", 123, "88996066716", 1252.2);
		contDAOUser.addUsuario("nome", "rua", "bairro", "cidade", "estado", 123, "88996066716", 1252.2);
		contDAOUser.addUsuario("NOME", "RUA", "BAIRRO", "CIDADE", "ESTADO", 123, "88996066716", 1252.2);
		while (run) {
			System.out.println("----------USUÁRIOS----------");
			System.out.println("Escolha a ação:");
			System.out.println("1 - Cadastrar:");
			System.out.println("2 - Ver Usuário");
			System.out.println("3 - Listar Usuários");
			System.out.println("4 - Alterar");
			System.out.println("5 - Deletar");
			System.out.println("0 - Sair");
			System.out.println("----------------------------");
			System.out.println(">>> ");

			int menu = -1;
			
			try {
				menu = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			
			switch (menu) {

			case 1:
				System.out.println("-----Cadastrar Usuário------\n");
				System.out.println("Digite o nome do usuario: ");
				String nome = scanner.nextLine();
				while(!validacao.ehTextoValido(nome)) {
					System.out.println("Nome inválido!");
					System.out.println("Digite um nome válido para o usuario: ");
					nome = scanner.nextLine();
				}
				
				System.out.println("Digite a rua do usuario: ");
				String rua = scanner.nextLine();
				while(!validacao.ehTextoValido(rua)) {
					System.out.println("Rua inválida!");
					System.out.println("Digite uma rua válida para o usuario: ");
					rua = scanner.nextLine();
				}
				
				System.out.println("Digite o bairro do usuario: ");
				String bairro = scanner.nextLine();
				while(!validacao.ehTextoValido(bairro)) {
					System.out.println("Bairro inválido!");
					System.out.println("Digite um bairro válido para o usuario: ");
					bairro = scanner.nextLine();
				}
				
				System.out.println("Digite a cidade do usuario: ");
				String cidade = scanner.nextLine();
				while(!validacao.ehTextoValido(cidade)) {
					System.out.println("Cidade inválida!");
					System.out.println("Digite uma cidade válida para o usuario: ");
					cidade = scanner.nextLine();
				}
				
				System.out.println("Digite o estado do usuario: ");
				String estado = scanner.nextLine();
				while(!validacao.ehTextoValido(estado)) {
					System.out.println("Estado inválido!");
					System.out.println("Digite um estado válido para o usuario: ");
					estado = scanner.nextLine();
				}
				
				System.out.println("Digite o numero da casa do usuario: ");
				int numero = -1;
				try {
					numero = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				while(!validacao.ehNumeroValido(numero)) {
					System.out.println("Digite um número válido para a casa do usuario: ");
					try {
						numero = Integer.parseInt(scanner.nextLine());
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
					}					
				}
				
				System.out.println("Digite o cantato do usuario: ");
				String contato = scanner.nextLine();
				while(!validacao.ehContatoValido(contato)) {
					System.out.println("Digite um contato telefôico válido para o usuario: ");
					contato = scanner.nextLine();
				}
				
				System.out.println("Digite o salario do usuario: ");
				double salario = -1;
				try {
					salario = Double.parseDouble(scanner.nextLine());
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				while(!validacao.ehSalarioValido(salario)) {
					System.out.println("Digite um salário válido para o usuario: ");
					try {
						salario = Double.parseDouble(scanner.nextLine());
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
					}					
				}
				
				try {
					contDAOUser.addUsuario(nome, rua, bairro, cidade, estado, numero, contato, salario);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}

				break;

			case 2:
				System.out.println("Digite o id do usuário que deseja buscar: ");
				try {
					id = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				while(!validacao.ehIdValido(id, contDAOUser.listarUsuarios())) {
					System.out.println("Digite um id de usuario novamente: ");
					try {
						id = Integer.parseInt(scanner.nextLine());
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
					}					
				}
				try {
					System.out.println(contDAOUser.showUser(id));
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 3:
				try {
					contDAOUser.MostrarUsuarios();
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				
				break;

			case 4:
				new BoundaryUpdateUsuario().menuUpdateUsuario();
				break;

			case 5:
				System.out.println("Digite o id do usuário que deseja deletar: ");
				try {
					id = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				while(!validacao.ehIdValido(id, contDAOUser.listarUsuarios())) {
					System.out.println("Digite um id de usuario novamente: ");
					try {
						id = Integer.parseInt(scanner.nextLine());
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
					}					
				}
				
				try {
					contDAOUser.rmUsuario(id);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			case 0:
				run = false;
				System.out.println("GoodBye!");
				return;
			default:
				System.out.println("Escolha Invalida!");
				break;
			}
		}
	}
}