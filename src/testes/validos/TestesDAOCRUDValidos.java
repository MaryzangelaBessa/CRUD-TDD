package testes.validos;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import controllersDAO.ControllerDAOUsuario;


public class TestesDAOCRUDValidos {

	@Test
	public void testAdd() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		boolean result = contDAOUser.addUsuario("João", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		assertTrue(result);
	}

	@Test
	public void testUpdateNome() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateNome(3, "gOdinho");
		assertTrue(result);
	}
	
	@Test
	public void testUpdateEndereco() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateEndereco(5, "Atrás da rodoviária", "Centro", "Quixadá", "CE", 1526);
		assertTrue(result);
	}
	
	@Test
	public void testUpdateContato() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Robson", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateContato(6, "998051653");
		assertTrue(result);
	}
	
	@Test
	public void testUpdateSalario() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Marcello", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.updateSalario(1, (double)499.0);
		assertTrue(result);
	}
	
	@Test
	public void testRm() throws Exception {
		ControllerDAOUsuario contDAOUser = new ControllerDAOUsuario();
		contDAOUser.addUsuario("Maria", "Rua do Sossego", "Centro", "Quixadá", "Ceará", 41, "08596168410", (double)1500.0);
		boolean result = contDAOUser.rmUsuario(4);
		assertTrue(result);
	}
}
