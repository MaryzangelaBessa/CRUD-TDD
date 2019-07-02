package testes.validos;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import controllersDAO.ControllerDAOUsuario;


public class TestesDAOCRUDValidos {

	@Test
	public void testAdd() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41, "88996066716", (double)1500.0);
		assertTrue(result);
	}

	@Test
	public void testUpdateNome() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41, "88996066716", (double)1500.0);
		boolean result = contDAOUser.updateNome(1, "gOdinho");
		assertTrue(result);
	}
//	
//	@Test
//	public void testUpdateEndereco() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		contDAOUser.addUsuario("Parceiro", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41, "88996066716", (double)1500.0);
//		boolean result = contDAOUser.updateEndereco(1, "Atras da rodoviaria", "Centro", "Quixada", "CE", 1526);
//		assertTrue(result);
//	}
//	
//	@Test
//	public void testUpdateContato() throws Exception {
//		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
//		contDAOUser.addUsuario("Robson", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41, "88998065317", (double)1500.0);
//		boolean result = contDAOUser.updateContato(1, "88998065310");
//		assertTrue(result);
//	}
//	
	@Test
	public void testUpdateSalario() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Marcello", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41, "88998065317", (double)1500.0);
		boolean result = contDAOUser.updateSalario(1, (double)499.0);
		assertTrue(result);
	}
	
	@Test
	public void testRm() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		contDAOUser.addUsuario("Maria", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41, "88998065317", (double)1500.0);
		boolean result = contDAOUser.rmUsuario(1);
		assertTrue(result);
	}
}
