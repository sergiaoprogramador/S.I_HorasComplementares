
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GerenciaBanco {
    
    private static final String driver = "con.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/S.I_HorasComplementares";
    private static final String user = "root";
    private static final String password = "admin123";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(driver);
            
            return DriverManager.getConnection(url, user, password);
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