package business;

public class Lote {
	
	private int valorLimite; 
	/* Pode ser valor MINIMO ou MAXIMO conforme Leil�o DEMANDA ou OFERTA:
	 * " todo leil�o possui um pre�o (m�nimo ou m�ximo) associado ao lote."
	 * */
	
	
	Bem bem; 
	
	public Lote(int valorLimite, Bem bem){
		this.valorLimite = valorLimite;
		this.bem = bem;
	}
	
	public void setValorLimite(int valorLimite){
		this.valorLimite = valorLimite;
	}
	
	public int getValorLimite(){
		return valorLimite;
	}

}
