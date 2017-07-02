package business;

import persistance.CadastroDAOException;
import persistance.CadastroUsuarioDAOJavaDb;

public class UsuarioFachada {
    private CadastroUsuarioDAO dao;
    
    public UsuarioFachada() throws CadastroDAOException {
        try {
            dao = CadastroUsuarioDAOJavaDb.getInstance();
        } catch (CadastroDAOException e) {
            throw new CadastroDAOException("Falha de criação da fachada!", e);
        }
    }
    
    public Usuario adicionarUsuario(String nome, int cpfcnpj, String email) throws CadastroDAOException{
        
        Usuario u = new Usuario(nome, cpfcnpj, email);
        try {
            boolean ok = dao.adicionar(u);
            if(ok) {
                return u;
            }
            return null;
        } catch (CadastroDAOException e) {
            throw new CadastroDAOException("Falha ao adicionar usuario!", e);
        }
    }

    public Usuario buscarPessoaPorCpfcnpj(int cpfcnpj) throws CadastroDAOException{
        try{
            return dao.getUsuarioPorCPFCNPJ(cpfcnpj);
        } catch(CadastroDAOException e) {
            throw new CadastroDAOException("Falha ao buscar usuario", e);
        }
    }
}
