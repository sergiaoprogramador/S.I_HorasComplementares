package DAO;

// imports necessário para comunicação com banco de dados e model
import Connection.GerenciaBanco;
import Model.Aluno;
import Model.Cadastro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// classe
public class AlunoDAO {
    
    // variavel que terá conexao com bd
    private Connection conexao = null;
    Cadastro cadastro;
    Aluno aluno;
    
    // Construtor da classe. cria objeto atribuindo conexao com bd
    public AlunoDAO() {
        conexao = GerenciaBanco.getConnection();
    }
    
    // Metodo para criar cadastro de aluno no banco de dados
    public int create(Aluno aluno) {
        //verifica se tem conexão
        if(conexao == null) {
            // atribui conexao
            conexao = GerenciaBanco.getConnection();
        }
        
        // objeto statement
        PreparedStatement stmt =  null;
        // objeto resultSet
        ResultSet resultSet = null;
        
        // Comando sql
        String sql = "INSERT INTO aluno (matricula, cadastro_id) VALUES (?, ?)";
        
        try {
            // prepara sql. Define o retorno do id cadastrado
            stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            // seta valores correspondente aos dados das colunas da tabela aluno
            stmt.setString(1, aluno.getMatricula());
            stmt.setInt(2, aluno.getCadastro().getIdCadastro());
            
            // executa o sql
            stmt.executeUpdate();
            
            // resultado da operação. Pega o id
            resultSet = stmt.getGeneratedKeys();
            if(resultSet.next()) {
                int lastId = resultSet.getInt(1);
                System.out.println("Tudo correu bem no metodo create da classe AlunoDAO! Retornando lastId....");
                System.out.println("===================================================================");
                
                // retorna id do aluno
                return lastId;
            }
            
            // se retornar 0, faço verificação na controller
            return 0;
        } catch (SQLException ex) {
            // Tratamento de exceção
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo create da classe AlunoDAO! Retornando 1....");
            System.out.println("===================================================================");
            // se retornar 0, faço verificação na controller
            return 0;
        } finally {
            // o finally sempre executará após o try
            // Fecha objetos conexão, stmt e resutlSet
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
                cadastro = new Cadastro(   resultSet.getInt("id_cadastro"),
                                                    resultSet.getString("nome"), 
                                                    resultSet.getString("cpf"),
                                                    resultSet.getString("email"),
                                                    resultSet.getString("senha"),
                                                    resultSet.getString("data_nascimento"),
                                                    resultSet.getString("campus"),
                                                    resultSet.getString("curso")
                );
                
                aluno = new Aluno(resultSet.getInt("id_aluno"), resultSet.getString("matricula"), cadastro);
                
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
            this.cadastro = new Cadastro(   resultSet.getInt("id_cadastro"), 
                                                resultSet.getString("nome"), 
                                                resultSet.getString("cpf"),
                                                resultSet.getString("email"),
                                                resultSet.getString("senha"),
                                                resultSet.getString("data_nascimento"),
                                                resultSet.getString("campus"),
                                                resultSet.getString("curso")
            );
            
            this.aluno = new Aluno(resultSet.getInt("id_aluno"), resultSet.getString("matricula"), cadastro);
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
    
    public boolean read(String cpf) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        ResultSet resultSet;
        
        String sql = "SELECT * FROM view_aluno_cadastro WHERE cpf = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString( 1, cpf);
            
            resultSet = stmt.executeQuery();
            
            if (resultSet.next()){
                System.out.println("Tudo correu bem no metodo read da classe AlunoDAO! O aluno referente ao cpf existe no banco de dados....");
                System.out.println("===================================================================");
                return true;
            } else {
                System.out.println("Tudo correu bem no metodo read da classe AlunoDAO! O aluno referente ao cpf não existe no banco de dados....");
                return false;
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo read da classe AlunoDAO! Retornando false....");
            System.out.println("===================================================================");
            return false;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
    }
    
    public Aluno read(String cpf, String senha) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        ResultSet resultSet;
        
        String sql = "SELECT * FROM view_aluno_cadastro WHERE cpf = ? AND senha = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString( 1, cpf);
            stmt.setString( 2, senha);
            
            resultSet = stmt.executeQuery();
            
            resultSet.next();
            this.cadastro = new Cadastro(   resultSet.getInt("id_cadastro"), 
                                                resultSet.getString("nome"), 
                                                resultSet.getString("cpf"),
                                                resultSet.getString("email"),
                                                resultSet.getString("senha"),
                                                resultSet.getString("data_nascimento"),
                                                resultSet.getString("campus"),
                                                resultSet.getString("curso")
            );
            
            this.aluno = new Aluno(resultSet.getInt("id_aluno"), resultSet.getString("matricula"), cadastro);
            System.out.println("Tudo correu bem no metodo read da classe AlunoDAO! Retornando aluno referente aos dados de login...");
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