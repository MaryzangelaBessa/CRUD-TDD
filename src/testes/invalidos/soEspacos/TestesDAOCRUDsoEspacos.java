package testes.invalidos.soEspacos;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import controllersDAO.ControllerDAOUsuario;

public class TestesDAOCRUDsoEspacos {

	// Add com apenas espaços em branco

	@Test
	public void testAddComNomeEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("  ", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddComRuaEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Parceiro", "  ", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddComBairroEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "  ", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddComcidadeEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "  ", "Ceará", 41, "08596168410",
				(double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddComEstadoEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "  ", 41,
				"08596168410", (double) 1500.0);
		assertFalse(result);
	}

//	@Test
//	public void testAddComNumeroEmBranco() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará",
//				Integer.parseInt("  "), "08596168410", (double) 1500.0);
//		assertFalse(result);
//	}

	@Test
	public void testAddComContatoEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "",
				(double) 1500.0);
		assertFalse(result);
	}

//	@Test
//	public void testAddComSalarioEmBranco() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41,
//				"08596168410", Double.parseDouble("  "));
//		assertFalse(result);
//	}

	// Alterar com apenas espaços em branco

//	@Test
//	public void testUpdateIdEmBranco() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
//				(double) 1500.0);
//		boolean result = contDAOUser.updateEndereco(Integer.parseInt("  "), "talRua", "talBairro", "talCidade",
//				"talEstado", 1526);
//		assertFalse(result);
//	}

	@Test
	public void testUpdateNomeEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		boolean result = contDAOUser.updateNome(1, "  ");
		assertFalse(result);
	}

	@Test
	public void testUpdateRuaEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		boolean result = contDAOUser.updateEndereco(1, "  ", "talBairro", "talCidade", "talEstado", 1526);
		assertFalse(result);
	}

	@Test
	public void testUpdateBairroEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		boolean result = contDAOUser.updateEndereco(1, "talRua", "  ", "talCidade", "talEstado", 1526);
		assertFalse(result);
	}

	@Test
	public void testUpdateCidadeEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		boolean result = contDAOUser.updateEndereco(1, "talRua", "talBairro", "  ", "talEstado", 1526);
		assertFalse(result);
	}

	@Test
	public void testUpdateEstadoEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		boolean result = contDAOUser.updateEndereco(1, "talRua", "talBairro", "talCidade", "  ", 1526);
		assertFalse(result);
	}

//	@Test
//	public void testUpdateNumeroEmBranco() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
//				(double) 1500.0);
//		boolean result = contDAOUser.updateEndereco(1, "talRua", "talBairro", "talCidade", "talEstado",
//				Integer.parseInt("  "));
//		assertFalse(result);
//	}

	@Test
	public void testUpdateContatoEmBranco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Robson", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		boolean result = contDAOUser.updateContato(1, "  ");
		assertFalse(result);
	}

//	@Test
//	public void testUpdateSalarioEmBranco() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		contDAOUser.addUsuario("Marcello", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
//				(double) 1500.0);
//		boolean result = contDAOUser.updateSalario(1, Double.parseDouble("  "));
//		assertFalse(result);
//	}

	// Ver usuário
//
//	@Test
//	public void testShowUserIdEmBranco() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		contDAOUser.addUsuario("Marcello", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
//				(double) 1500.0);
//		assertNull(contDAOUser.showUser(Integer.parseInt("  ")));
//	}

	// Deletar usuário

//	@Test
//	public void testDeletarUsuarioIdEmBranco() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		assertFalse(contDAOUser.rmUsuario(Integer.parseInt("  ")));
//	}
}
	