package testes.invalidos.vazios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import controllersDAO.ControllerDAOUsuario;

public class TestesDAOCRUDVazios {

	// Add com campos vazios
	
	@Test
	public void testAddComNomeVazio() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		assertFalse(result); // TODO: Criar validações para trocar por assertFalse
	}

	@Test
	public void testAddComRuaVazia() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("Parceiro", "", "Centro", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		assertFalse(result); // TODO: Criar validações para trocar por assertFalse
	}

	@Test
	public void testAddComBairroVazio() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "", "Quixadá", "Ceará", 41, "08596168410",
				(double) 1500.0);
		assertFalse(result); // TODO: Criar validações para trocar por assertFalse
	}

	@Test
	public void testAddComcidadeVazia() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "", "Ceará", 41, "08596168410",
				(double) 1500.0);
		assertFalse(result); // TODO: Criar validações para trocar por assertFalse
	}

	@Test
	public void testAddComEstadoVazio() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "", 41,
				"08596168410", (double) 1500.0);
		assertFalse(result); // TODO: Criar validações para trocar por assertFalse
	}

	@Test
	public void testAddComNumeroVazio() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará",
				Integer.parseInt(""), "08596168410", (double) 1500.0);
		assertFalse(result); // TODO: Criar validações para trocar por assertFalse
	}

	@Test
	public void testAddComContatoVazio() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "",
				(double) 1500.0);
		assertFalse(result); // TODO: Criar validações para trocar por assertFalse
	}

	@Test
	public void testAddComSalarioVazio() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41,
				"08596168410", Double.parseDouble(""));
		assertFalse(result); // TODO: Criar validações para trocar por assertFalse
	}
	
	
	// Alterar com campos vazios
	
	@Test
	public void testUpdateIdVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateEndereco(Integer.parseInt(""), "talRua", "talBairro", "talCidade", "talEstado", 1526);
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}
	
	@Test
	public void testUpdateNomeVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateNome(1, "");
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}
	
	@Test
	public void testUpdateRuaVazia() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateEndereco(1, "", "talBairro", "talCidade", "talEstado", 1526);
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}
	
	@Test
	public void testUpdateBairroVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateEndereco(1, "talRua", "", "talCidade", "talEstado", 1526);
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}
	
	@Test
	public void testUpdateCidadeVazia() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateEndereco(1, "talRua", "talBairro", "", "talEstado", 1526);
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}
	
	@Test
	public void testUpdateEstadoVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateEndereco(1, "talRua", "talBairro", "talCidade", "", 1526);
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}
	
	@Test
	public void testUpdateNumeroVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateEndereco(1, "talRua", "talBairro", "talCidade", "talEstado", Integer.parseInt(""));
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}
	
	@Test
	public void testUpdateContatoVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Robson", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateContato(1, "");
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}
	
	@Test
	public void testUpdateSalarioVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Marcello", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateSalario(1, Double.parseDouble(""));
		assertFalse(result); //TODO: Criar validações para trocar por assertFalse
	}

	
	// Ver usuário
	
	@Test
	public void testShowUserIdVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Marcello", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		assertNull(contDAOUser.showUser(Integer.parseInt(""))); //TODO: Criar validações para trocar por assertNull
	}
	
	
	// Deletar usuário

	@Test
	public void testDeletarUsuarioIdVazio() throws Exception{
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		assertFalse(contDAOUser.rmUsuario(Integer.parseInt(""))); //TODO: Criar validações para trocar por assertFalse
	}
}
