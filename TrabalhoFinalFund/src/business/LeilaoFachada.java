package business;

import java.util.*;

import persistance.CadastroLeilaoDAOJavaDb;
import persistance.CadastroDAOException;

public class LeilaoFachada {
    private CadastroLeilaoDAO dao;
    
    public LeilaoFachada() throws CadastroDAOException {
        try {
            dao = CadastroLeilaoDAOJavaDb.getInstance();
        } catch (CadastroDAOException e) {
            throw new CadastroDAOException("Falha de criação da fachada!", e);
        }
    }
    
    public Leilao adicionarBem(boolean natureza, boolean formato, Date abertura, Date fechamento, int usuario) throws CadastroDAOException{
        
    	Leilao l = new Leilao(natureza, formato, abertura, fechamento, usuario);
        try {
            boolean ok = dao.adicionar(l);
            if(ok) {
                return l;
            }
            return null;
        } catch (CadastroDAOException e) {
            throw new CadastroDAOException("Falha ao adicionar leilao!", e);
        }
    }

    public List<Leilao> buscarLeiloes() throws CadastroDAOException{
        try{
            return dao.getLeiloes();
        } catch(CadastroDAOException e) {
            throw new CadastroDAOException("Falha ao buscar leiloes", e);
        }
    }
}