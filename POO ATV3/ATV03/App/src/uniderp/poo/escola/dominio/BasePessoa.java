package uniderp.poo.escola.dominio;


import java.time.LocalDate;

public abstract class BasePessoa{
    protected int cod;
    protected String nome;
    protected String endereço;
    protected String telefone;
    protected LocalDate dataNacimento;
    protected String cpf;
    protected String rg;
    protected LocalDate dataInsercao;

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public LocalDate getDataNacimento() {
        return dataNacimento;
    }
    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public LocalDate getDataInsercao() {
        return dataInsercao;
    }
    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
    public BasePessoa(int cod, String nome, String endereço, String telefone, LocalDate dataNacimento, String cpf,
            String rg, LocalDate dataInsercao) {
        this.cod = cod;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.dataNacimento = dataNacimento;
        this.cpf = cpf;
        this.rg = rg;
        this.dataInsercao = dataInsercao;
    }
    
} 
