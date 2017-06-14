package business;

import java.util.Date;

public class Leilao {
	
	private boolean formato;
	private Date dataAbertura;
	
	public Leilao(boolean formato, Date dataAbertura){
		this.formato = formato;
		this.dataAbertura = dataAbertura;
	}

	
	public void setFormato(boolean formato){
		this.formato = formato; 
		//0 == fechado
		//1 == aberto
	}
	
	public boolean getFormato(){
		return formato;
	}
	
	
	
	
	
}
