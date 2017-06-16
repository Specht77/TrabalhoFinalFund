package business;

import java.util.Date;

public class Leilao {
	
	private boolean natureza;
	private boolean formato;
	private Date abertura;
	private Date fechamento;
	Usuario usuario; //Essa instanciação do Usuário está correta?
	//TODO
	/* Gravar identificação do Usuário conforme enunciado:
	 * "Todo leilão deve possuir a identificação do usuário vendedor
(no caso de leilões de demanda) ou comprador (no caso de leilões de oferta)" */
	
	public Leilao(boolean natureza, boolean formato, Date abertura, Date fechamento, Usuario usuario){
		this.formato = formato;
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.natureza = natureza;
		this.usuario = usuario;
	}

	
	public void setFormato(boolean formato){
		this.formato = formato; 
		//0 == fechado
		//1 == aberto
	}
	
	public boolean getFormato(){
		return formato;
	}
	
	public void setAbertura(Date abertura){
		this.abertura = abertura;
	}
	
	
	public Date getAbertura(){
		return abertura;
	}

	
	public void setFechamento(Date fechamento){
		this.fechamento = fechamento;
	}
	
	public Date getFechamento(){
		return fechamento;
	}


	public void setNatureza(boolean natureza) {
		this.natureza = natureza;
		//0 == oferta
		//1 == demanda
	}
	
	
	public boolean getNatureza() {
		return natureza;
	}

	
}
