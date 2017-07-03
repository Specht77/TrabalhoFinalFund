package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


import business.CadastroBemDAO;
import business.Bem;

public class CadastroBemDAOJavaDb implements CadastroBemDAO {
	
private static CadastroBemDAOJavaDb ref;
    
    public static CadastroBemDAOJavaDb getInstance() throws CadastroDAOException {
        if (ref == null)
            ref = new CadastroBemDAOJavaDb();
        return ref;
    }
    
    private CadastroBemDAOJavaDb() throws CadastroDAOException {
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
            String sql = "CREATE TABLE bens ("
                    + "DESCRICAOB VARCHAR(100) NOT NULL PRIMARY KEY,"
                    + "DESCRICAOC VARCHAR(200) NOT NULL,"
                    + "CATEGORIA VARCHAR(100) NOT NULL"
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
    public boolean adicionar(Bem b) throws CadastroDAOException {
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO bens (DESCRICAOB, DESCRICAOC, CATEGORIA) VALUES (?,?,?)" 
                    );
            stmt.setString(1, b.getDescricaoBreve());
            stmt.setString(2, b.getDescricaoCompleta());
            stmt.setString(3, b.getCategoria());
            int ret = stmt.executeUpdate();
            con.close();
            return (ret>0);
        } catch (SQLException ex) {
            throw new CadastroDAOException("Falha ao adicionar.", ex);
        }
    }
	
	@Override
    public List<Bem> getBens() throws CadastroDAOException {
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM bens");
            List<Bem> lista = new ArrayList<Bem>();
            while(resultado.next()) {
                String descricaoBreve = resultado.getString("DESCRICAOB");
                String descricaoCompleta = resultado.getString("DESCRICAOC");
                String categoria = resultado.getString("CATEGORIA");
                Bem b = new Bem(descricaoBreve, descricaoCompleta, categoria);
                lista.add(b);
            }
            return lista;
        } catch (SQLException ex) {
            throw new CadastroDAOException("Falha ao buscar.", ex);
        }
    }
}
