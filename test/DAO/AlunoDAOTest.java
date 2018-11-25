package DAO;

import Model.Aluno;
import Model.Cadastro;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class AlunoDAOTest {
    
    public AlunoDAOTest() {
    }

    @Ignore
    @Test
    public void create() {
        Cadastro cadastro = new Cadastro();
        cadastro.setIdCadastro(1);
        
        Aluno aluno = new Aluno();
        
        aluno.setMatricula("555034");
        aluno.setCadastro(cadastro);
        
        AlunoDAO alunoDao = new AlunoDAO();
        int aluno_id = alunoDao.create(aluno, cadastro.getIdCadastro());
        if(aluno_id != 0) {
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            fail("Erro ao cadastrar aluno!");
        }
    }
    
    @Ignore
    @Test
    public void listar() {
        
        AlunoDAO alunoDao = new AlunoDAO();
        
        for(Aluno a: alunoDao.read()) {
            System.out.println("Id: " + a.getIdAluno());
            System.out.println("Nome: " + a.getCadastro().getNome());
            System.out.println("Matricula: " + a.getMatricula());
            System.out.println("Cpf: " + a.getCadastro().getCpf());
            System.out.println("Email: " + a.getCadastro().getEmail());
            System.out.println("Senha: " + a.getCadastro().getSenha());
            System.out.println("Data de Nascimento: " + a.getCadastro().getData_nascimento());
            System.out.println("Campus: " + a.getCadastro().getCampus());
            System.out.println("Curso: " + a.getCadastro().getCurso());
            System.out.println("======================================================================================================");
        }
        
    }
    
    
    @Test
    public void listarId() {
        
        AlunoDAO alunoDao = new AlunoDAO();
        
        Aluno aluno = alunoDao.read(4);
            
        System.out.println("Id: " + aluno.getIdAluno());
        System.out.println("Nome: " + aluno.getCadastro().getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Cpf: " + aluno.getCadastro().getCpf());
        System.out.println("Email: " + aluno.getCadastro().getEmail());
        System.out.println("Senha: " + aluno.getCadastro().getSenha());
        System.out.println("Data de Nascimento: " + aluno.getCadastro().getData_nascimento());
        System.out.println("Campus: " + aluno.getCadastro().getCampus());
        System.out.println("Curso: " + aluno.getCadastro().getCurso());
        System.out.println("======================================================================================================");
        
    }
}
