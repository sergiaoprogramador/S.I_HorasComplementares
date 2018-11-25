package DAO;

import Model.Cadastro;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CadastroDAOTest {
    
    public CadastroDAOTest() {
    }

    @Test // Executa o teste
    @Ignore //Ignora o Teste
    public void create() {
        Cadastro cadastro = new Cadastro("Sergio Ramos", "043.059.581-63", "sergio.ramos@unemat.br", "99611661", "22/03/1996", "Aquarela", "Sistemas de Informação");
        CadastroDAO dao = new CadastroDAO();
        
        
        
        if(dao.create(cadastro) != 0) {
            System.out.println("Cadastro inserido com sucesso!");
        } else {
            fail("Erro ao inserir cadastro!");
        }
    }
    
    @Test
    @Ignore //Ignora o Teste
    public void read() {
        CadastroDAO cadastroDao = new CadastroDAO();
        
        for(Cadastro c: cadastroDao.read()) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Cpf: " + c.getCpf());
            System.out.println("Email: " + c.getEmail());
            System.out.println("Senha: " + c.getSenha());
            System.out.println("Data de Nascimento: " + c.getData_nascimento());
            System.out.println("Campus: " + c.getCampus());
            System.out.println("Curso: " + c.getCurso());
            System.out.println("=======================================================================================================");
        }
    }
    
    @Test // Executa o teste
    @Ignore //Ignora o Teste
    public void update() {
        Cadastro cadastro = new Cadastro("Teste update", "Teste update", "Teste update", "Teste update", "Teste update", "Teste update", "Teste update");
        CadastroDAO dao = new CadastroDAO();
        
        cadastro.setIdCadastro(10);
        
        if(dao.update(cadastro) != 0) {
            System.out.println("Cadastro atualizado com sucesso!");
        } else {
            fail("Erro ao atualizar cadastro!");
        }
    }
    
    @Test // Executa o teste
    public void delete() {
        Cadastro cadastro = new Cadastro();
        cadastro.setIdCadastro(11);
        
        CadastroDAO cadastroDao = new CadastroDAO();
        
        if(cadastroDao.delete(cadastro) != 0) {
            System.out.println("Cadastro deletado com sucesso!");
        } else {
            fail("erro ao deletar");
        }
    }
}
