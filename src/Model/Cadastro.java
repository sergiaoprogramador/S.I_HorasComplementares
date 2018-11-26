package Model;

// classe
public class Cadastro {
    
    // Atributos da classe definindo encapsulamento
    private int idCadastro;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String data_nascimento;
    private String campus;
    private String curso;
    
    // Metodo construtor vazio
    public Cadastro() {
        
    }
    
    // Sobrecarga do metodo construtor passando id
    public Cadastro(Cadastro cadastro)
    {
        this.idCadastro = cadastro.getIdCadastro();
        this.nome = cadastro.getNome();
        this.cpf = cadastro.getCpf();
        this.email = cadastro.getEmail();
        this.senha = cadastro.getSenha();
        this.data_nascimento = cadastro.getData_nascimento();
        this.campus = cadastro.getCampus();
        this.curso = cadastro.getCurso();
    }
    
    // Sobrecarga do metodo construtor sem passar id
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
    
    // Sobrecarga do metodo construtor passando id
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
    
    
    // Metodos getters e setters para acesso dos atributos
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