
package Model;

public class Aluno {
    
    private int idAluno;
    private String matricula;
    private Cadastro cadastro;

    public Aluno() {
        
    }

    public Aluno(String matricula, Cadastro cadastro) {
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