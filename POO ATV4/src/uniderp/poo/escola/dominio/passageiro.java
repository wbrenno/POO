package uniderp.poo.escola.dominio;

public class passageiro {
    private String email;
    private String numeroCartao;
    private String Documento;
    private String dataNacimento;

    public String getEmail() {
        return email;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public String getDocumento() {
        return Documento;
    }
    public String getDataNacimento() {
        return dataNacimento;
    }
    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }
    public void setDocumento(String documento) {
        Documento = documento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public passageiro(String email, String numeroCartao, String documento, String dataNacimento) {
        this.email = email;
        this.numeroCartao = numeroCartao;
        this.Documento = documento;
        this.dataNacimento = dataNacimento;
    }

}
