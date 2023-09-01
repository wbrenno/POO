package uniderp.poo.escola.dominio;

public class funcionario extends BaseDadosComuns{
    private String telefone;
    private String contaCorrent; 
    private String cracha;
    private String senha;
    
    public String getContaCorrent() {
        return contaCorrent;
    }
    public String getCracha() {
        return cracha;
    }
    public String getSenha() {
        return senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setContaCorrent(String contaCorrent) {
        this.contaCorrent = contaCorrent;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public funcionario(int cod, String nome, String registro, String usuario, String telefone, String contaCorrent,
            String cracha, String senha) {
        super(cod, nome, registro, usuario);
        this.telefone = telefone;
        this.contaCorrent = contaCorrent;
        this.cracha = cracha;
        this.senha = senha;
    }

}
