
package Connection;

import java.sql.*;


public class GerenciaBanco {
    
    private static final String DRIVER = "org.gjt.mm.mysql.Driver";
    private static final String SERVER = "localhost";
    private static final String MYDATABASE = "S.I_HorasComplementares";
    private static final String URL = "jdbc:mysql://" + SERVER +  "/" + MYDATABASE;
    private static final String USER = "root";
    private static final String PASSWORD = "admin123";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
        
    }
    
    public static void closeConnection(Connection conexao) {
        
        if(conexao != null) {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex); // Printa de vermelho   
            }
            
        }
        
    }
    
    public static void closeConnection(Connection conexao, PreparedStatement stmt) {
        
        if(stmt != null) {
            
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex); // Printa de vermelho  
            }
            
        }
        
        closeConnection(conexao);
        
    }
    
    public static void closeConnection(Connection conexao, PreparedStatement stmt, ResultSet rs) {
        
        if(rs != null) {
            
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex); // Printa de vermelho  
            }
            
        }
        
        closeConnection(conexao, stmt);
        
    }
}