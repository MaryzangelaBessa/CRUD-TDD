package boundaries;

import java.util.Scanner;

import controllersDAO.ControllerDAOUsuario;
import util.Validacoes;

public class BoundaryUpdateUsuario {
	private static Scanner scanner;

	public void menuUpdateUsuario() throws Exception {
		boolean run = true;
		scanner = new Scanner(System.in);
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		Validacoes validacao = new Validacoes();
		
		while (run) {
			System.out.println("\n------Atualizar Usuário------");
			System.out.println("Escolha o que deseja alterar:");
			System.out.println("1 - Nome");
			System.out.println("2 - Endereco");
			System.out.println("3 - Contato");
			System.out.println("4 - Salário");
			System.out.println("5 - Voltar");
			System.out.println("6 - Ver usuários");
			System.out.println("-----------------------------");
			System.out.println(">>> ");

			int id = -1;
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				scanner.nextLine();
				System.out.println("Digite o id do usuário que deseja alterar o nome: ");
				try {
					id = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					//System.out.println("Error: " + e.getMessage());
				}
				while(!validacao.ehIdValido(id, contDAOUser.listarUsuarios())) {
					System.out.println("Digite um id de usuario novamente: ");
					try {
						id = Integer.parseInt(scanner.nextLine());
					} catch (Exception e1) {
						//System.out.println("Error: " + e1.getMessage());
					}					
				}
				
				System.out.println("Digite o novo nome do usuário: ");
				String nome = scanner.nextLine();
				while(!validacao.ehTextoValido(nome)) {
					System.out.println("Nome inválido!");
					System.out.println("Digite um novo nome válido para o usuario: ");
					nome = scanner.nextLine();
				}
				
				try {
					contDAOUser.updateNome(id, nome);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			case 2:
				scanner.nextLine();
				System.out.println("Digite o id do usuário que deseja alterar o endereco: ");
				try {
					id = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					//System.out.println("Error: " + e.getMessage());
				}
				while(!validacao.ehIdValido(id, contDAOUser.listarUsuarios())) {
					System.out.println("Digite um id de usuario novamente: ");
					try {
						id = Integer.parseInt(scanner.nextLine());
					} catch (Exception e1) {
						//System.out.println("Error: " + e1.getMessage());
					}					
				}
				
				System.out.println("Digite a nova rua do usuário: ");
				String rua = scanner.nextLine();
				while(!validacao.ehTextoValido(rua)) {
					System.out.println("Rua inválida!");
					System.out.println("Digite uma nova rua válida para o usuario: ");
					rua = scanner.nextLine();
				}
				
				System.out.println("Digite o novo bairro do usuário: ");
				String bairro = scanner.nextLine();
				while(!validacao.ehTextoValido(bairro)) {
					System.out.println("Bairro inválido!");
					System.out.println("Digite um novo bairro válido para o usuario: ");
					rua = scanner.nextLine();
				}
				
				System.out.println("Digite a nova cidade do usuário: ");
				String cidade = scanner.nextLine();
				while(!validacao.ehTextoValido(cidade)) {
					System.out.println("Cidade inválida!");
					System.out.println("Digite uma nova cidade válida para o usuario: ");
					cidade = scanner.nextLine();
				}
				
				System.out.println("Digite o novo estado do usuário: ");
				String estado = scanner.nextLine();
				while(!validacao.ehTextoValido(estado)) {
					System.out.println("Estado inválido!");
					System.out.println("Digite um novo estado válido para o usuario: ");
					estado = scanner.nextLine();
				}

				System.out.println("Digite o novo número de endereco do usuário: ");
				int numero = Integer.parseInt(scanner.nextLine());
				while(!validacao.ehNumeroValido(numero)) {
					System.out.println("Número inválido!");
					System.out.println("Digite um novo numero válido para o usuario: ");
					numero = Integer.parseInt(scanner.nextLine());
				}
				
				try {
					contDAOUser.updateEndereco(id, rua, bairro, cidade, estado, numero);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 3:
				scanner.nextLine();
				System.out.println("Digite o id do usuário que deseja alterar o contato: ");
				try {
					id = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					//System.out.println("Error: " + e.getMessage());
				}
				while(!validacao.ehIdValido(id, contDAOUser.listarUsuarios())) {
					System.out.println("Digite um id de usuario novamente: ");
					try {
						id = Integer.parseInt(scanner.nextLine());
					} catch (Exception e1) {
						//System.out.println("Error: " + e1.getMessage());
					}					
				}
				
				System.out.println("Digite o novo contato do usuário: ");
				String contato = scanner.nextLine();
				while(!validacao.ehTextoValido(contato)) {
					System.out.println("Contato inválido!");
					System.out.println("Digite um novo contato válido para o usuario: ");
					contato = scanner.nextLine();
				}
				
				try {
					contDAOUser.updateContato(id, contato);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 4:
				scanner.nextLine();
				System.out.println("Digite o id do usuário que deseja alterar o salário: ");
				try {
					id = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					//System.out.println("Error: " + e.getMessage());
				}
				while(!validacao.ehIdValido(id, contDAOUser.listarUsuarios())) {
					System.out.println("Digite um id de usuario novamente: ");
					try {
						id = Integer.parseInt(scanner.nextLine());
					} catch (Exception e1) {
						//System.out.println("Error: " + e1.getMessage());
					}					
				}
				
				System.out.println("Digite o novo salário do usuário: ");
				Double salario = Double.parseDouble(scanner.nextLine());
				while(!validacao.ehSalarioValido(salario)) {
					System.out.println("Salário inválido!");
					System.out.println("Digite um novo salário válido para o usuario: ");
					salario = Double.parseDouble(scanner.nextLine());
				}
				
				try {
					contDAOUser.updateSalario(id, salario);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
				
			case 5:
				run = false;
				break;
			
			case 6:
				try {
					contDAOUser.MostrarUsuarios();
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				
				break;
			default:
				System.out.println("Escolha Invalida!");
				break;
			}

		}

	}

}