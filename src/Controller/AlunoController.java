package Controller;

import DAO.AlunoDAO;
import DAO.CadastroDAO;
import Model.Aluno;
import Model.Cadastro;

public class AlunoController {
    //private Connection conexao = null;
    private AlunoDAO alunoDao;
    private CadastroDAO cadastroDao;
    
    public AlunoController() {
        //conexao = GerenciaBanco.getConnection();
        this.alunoDao = new AlunoDAO();
        this.cadastroDao = new CadastroDAO();
    }
    
    public Aluno cadastrarAluno(
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
        
        Cadastro cadastro = new Cadastro(nome, cpf, email, senha, data_nascimento,campus, curso);
        System.out.println("Criou objeto cadastro! Aqui é a classe AlunoController!");
        System.out.println("===================================================================");
        
        int cadastro_id = cadastroDao.create(cadastro);
        
        if(cadastro_id != 0) {
            System.out.println("Cadastro inserido com sucesso");
            System.out.println("===================================================================");
        } else {
            System.out.println("Erro ao inserir cadastro");
            System.out.println("===================================================================");
            return null;
        }
        
        Aluno aluno = new Aluno(matricula, cadastro);
        System.out.println("Criou objeto aluno! Aqui é a classe AlunoController");
        System.out.println("===================================================================");
        
        int aluno_id = alunoDao.create(aluno, cadastro_id);
        
        if(aluno_id != 0) {
            System.out.println("Aluno cadastrado com sucesso!");
            System.out.println("===================================================================");
        } else {
            System.out.println("Erro ao cadastrar aluno");
            System.out.println("===================================================================");
            return null;
        }
        
        aluno = alunoDao.read(aluno_id);
        System.out.println("objeto aluno recebe retorno da função alunoDao.read(id)! Aqui é a classe AlunoController! Retornando objeto da classe Aluno");
        System.out.println("===================================================================");
        return aluno;
    }
    
    public boolean verificaCadastro(String cpf){
        
        if(alunoDao.read(cpf)){
        
        return true;
        }
        
        return false;
    }
    
    public Aluno loginAluno(String cpf, String senha) {
        Aluno aluno = alunoDao.read(cpf, senha);
        
        if(aluno != null){
            return aluno;
        }
        return null;
    }
}
