package testes.idInexistente;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import controllersDAO.ControllerDAOUsuario;

public class TesteDAOCRUDIdInexistente {
	
	@Test
	public void testShowUserIdInexistente() throws Exception{
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Marcello", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		assertNull(contDAOUser.showUser(15));
	}
	
	@Test
	public void testUpdateIdInexistente() throws Exception{
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateEndereco(15, "talRua", "talBairro", "talCidade", "talEstado", 1526);
		assertFalse(result);
	}
	
	@Test
	public void testDeletarUsuarioIdInexistente() throws Exception{
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Marcello", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		assertFalse(contDAOUser.rmUsuario(15));
	}
}
