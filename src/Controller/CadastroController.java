package Controller;

import Connection.GerenciaBanco;
import DAO.AlunoDAO;
import DAO.CadastroDAO;
import Model.Aluno;
import Model.Cadastro;
import java.sql.*;

public class CadastroController {
    private Connection conexao = null;
    
    public CadastroController() {
        conexao = GerenciaBanco.getConnection();
    }
    
    public String cadastrarAluno(
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
        String sucesso = "";
        String erro = "";
        
        Cadastro cadastro = new Cadastro(nome, cpf, email, senha, data_nascimento,campus, curso);
        
        CadastroDAO cadastroDao = new CadastroDAO();
        
        int cadastro_id = cadastroDao.inserir(cadastro);
        if(cadastro_id != 0) {
            sucesso = "Cadastro inserido com sucesso!";
        } else {
            erro = "Erro ao inserir cadastro!";
            
            return erro;
        }
        
        Aluno aluno = new Aluno(matricula, cadastro);
        
        AlunoDAO alunoDao = new AlunoDAO();
        
        if(alunoDao.inserir(aluno, cadastro_id)) {
            sucesso = "Aluno cadastrado com sucesso!";
        } else {
            erro = "Erro ao cadastrar aluno!";
            
            return erro;
        }
        
        return sucesso;
    }
}