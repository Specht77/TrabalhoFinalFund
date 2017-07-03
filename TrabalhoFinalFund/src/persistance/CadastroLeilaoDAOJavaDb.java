package persistance;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Bem;
import business.CadastroLeilaoDAO;
import business.Leilao;

public class CadastroLeilaoDAOJavaDb implements CadastroLeilaoDAO {
private static CadastroLeilaoDAOJavaDb ref;
    
    public static CadastroLeilaoDAOJavaDb getInstance() throws CadastroDAOException {
        if (ref == null)
            ref = new CadastroLeilaoDAOJavaDb();
        return ref;
    }
    
    private CadastroLeilaoDAOJavaDb() throws CadastroDAOException {
        try {
             Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException ex) {
            throw new CadastroDAOException("JdbcOdbDriver not found!!");
        }
      
    }
	
	private static void createDB() throws CadastroDAOException {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby:derbyDB;create=true");
            Statement sta = con.createStatement();
            String sql = "CREATE TABLE leiloes ("
                    + "NATUREZA BOOLEAN NOT NULL,"
                    + "CPFCNPJ INTEGER(8) NOT NULL PRIMARY KEY,"
                    + "FORMATO BOOLEAN NOT NULL,"
                    + "ABERTURA DATE NOT NULL,"
                    + "FECHAMENTO DATE NOT NULL"
                    + ")";
            sta.executeUpdate(sql);
            sta.close();
            con.close();
        } catch (SQLException ex) {
            throw new CadastroDAOException(ex.getMessage());
        }
    }
	
	private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:derby:derbyDB");
    }
	
	@Override
    public boolean adicionar(Leilao l) throws CadastroDAOException {
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO usuarios (NATUREZA, CPFCNPJ, FORMATO, ABERTURA, FECHAMENTO) VALUES (?,?,?,?,?)" 
                    );
            stmt.setBoolean(1, l.getNatureza());
            stmt.setInt(2, l.getUsuario());
            stmt.setBoolean(3, l.getFormato());
            stmt.setDate(4, (Date) l.getAbertura());
            stmt.setDate(5, (Date) l.getFechamento());
            int ret = stmt.executeUpdate();
            con.close();
            return (ret>0);
        } catch (SQLException ex) {
            throw new CadastroDAOException("Falha ao adicionar.", ex);
        }
    }
	
	public List<Leilao> getLeiloes() throws CadastroDAOException {
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM leiloes");
            List<Leilao> lista = new ArrayList<Leilao>();
            while(resultado.next()) {
                boolean nat = resultado.getBoolean("NATUREZA");
                int cpfcnpj = resultado.getInt("CPFCNPJ");
                Boolean formato = resultado.getBoolean("FORMATO");
                Date abertura = resultado.getDate("ABERTURA");
                Date fechamento = resultado.getDate("FECHAMENTO");
                Leilao l = new Leilao(nat, formato, abertura, fechamento, cpfcnpj);
                lista.add(l);
            }
            return lista;
        } catch (SQLException ex) {
            throw new CadastroDAOException("Falha ao buscar.", ex);
        }
    }
}
