package business;

import java.util.*;

import persistance.CadastroBemDAOJavaDb;
import persistance.CadastroDAOException;

public class BemFachada {
    private CadastroBemDAO dao;
    
    public BemFachada() throws CadastroDAOException {
        try {
            dao = CadastroBemDAOJavaDb.getInstance();
        } catch (CadastroDAOException e) {
            throw new CadastroDAOException("Falha de criação da fachada!", e);
        }
    }
    
    public Bem adicionarBem(String descricaoBreve, String descricaoCompleta, String categoria) throws CadastroDAOException{
        
    	Bem b = new Bem(descricaoBreve, descricaoCompleta, categoria);
        try {
            boolean ok = dao.adicionar(b);
            if(ok) {
                return b;
            }
            return null;
        } catch (CadastroDAOException e) {
            throw new CadastroDAOException("Falha ao adicionar bem!", e);
        }
    }

    public List<Bem> buscarBens() throws CadastroDAOException{
        try{
            return dao.getBens();
        } catch(CadastroDAOException e) {
            throw new CadastroDAOException("Falha ao buscar bem", e);
        }
    }
}