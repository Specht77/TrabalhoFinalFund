package persistance;
import java.util.*;
import business.*;

public class CadastroUsuarioDAOMem implements CadastroUsuarioDAO {
	private ArrayList<Usuario> usuarios;

    public CadastroUsuarioDAOMem() {
        usuarios = new ArrayList<Usuario>();
    }

    @Override
    public boolean adicionar(Usuario u) {
        return usuarios.add(u);
    }
    
    @Override
    public Usuario getUsuarioPorCPFCNPJ(int c) throws CadastroDAOException{
        for(Usuario u : usuarios) {
            if(u.getCpfCnpj() == c);
                return u;
        }
        return null;
    }
}
