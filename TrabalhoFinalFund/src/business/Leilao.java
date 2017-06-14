package business;

import java.util.Date;

public class Leilao {
	
	private boolean formato;
	private Date abertura;
	private Date fechamento;
	
	public Leilao(boolean formato, Date abertura, Date fechamento){
		this.formato = formato;
		this.abertura = abertura;
		this.fechamento = fechamento;
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
	
}
