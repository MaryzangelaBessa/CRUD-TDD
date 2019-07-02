package entities;

public class Usuario {
    private int id;
    static int proxid = 1;
    private String nome;
    private Endereco endereco;
    private String contato;
    private double salario;

    public Usuario(String nome, Endereco endereco, String contato, double salario) {
        this.incrementId();
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void incrementId() {
    	id = proxid;
    	proxid++;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
    public String toString() {
        return "Usuario " + id + "\n>Nome: " + nome + "\n>>Endereco" + endereco + "\n>Contato: " + contato + "\n>Salario: " + salario + "\n";
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario)!= Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
	

}
