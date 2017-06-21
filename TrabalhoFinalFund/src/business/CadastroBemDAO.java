package business;

import persistance.CadastroDAOException;

public interface CadastroBemDAO {
	boolean adicionar(Bem bem) throws CadastroDAOException;
}
