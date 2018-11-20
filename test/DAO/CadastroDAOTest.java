package DAO;

import Model.Cadastro;
import org.junit.Test;
import static org.junit.Assert.*;

public class CadastroDAOTest {
    
    public CadastroDAOTest() {
    }

    @Test
    public void inserir() {
        Cadastro cadastro = new Cadastro("Sergio Ramos", "043.059.581-63", "sergio.ramos@unemat.br", "99611661", "22/03/1996", "Aquarela", "Sistemas de Informação");
        CadastroDAO dao = new CadastroDAO();
        
        
        
        if(dao.inserir(cadastro) != 0) {
            System.out.println("Cadastro inserido com sucesso!");
        } else {
            fail("Erro ao inserir cadastro!");
        }
    }
    
}
