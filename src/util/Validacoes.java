package util;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entities.Usuario;

public class Validacoes {
	
	/* SE:
	- (OK - Java) Diferente de string vazia
	- (OK - Java) Diferente de apenas espaços vazios
	- (OK) Existe no 'BD'
	- (OK) É número inteiro */
	public boolean ehIdValido(int id, List<Usuario> usuarios) throws Exception {
		String id2 = String.valueOf(id);
		Pattern padrao = Pattern.compile("[1-9]*");
		Matcher entrada = padrao.matcher(id2);
		
		Usuario usuario = null;
		try {
			usuario = usuarios.get(id-1); 
		} catch (Exception e) {
			//System.out.println("Error: " + e.getMessage());
			if(usuario == null || !(entrada.matches())) {
				System.out.println("Id inválido.");
				return false;
			}
		}
		
		return true;
	}
	
	/* SE:
	- (OK - Java) Diferente de string vazia
	- (OK - Java) Diferente de apenas espaços vazios
	- (AK) É apenas letras */
	public boolean ehTextoValido(String texto) throws Exception {
		
		Pattern padrao = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9| ]*[a-zA-Z]$");
		Matcher entrada = padrao.matcher(texto);
		
		if(entrada.matches()) return true;
		return false;
	}
	
	/* SE:
	- (OK - Java) Diferente de string vazia
	- (OK - Java) Diferente de apenas espaços vazios
	- (OK) É número inteiro*/
	public boolean ehNumeroValido(int numero) throws Exception {
		String numero2 = String.valueOf(numero);
		Pattern padrao = Pattern.compile("[1-9]*");
		Matcher entrada = padrao.matcher(numero2);
		if(entrada.matches()) return true;
		System.out.println("Número inválido!");
		return false;
	}
	
	/* SE:
	- (OK - Java) Diferente de string vazia
	- (OK - Java) Diferente de apenas espaços vazios
	- Tem a quantidade certa (pelo menos 11 digitos)
	- TODO: tentar usar máscara
	- (OK) Está no formato certo (procurar validação de numeros telefônicos brasileiros)
	- (OK) São só números inteiros*/
	public boolean ehContatoValido(String contato) throws Exception {
		String contato2 = String.valueOf(contato);
		Pattern padrao = Pattern.compile("^(\\(|)[1-9]{2}(\\)|)( |)(?:[2-8]|9[1-9])[0-9]{3}(\\-|)[0-9]{4}$");
		Matcher entrada = padrao.matcher(contato2);
		if(entrada.matches()) return true;
		System.out.println("Contato inválido!");
		return false;
	}
	
	/* SE:
	- Diferente de string vazia
	- Diferente de apenas espaços vazios
	- São só números
	- É número real*/
	public boolean ehSalarioValido(double salario) throws Exception {
		String salario2 = String.valueOf(salario);
		Pattern padrao = Pattern.compile("^([0-9]*)(\\.)([0-9]*)$");
		Matcher entrada = padrao.matcher(salario2);
		if(entrada.matches()) return true;
		System.out.println("Salário inválido!");
		return false;
	}
}
