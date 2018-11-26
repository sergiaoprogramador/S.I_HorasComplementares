package Connection;
// imports necessário para tratamento do sql
import java.sql.*;

// classe para gerenciamento de comunicação da aplicação com o banco de dados
public class GerenciaBanco {
    
    // Variaveis de configuração
    private static final String DRIVER = "org.gjt.mm.mysql.Driver";
    private static final String SERVER = "localhost";
    private static final String MYDATABASE = "S.I_HorasComplementares";
    private static final String URL = "jdbc:mysql://" + SERVER +  "/" + MYDATABASE;
    private static final String USER = "root";
    private static final String PASSWORD = "admin123";
    
    // Metodo para conexão com banco de dados
    public static Connection getConnection(){
        
        try {
            // Define o driver JDBC
            Class.forName(DRIVER);
            
            // Retorna objeto conexão do banco de dados se não ouver exceção
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            // tratamento da exceção
            throw new RuntimeException("Erro na conexão", ex);
        }
        
    }
    
    // Metodo para fechar a conexão com banco de dados. Apenas objeto conexão é passado como parâmetro
    public static void closeConnection(Connection conexao) {
        
        // Verifica se há conexão
        if(conexao != null) {
            
            try {
                // Fecha a conexão com banco usando metodo close do objeto conexao
                conexao.close();
            } catch (SQLException ex) {
                // Tratamento de exceção
                System.err.println("Erro: " + ex); // Printa de vermelho   
            }
            
        }
        
    }
    
    // Metodo para fechar a conexão com banco de dados. Objeto conexão e objeto stmt é passado como parâmetro
    public static void closeConnection(Connection conexao, PreparedStatement stmt) {
        
        // Verifica se há objeto stmt
        if(stmt != null) {
            
            try {
                
                // Fecha stmt usando metodo do objeto
                stmt.close();
            } catch (SQLException ex) {
                // Tratamento de exceção
                System.err.println("Erro: " + ex); // Printa de vermelho  
            }
            
        }
        
        // reutiliza função para fechar a conexão com banco de dados
        closeConnection(conexao);
        
    }
    
    // Metodo para fechar a conexão com banco de dados. Objeto conexão, objeto stmt e objeto resultSet é passado como parâmetro
    public static void closeConnection(Connection conexao, PreparedStatement stmt, ResultSet resultSet) {
        
        // Verifica se há objeto resultSet
        if(resultSet != null) {
            
            try {
                // Fecha resultSet usando metodo do objeto
                resultSet.close();
            } catch (SQLException ex) {
                // Tratamento de exceção
                System.err.println("Erro: " + ex); // Printa de vermelho  
            }
            
        }
        
        // reutiliza função para fechar a conexão com banco de dados e fechar objeto stmt
        closeConnection(conexao, stmt);
        
    }
}