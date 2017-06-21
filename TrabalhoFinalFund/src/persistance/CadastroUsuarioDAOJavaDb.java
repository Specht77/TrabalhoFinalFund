package persistance;
import java.sql.*;
import business.*;

public class CadastroUsuarioDAOJavaDb implements CadastroUsuarioDAO {
	
    private static CadastroUsuarioDAOJavaDb ref;
    
    public static CadastroUsuarioDAOJavaDb getInstance() throws CadastroDAOException {
        if (ref == null)
            ref = new CadastroUsuarioDAOJavaDb();
        return ref;
    }
    
    private CadastroUsuarioDAOJavaDb() throws CadastroDAOException {
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
            String sql = "CREATE TABLE usuarios ("
                    + "NOME VARCHAR(100) NOT NULL PRIMARY KEY,"
                    + "CPFCNPJ NUMBER(8) NOT NULL,"
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
	
	@Override
    public boolean adicionar(Usuario u) throws CadastroDAOException {
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO usuarios (NOME, TELEFONE, SEXO) VALUES (?,?,?)" 
                    );
            stmt.setString(1, u.getNome());
            stmt.setInt(2, u.getCpfCnpj());
            stmt.setString(3, u.getEmail());
            int ret = stmt.executeUpdate();
            con.close();
            return (ret>0);
        } catch (SQLException ex) {
            throw new CadastroDAOException("Falha ao adicionar.", ex);
        }
    }
	
	public Usuario getUsuarioPorCPFCNPJ(int c) throws CadastroDAOException {
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "SELECT * FROM usuarios WHERE CPFCNPJ=?"
                    );
            stmt.setInt(1, c);
            ResultSet resultado = stmt.executeQuery();
            Usuario u = null;
            if(resultado.next()) {
                String nome = resultado.getString("NOME");
                int cpfcnpj = resultado.getInt("CPFCNPJ");
                String email = resultado.getString("EMAIL");
                u = new Usuario(nome, cpfcnpj, email);
            }
            return u;
        } catch (SQLException ex) {
            throw new CadastroDAOException("Falha ao buscar.", ex);
        }
    }
}
