package business;

import java.util.List;

import persistance.CadastroDAOException;

public interface CadastroLeilaoDAO {
	boolean adicionar(Leilao leilao) throws CadastroDAOException;

	List<Leilao> getLeiloes() throws CadastroDAOException;
}
