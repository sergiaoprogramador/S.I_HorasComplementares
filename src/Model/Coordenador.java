package Model;

// classe
public class Coordenador {
    
    // Atributos defido com encapsulamento
    private int idCoordenador;
    private String matricula;
    // Objeto cadastro é passado como referência. *Coordenador contém cadastro*
    private Cadastro cadastro;

    // Metodo construtor Vazio
    public Coordenador() {
        
    }
    
    // Sobrecarga do metodo construtor passando objeto Coordenador como parametro
    public Coordenador(Coordenador Coordenador) {
        this.idCoordenador = Coordenador.getIdCoordenador();
        this.matricula = Coordenador.getMatricula();
        this.cadastro = Coordenador.getCadastro();
    }
    
    // Sobrecarga do construtor passando dados e o objeto cadastro
    public Coordenador(String matricula, Cadastro cadastro) {
        this.matricula = matricula;
        this.cadastro = cadastro;
    }
    
    // Sobrecarga do construtor passando id 
    public Coordenador(int idCoordenador, String matricula, Cadastro cadastro) {
        this.idCoordenador = idCoordenador;
        this.matricula = matricula;
        this.cadastro = cadastro;
    }

    // Metodos getters e setters para acesso dos atributos
    public int getIdCoordenador() {
        return idCoordenador;
    }

    public void setIdCoordenador(int idCoordenador) {
        this.idCoordenador = idCoordenador;
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