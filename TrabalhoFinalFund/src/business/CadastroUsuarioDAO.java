package business;

import persistance.CadastroDAOException;

public interface CadastroUsuarioDAO {
	boolean adicionar(Usuario u) throws CadastroDAOException;
	Usuario getUsuarioPorCPFCNPJ(int c) throws CadastroDAOException;
}
