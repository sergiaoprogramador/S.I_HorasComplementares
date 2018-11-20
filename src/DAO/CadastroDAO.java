package DAO;

import Connection.GerenciaBanco;
import Model.Cadastro;
import java.sql.*;

public class CadastroDAO {
    
    private Connection conexao = null;

    public CadastroDAO() {
        conexao = GerenciaBanco.getConnection();
    }
    
    public int inserir(Cadastro cadastro) {
        
        PreparedStatement stmt =  null;
        
        String sql = "INSERT INTO cadastro (nome, cpf, email, senha, data_nascimento, campus, curso) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getCpf());
            stmt.setString(3, cadastro.getEmail());
            stmt.setString(4, cadastro.getSenha());
            stmt.setString(5, cadastro.getData_nascimento());
            stmt.setString(6, cadastro.getCampus());
            stmt.setString(7, cadastro.getCurso());
            
            stmt.executeUpdate();
            
            ResultSet resultSet = stmt.getGeneratedKeys();
            if(resultSet.next()) {
                int lastId = resultSet.getInt(1);
                
                return lastId;
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            
            return 0;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
        }
        
        return 0;
    }
}
