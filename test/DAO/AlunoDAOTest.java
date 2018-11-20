package DAO;

import Model.Aluno;
import Model.Cadastro;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlunoDAOTest {
    
    public AlunoDAOTest() {
    }

    @Test
    public void inserir() {
        Cadastro cadastro = new Cadastro();
        cadastro.setIdCadastro(1);
        
        Aluno aluno = new Aluno();
        
        aluno.setMatricula("555034");
        aluno.setCadastro(cadastro);
        
        AlunoDAO dao = new AlunoDAO();
        
        if(dao.inserir(aluno, 1)) {
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            fail("Erro ao cadastrar aluno!");
        }
    }
    
}
