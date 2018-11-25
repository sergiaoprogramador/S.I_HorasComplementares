package DAO;

import Connection.GerenciaBanco;
import Model.Cadastro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CadastroDAO {
    
    private Connection conexao = null;

    public CadastroDAO() {
        conexao = GerenciaBanco.getConnection();
    }
    
    public int create(Cadastro cadastro) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
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
                System.out.println("Tudo correu bem no metodo create da classe CadastroDAO! Retornando lastID....");
                System.out.println("===================================================================");
                
                return lastId;
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma excessão no metodo create da classe CadastroDAO! Retornando 0 ........");
            System.out.println("===================================================================");
            return 0;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
        
        return 0;
    }
    
    public List<Cadastro> read() {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        ResultSet resultSet = null;
        
        String sql = "SELECT * FROM cadastro";
        
        List<Cadastro> cadastros = new ArrayList<>();
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
                Cadastro cadastro = new Cadastro(
                                                    resultSet.getString("nome"),
                                                    resultSet.getString("cpf"),
                                                    resultSet.getString("email"),
                                                    resultSet.getString("senha"),
                                                    resultSet.getString("data_nascimento"),
                                                    resultSet.getString("campus"),
                                                    resultSet.getString("curso")
                );
                
                // cadastro.setNome(resultSet.getString("nome"));
                
                cadastros.add(cadastro);
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma excessão no metodo read da classe CadastroDAO! Retornando null ........");
            System.out.println("===================================================================");
            return null;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
        }
        System.out.println("Tudo correu bem no metodo read da classe CadastroDAO! Retornando Todos os cadastros....");
        System.out.println("===================================================================");
        return cadastros;
    }
    
    public int update(Cadastro cadastro) {
        
        PreparedStatement stmt =  null;
        
        String sql = "UPDATE cadastro SET nome = ?, cpf = ?, email = ?, senha = ?, data_nascimento = ?, campus = ?, curso = ? WHERE id_cadastro = ?";
        
        try {
            stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getCpf());
            stmt.setString(3, cadastro.getEmail());
            stmt.setString(4, cadastro.getSenha());
            stmt.setString(5, cadastro.getData_nascimento());
            stmt.setString(6, cadastro.getCampus());
            stmt.setString(7, cadastro.getCurso());
            stmt.setInt(8, cadastro.getIdCadastro());
            
            stmt.executeUpdate();
            
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
        }
        
        return 1;
    }
    
    public int delete(Cadastro cadastro) {
        
        PreparedStatement stmt =  null;
        
        String sql = "DELETE FROM cadastro WHERE id_cadastro = ?";
        
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
        }
        
    }
    
}
