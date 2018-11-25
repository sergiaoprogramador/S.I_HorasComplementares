
package DAO;

import Connection.GerenciaBanco;
import Model.Aluno;
import Model.Cadastro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {
    
    private Connection conexao = null;
    
    public AlunoDAO() {
        conexao = GerenciaBanco.getConnection();
    }
    
    public int create(Aluno aluno) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        
        String sql = "INSERT INTO aluno (matricula, cadastro_id) VALUES (?, ?)";
        
        try {
            stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, aluno.getMatricula());
            stmt.setInt(2, aluno.getCadastro().getIdCadastro());
            
            stmt.executeUpdate();
            
            ResultSet resultSet = stmt.getGeneratedKeys();
            if(resultSet.next()) {
                int lastId = resultSet.getInt(1);
                System.out.println("Tudo correu bem no metodo create da classe AlunoDAO! Retornando lastId....");
                System.out.println("===================================================================");
                return lastId;
            }
            
            return 0;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo create da classe AlunoDAO! Retornando 1....");
            System.out.println("===================================================================");
            return 0;
        } finally {
            // Mostra o sql System.out.println(stmt.toString());
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
    }
    
    public int create(Aluno aluno, int cadastro_id) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        
        String sql = "INSERT INTO aluno (matricula, cadastro_id) VALUES (?, ?)";
        
        try {
            stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, aluno.getMatricula());
            stmt.setInt(2, cadastro_id);
            
            stmt.executeUpdate();
            
            ResultSet resultSet = stmt.getGeneratedKeys();
            if(resultSet.next()) {
                int lastId = resultSet.getInt(1);
                System.out.println("Tudo correu bem no metodo create da classe AlunoDAO! Retornando lastId....");
                System.out.println("===================================================================");
                return lastId;
            }
            
            return 0;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo create da classe AlunoDAO! Retornando 1....");
            System.out.println("===================================================================");
            return 0;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
    }
    
    public List<Aluno> read() {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        ResultSet resultSet;
        
        String sql = "SELECT * FROM view_aluno_cadastro";
        
        List<Aluno> alunos = new ArrayList<>();
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
                Cadastro cadastro = new Cadastro(   resultSet.getInt("id_cadastro"),
                                                    resultSet.getString("nome"), 
                                                    resultSet.getString("cpf"),
                                                    resultSet.getString("email"),
                                                    resultSet.getString("senha"),
                                                    resultSet.getString("data_nascimento"),
                                                    resultSet.getString("campus"),
                                                    resultSet.getString("curso")
                );
                
                Aluno aluno = new Aluno(resultSet.getInt("id_aluno"), resultSet.getString("matricula"), cadastro);
                
                alunos.add(aluno);
                
            }
            System.out.println("Tudo correu bem no metodo read da classe AlunoDAO! Retornando todos os alunos....");
            System.out.println("===================================================================");
            return alunos;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo create da classe AlunoDAO! Retornando null....");
            System.out.println("===================================================================");
            return null;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
        
    }
    
    public Aluno read(int aluno_id) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        ResultSet resultSet;
        
        String sql = "SELECT * FROM view_aluno_cadastro WHERE id_aluno = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt( 1, aluno_id);
            
            resultSet = stmt.executeQuery();
            
            resultSet.next();
            Cadastro cadastro = new Cadastro(   resultSet.getInt("id_cadastro"), 
                                                resultSet.getString("nome"), 
                                                resultSet.getString("cpf"),
                                                resultSet.getString("email"),
                                                resultSet.getString("senha"),
                                                resultSet.getString("data_nascimento"),
                                                resultSet.getString("campus"),
                                                resultSet.getString("curso")
            );
            
            Aluno aluno = new Aluno(resultSet.getInt("id_aluno"), resultSet.getString("matricula"), cadastro);
            System.out.println("Tudo correu bem no metodo read da classe AlunoDAO! Retornando aluno referente ao id do parametro....");
            System.out.println("===================================================================");
            return aluno;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo read da classe AlunoDAO! Retornando null....");
            System.out.println("===================================================================");
            return null;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
    }
    
    public int update(Aluno aluno, Cadastro cadastro) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        
        String sql = "UPDATE aluno SET matricula = ? WHERE id_aluno = ?";
        
        try {
            stmt = conexao.prepareStatement(sql/*, Statement.RETURN_GENERATED_KEYS*/);
            
            stmt.setString(1, aluno.getMatricula());
            stmt.setInt(2, aluno.getIdAluno());
            
            stmt.executeUpdate();
            
            CadastroDAO cadastroDao = new CadastroDAO();
            
            cadastroDao.update(cadastro);
//            ResultSet resultSet = stmt.getGeneratedKeys();
//            if(resultSet.next()) {
//                int lastId = resultSet.getInt(1);
//                
//                return lastId;
//            }
            
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            
            return 0;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
        
        return 1;
    }
    
    public int delete(Cadastro cadastro) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        
        String sql = "DELETE FROM cadastro WHERE id = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, cadastro.getIdCadastro());
            
            stmt.executeUpdate();
            
//            ResultSet resultSet = stmt.getGeneratedKeys();
//            if(resultSet.next()) {
//                int lastId = resultSet.getInt(1);
//                
//                return lastId;
//            }
            return 1;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            
            return 0;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
        
    }
    
}