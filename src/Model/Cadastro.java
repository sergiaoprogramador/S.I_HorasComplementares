package Model;

public class Cadastro {
    
    private int idCadastro;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String data_nascimento;
    private String campus;
    private String curso;
    
    
    public Cadastro() {
        
    }
    
    public Cadastro(
                    String nome,
                    String cpf,
                    String email,
                    String senha,
                    String data_nascimento,
                    String campus,
                    String curso
    )
    {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
        this.campus = campus;
        this.curso = curso;
    }
    
    public Cadastro(int idCadastro,
                    String nome,
                    String cpf,
                    String email,
                    String senha,
                    String data_nascimento,
                    String campus,
                    String curso
    )
    {
        this.idCadastro = idCadastro;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
        this.campus = campus;
        this.curso = curso;
    }
    
    public int getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(int idCadastro) {
        this.idCadastro = idCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}