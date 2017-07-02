package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import business.CadastroLeilaoDAO;
import business.Leilao;

public class CadastroLeilaoDAOJavaDb /*implements CadastroLeilaoDAO*/ {
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
        
        try {
            createDB();
        } catch (Exception ex) {
            System.out.println("Problemas para criar o banco: "+ex.getMessage());
            System.exit(0);
        }
    }
	
	private static void createDB() throws CadastroDAOException {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby:derbyDB;create=true");
            Statement sta = con.createStatement();
            String sql = "CREATE TABLE leiloes ("
                    + "NATUREZA BOOLEAN NOT NULL PRIMARY KEY,"
                    + "CPFCNPJ INTEGER(8) NOT NULL,"
                    + "EMAIL VARCHAR(100) NOT NULL"
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
	
//	@Override
//    public boolean adicionar(Leilao l) throws CadastroDAOException {
//        try {
//            Connection con = getConnection();
//            PreparedStatement stmt = con.prepareStatement(
//                    "INSERT INTO usuarios (NOME, TELEFONE, SEXO) VALUES (?,?,?)" 
//                    );
//            stmt.setString(1, l.getNome());
//            stmt.setInt(2, l.getCpfCnpj());
//            stmt.setString(3, l.getEmail());
//            int ret = stmt.executeUpdate();
//            con.close();
//            return (ret>0);
//        } catch (SQLException ex) {
//            throw new CadastroDAOException("Falha ao adicionar.", ex);
//        }
//    }
}
