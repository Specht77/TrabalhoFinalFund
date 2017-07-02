package business;

import persistance.CadastroDAOException;

public interface CadastroLeilaoDAO {
	boolean adicionar(Leilao leilao) throws CadastroDAOException;
}
