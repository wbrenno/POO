package uniderp.poo.escola.dominio;

public abstract class BaseDadosComuns extends BaseIdentificador{
    protected String nome;
    protected String registro;
    protected String usuario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getNome() {
        return nome;
    }
    public String getRegistro() {
        return registro;
    }
    public String getUsuario() {
        return usuario;
    }
    public BaseDadosComuns(int cod, String nome, String registro, String usuario) {
        super(cod);
        this.nome = nome;
        this.registro = registro;
        this.usuario = usuario;
    }
    
}