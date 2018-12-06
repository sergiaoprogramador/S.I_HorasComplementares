package DAO;

// imports necessário para comunicação com banco de dados e model
import Connection.GerenciaBanco;
import Model.Cadastro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CertificadoDAO {

    // variavel que terá conexao com bd
    private Connection conexao = null;

    //Construtor da classe. cria objeto atribuindo conexao com bd
    public CertificadoDAO() {
        conexao = GerenciaBanco.getConnection();
    }
    
    // Metodo para criar cadastro no banco de dados
    public int create(Cadastro cadastro) {
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
        String sql = "INSERT INTO cadastro (nome, cpf, email, senha, data_nascimento, campus, curso) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            // prepara sql. Define o retorno do id cadastrado
            stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            // seta valores correspondente aos dados das colunas da tabela cadastro
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getCpf());
            stmt.setString(3, cadastro.getEmail());
            stmt.setString(4, cadastro.getSenha());
            stmt.setString(5, cadastro.getData_nascimento());
            stmt.setString(6, cadastro.getCampus());
            stmt.setString(7, cadastro.getCurso());
            
            // executa o sql
            stmt.executeUpdate();
            
            // resultado da operação. Pega o id
            resultSet = stmt.getGeneratedKeys();
            if(resultSet.next()) {
                int lastId = resultSet.getInt(1);
                System.out.println("Tudo correu bem no metodo create da classe CadastroDAO! Retornando lastID....");
                System.out.println("===================================================================");
                
                // retorna id do cadastro
                return lastId;
            }
            
            // se retornar 0, faço verificação na controller
            return 0;
        } catch (SQLException ex) {
            // Tratamento de exceção
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma excessão no metodo create da classe CadastroDAO! Retornando 0 ........");
            System.out.println("===================================================================");
            // se retornar 0, faço verificação na controller
            return 0;
        } finally {
            // o finally sempre executará após o try
            // Fecha objetos conexão, stmt e resutlSet
            GerenciaBanco.closeConnection(conexao, stmt, resultSet);
            conexao = null;
        }
    }
    
    // Metodo read para listar todos os cadastros da tabela cadastro
    public List<Cadastro> read() {
        //verifica se tem conexão
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        // objeto statement
        PreparedStatement stmt =  null;
        // objeto resultSet
        ResultSet resultSet = null;
        
        // Comando sql
        String sql = "SELECT * FROM cadastro";
        
        // cria objeto ArrayList para definir a lista de cadastros
        List<Cadastro> cadastros = new ArrayList<>();
        
        try {
            // prepara sql
            stmt = conexao.prepareStatement(sql);
            
            // executa sql e retorna todos os dados para resultSet
            resultSet = stmt.executeQuery();
            
            // percorre todos os dados para serem adicionados a lista de objetos cadastro
            while(resultSet.next()){
                // cria objeto cadastro passando todos seus dados para o construtor
                Cadastro cadastro = new Cadastro(   resultSet.getInt("id_cadastro"),
                                                    resultSet.getString("nome"),
                                                    resultSet.getString("cpf"),
                                                    resultSet.getString("email"),
                                                    resultSet.getString("senha"),
                                                    resultSet.getString("data_nascimento"),
                                                    resultSet.getString("campus"),
                                                    resultSet.getString("curso")
                );
                
                // cadastro.setNome(resultSet.getString("nome"));
                
                // adiciona objeto para a lista de cadastros
                cadastros.add(cadastro);
            }
            
            System.out.println("Tudo correu bem no metodo read da classe CadastroDAO! Retornando Todos os cadastros....");
            System.out.println("===================================================================");
            // retorno lista de cadastros
            return cadastros;
        } catch (SQLException ex) {
            // tratamento de exceção
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma excessão no metodo read da classe CadastroDAO! Retornando null ........");
            System.out.println("===================================================================");
            
            // se retornar null, faço verificação na controller
            return null;
        } finally {
            // o finally sempre executará após o try
            // Fecha objetos conexão, stmt e resutlSet
            GerenciaBanco.closeConnection(conexao, stmt, resultSet);
            conexao = null;
        }
    }
    
    // Metodo update para alterar dados da tabela cadastro. passo o objeto com os dados para serem alterados
    public int update(Cadastro cadastro) {
        //verifica se tem conexão
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        // objeto statement
        PreparedStatement stmt =  null;
        // objeto resultSet
        ResultSet resultSet = null;
        
        // comando sql
        String sql = "UPDATE cadastro SET nome = ?, cpf = ?, email = ?, senha = ?, data_nascimento = ?, campus = ?, curso = ? WHERE id_cadastro = ?";
        
        try {
            // prepara sql. Define o retorno do id cadastrado
            stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            // seta valores correspondente aos dados das colunas da tabela cadastro
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getCpf());
            stmt.setString(3, cadastro.getEmail());
            stmt.setString(4, cadastro.getSenha());
            stmt.setString(5, cadastro.getData_nascimento());
            stmt.setString(6, cadastro.getCampus());
            stmt.setString(7, cadastro.getCurso());
            stmt.setInt(8, cadastro.getIdCadastro());
            
            // executa o sql
            stmt.executeUpdate();
            
            // resultado da operação. Pega o id
            resultSet = stmt.getGeneratedKeys();
            if(resultSet.next()) {
                int lastId = resultSet.getInt(1);
                // retorna id do cadastro
                return lastId;
            }
            
            // se retornar 0, faço verificação na controller
            return 0;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            
            // se retornar 0, faço verificação na controller
            return 0;
        } finally {
            // o finally sempre executará após o try
            // Fecha objetos conexão, stmt e resutlSet
            GerenciaBanco.closeConnection(conexao, stmt, resultSet);
            conexao = null;
        }
    }
    
    // Metodo delete para deletar dados da tabela cadastro. passo o objeto com os dados para serem deletados
    public int delete(int id_cadastro) {
        // objeto statement
        PreparedStatement stmt =  null;
        
        // comando sql
        String sql = "DELETE FROM cadastro WHERE id_cadastro = ?";
        
        try {
            // prepara sql
            stmt = conexao.prepareStatement(sql);
            
            // seta valor correspondente da coluna id_cadastro da tabela cadastro
            stmt.setInt(1, id_cadastro);
            
            // executa o sql
            stmt.executeUpdate();
            
            // se retornar 1, foi deletado com sucesso
            return 1;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            
            // se retornar 0, faço verificação na controller
            return 0;
        } finally {
            // o finally sempre executará após o try
            // Fecha objetos conexão e stmt
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
        
    }
    
}