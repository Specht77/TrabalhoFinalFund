package business;

public class Lote {
	
	private int valorLimite; 
	/* Pode ser valor MINIMO ou MAXIMO conforme Leilão DEMANDA ou OFERTA:
	 * " todo leilão possui um preço (mínimo ou máximo) associado ao lote."
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
