package Model;

public class Aluno {
    
    private int idAluno;
    private String matricula;
    private Cadastro cadastro;

    //Construtor Vazio
    public Aluno() {
        
    }

    public Aluno(Aluno aluno) {
        this.idAluno = aluno.getIdAluno();
        this.matricula = aluno.getMatricula();
        this.cadastro = aluno.getCadastro();
    }
    
    //Construtor passando dado e o objeto
    public Aluno(String matricula, Cadastro cadastro) {
        this.matricula = matricula;
        this.cadastro = cadastro;
    }
    
    //Construtor passando id 
    public Aluno(int idAluno, String matricula, Cadastro cadastro) {
        this.idAluno = idAluno;
        this.matricula = matricula;
        this.cadastro = cadastro;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    
}