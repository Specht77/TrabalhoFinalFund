package business;

public class Bem {

	private String descricaoBreve;
	private String descricaoCompleta;
	private String categoria; //criar 5~6 categorias pr� prontas
	
	public Bem(String descricaoBreve, String descricaoCompleta, String categoria){
		this.descricaoBreve = descricaoBreve;
		this.descricaoCompleta = descricaoCompleta;
		this.categoria = categoria;
	}

	public String getDescricaoBreve() {
		return descricaoBreve;
	}

	public void setDescricaoBreve(String descricaoBreve) {
		this.descricaoBreve = descricaoBreve;
	}

	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}

	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
