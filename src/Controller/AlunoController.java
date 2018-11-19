package Controller;

import Model.Aluno;
import Connection.GerenciaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoController {
    
    LinkedList <Aluno> dados;
    
    private Connection conexao = null;
    
    public AlunoController () {
        dados = new LinkedList <Aluno>();
        conexao = GerenciaBanco.getConnection();
    }
    
    
    public boolean cadastrarAluno(
                            String nome,
                            String cpf, 
                            String matricula, 
                            String email, 
                            String senha, 
                            String data_nascimento, 
                            String campus, 
                            String curso
    )
    {
        
        //dados.add(new Aluno(nome, cpf, matricula, email, senha, data_nascimento, campus, curso));
        Aluno aluno = new Aluno(nome, cpf, matricula, email, senha, data_nascimento, campus, curso);
        
        String sqlCadastro = "INSERT INTO cadastro (nome, cpf, email, senha, data_nascimento, campus, curso) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = conexao.prepareStatement(sqlCadastro);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getSenha());
            stmt.setString(5, aluno.getData_nascimento());
            stmt.setString(6, aluno.getCampus());
            stmt.setString(7, aluno.getCurso());
            
            stmt.executeUpdate();
            
            aluno(matricula);

            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            return false;
        }finally{
            GerenciaBanco.closeConnection(conexao, stmt);
        }
    }
    
    public boolean aluno(String matricula) {
        
        String sqlAluno = "INSERT INTO aluno (matricula, cadastro_id) VALUES (?, ?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = conexao.prepareStatement(sqlAluno);
            
            stmt.setString(1, matricula);
            
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            
            return false;
        }
    }
}
