package business;

import java.util.List;

import persistance.CadastroDAOException;

public interface CadastroBemDAO {
	boolean adicionar(Bem bem) throws CadastroDAOException;

	List<Bem> getBens() throws CadastroDAOException;
}
