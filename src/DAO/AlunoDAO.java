
package DAO;

import Connection.GerenciaBanco;
import Model.Aluno;
import java.sql.*;


public class AlunoDAO {
    
    private Connection conexao = null;
    
    public AlunoDAO() {
        conexao = GerenciaBanco.getConnection();
    }
    
    public boolean inserir(Aluno aluno, int cadastro_id) {
        
        PreparedStatement stmt =  null;
        
        String sql = "INSERT INTO aluno (matricula, cadastro_id) VALUES (?, ?)";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, aluno.getMatricula());
            stmt.setInt(2, cadastro_id);
            
            stmt.executeUpdate();
            
            System.out.println(stmt.toString());
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            
            return false;
        } finally {
            System.out.println(stmt.toString());
            GerenciaBanco.closeConnection(conexao, stmt);
        }
    }
}
