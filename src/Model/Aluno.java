package Model;

// classe
public class Aluno {
    
    // Atributos defido com encapsulamento
    private int idAluno;
    private String matricula;
    // Objeto cadastro é passado como referência. *Aluno contém cadastro*
    private Cadastro cadastro;

    // Metodo construtor Vazio
    public Aluno() {
        
    }
    
    // Sobrecarga do metodo construtor passando objeto aluno como parametro
    public Aluno(Aluno aluno) {
        this.idAluno = aluno.getIdAluno();
        this.matricula = aluno.getMatricula();
        this.cadastro = aluno.getCadastro();
    }
    
    // Sobrecarga do construtor passando dados e o objeto cadastro
    public Aluno(String matricula, Cadastro cadastro) {
        this.matricula = matricula;
        this.cadastro = cadastro;
    }
    
    // Sobrecarga do construtor passando id 
    public Aluno(int idAluno, String matricula, Cadastro cadastro) {
        this.idAluno = idAluno;
        this.matricula = matricula;
        this.cadastro = cadastro;
    }

    // Metodos getters e setters para acesso dos atributos
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