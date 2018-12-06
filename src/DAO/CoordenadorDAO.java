package DAO;

// imports necessário para comunicação com banco de dados e model
import Connection.GerenciaBanco;
import Model.Coordenador;
import Model.Cadastro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// classe
public class CoordenadorDAO {
    
    // variavel que terá conexao com bd
    private Connection conexao = null;
    Cadastro cadastro;
    Coordenador Coordenador;
    
    // Construtor da classe. cria objeto atribuindo conexao com bd
    public CoordenadorDAO() {
        conexao = GerenciaBanco.getConnection();
    }
    
    
    public List<Coordenador> read() {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        ResultSet resultSet;
        
        String sql = "SELECT * FROM view_Coordenador_cadastro";
        
        List<Coordenador> Coordenadors = new ArrayList<>();
        
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
                
                Coordenador = new Coordenador(resultSet.getInt("id_Coordenador"), resultSet.getString("matricula"), cadastro);
                
                Coordenadors.add(Coordenador);
                
            }
            System.out.println("Tudo correu bem no metodo read da classe CoordenadorDAO! Retornando todos os Coordenadors....");
            System.out.println("===================================================================");
            return Coordenadors;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo create da classe CoordenadorDAO! Retornando null....");
            System.out.println("===================================================================");
            return null;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
        
    }
    
    public Coordenador read(int Coordenador_id) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        ResultSet resultSet;
        
        String sql = "SELECT * FROM view_Coordenador_cadastro WHERE id_Coordenador = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt( 1, Coordenador_id);
            
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
            
            this.Coordenador = new Coordenador(resultSet.getInt("id_Coordenador"), resultSet.getString("matricula"), cadastro);
            System.out.println("Tudo correu bem no metodo read da classe CoordenadorDAO! Retornando Coordenador referente ao id do parametro....");
            System.out.println("===================================================================");
            return Coordenador;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo read da classe CoordenadorDAO! Retornando null....");
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
        
        String sql = "SELECT * FROM view_Coordenador_cadastro WHERE cpf = ?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString( 1, cpf);
            
            resultSet = stmt.executeQuery();
            
            if (resultSet.next()){
                System.out.println("Tudo correu bem no metodo read da classe CoordenadorDAO! O Coordenador referente ao cpf existe no banco de dados....");
                System.out.println("===================================================================");
                return true;
            } else {
                System.out.println("Tudo correu bem no metodo read da classe CoordenadorDAO! O Coordenador referente ao cpf não existe no banco de dados....");
                return false;
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo read da classe CoordenadorDAO! Retornando false....");
            System.out.println("===================================================================");
            return false;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
    }
    
    public Coordenador read(String cpf, String senha) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        ResultSet resultSet;
        
        String sql = "SELECT * FROM view_Coordenador_cadastro WHERE cpf = ? AND senha = ?";
        
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
            
            this.Coordenador = new Coordenador(resultSet.getInt("id_Coordenador"), resultSet.getString("matricula"), cadastro);
            System.out.println("Tudo correu bem no metodo read da classe CoordenadorDAO! Retornando Coordenador referente aos dados de login...");
            System.out.println("===================================================================");
            return Coordenador;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            System.out.println("Ocorreu uma exceção no metodo read da classe CoordenadorDAO! Retornando null....");
            System.out.println("===================================================================");
            return null;
        } finally {
            GerenciaBanco.closeConnection(conexao, stmt);
            conexao = null;
        }
    }
    
    public int update(Coordenador Coordenador, Cadastro cadastro) {
        if(conexao == null) {
            conexao = GerenciaBanco.getConnection();
        }
        
        PreparedStatement stmt =  null;
        
        String sql = "UPDATE Coordenador SET matricula = ? WHERE id_Coordenador = ?";
        
        try {
            stmt = conexao.prepareStatement(sql/*, Statement.RETURN_GENERATED_KEYS*/);
            
            stmt.setString(1, Coordenador.getMatricula());
            stmt.setInt(2, Coordenador.getIdCoordenador());
            
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
    
}