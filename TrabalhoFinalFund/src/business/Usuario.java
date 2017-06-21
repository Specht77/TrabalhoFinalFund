package business;

public class Usuario {
	
	private String nome;
	private int cpfcnpj;
	private String email;
	
	public Usuario(String nome, int cpfcnpj, String email){
		this.nome = nome;
		this.cpfcnpj = cpfcnpj;
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpfcnpj(int cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome(){
		return nome;
	}
	
	public int getCpfCnpj(){
		return cpfcnpj;
	}
	
	public String getEmail() {
		return email;
	}
	

}

