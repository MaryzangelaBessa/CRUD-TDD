package testes.invalidos;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import controllersDAO.ControllerDAOUsuario;

public class TesteFormatoInválido {

	// Add com nome, fora do formato
	@Test
	public void testAddNomeInicioEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario(" Joao", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddNomeFinalEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao ", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddNomeFinalNumero() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao 7", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	// Add com nome da rua, fora do formato
	@Test
	public void testAddRuaInicioEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", " Rua do Sossego", "Centro", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddRuaFinalEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego ", "Centro", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddRuaFinalNumero() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego2", "Centro", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	// Add com nome do bairro, fora do formato
	@Test
	public void testAddBairroInicioEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", " Centro", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddBairroFinalEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego ", "Centro ", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddBairroFinalNumero() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro2", "Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	// Add com nome da cidade, fora do formato
	@Test
	public void testAddCidadeInicioEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", " Quixada", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddCidadeFinalEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada ", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddCidadeFinalNumero() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada5", "Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	// Add com nome do estado, fora do formato
	@Test
	public void testAddEstadoInicioEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada", " Ceara", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddEstadoFinalEspaco() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada", "Ceara ", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddEstadoFinalNumero() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada", "Ceara2", 41,
				"88996066716", (double) 1500.0);
		assertFalse(result);
	}

	// Add com contato, fora do formato
	@Test
	public void testAddContatoLetras() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41, "csduivsdv",
				(double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddContatoEspacosVazios() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41, "	 ",
				(double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddContatoSimbolosEspeciais() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41,
				"@#$%*(&$#)(*&", (double) 1500.0);
		assertFalse(result);
	}

	@Test
	public void testAddContatoNumerosAleatorios() throws Exception {
		ControllerDAOUsuario contDAOUser = ControllerDAOUsuario.getInstace();
		boolean result = contDAOUser.addUsuario("Joao", "Rua do Sossego", "Centro", "Quixada", "Ceara", 41,
				"2156165161646461651", (double) 1500.0);
		assertFalse(result);
	}
}
