package entities;

public class Endereco {
	private String rua, bairro, cidade, estado;
	private int numero;
	
	public Endereco(String rua, String bairro, String cidade, String estado, int numero) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "\n  Rua: " + rua + "\n  Bairro: " + bairro + "\n  Cidade: " + cidade + "\n  Estado: " + estado + "\n  Número: " + numero;
	}
}
