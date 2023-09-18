package uniderp.poo.esocla.dominio;

public abstract class BaseVeiculos {
    protected int codigo;
    protected int anoModelo;
    protected int anoFabricacao;
    protected int eixos;
    protected int rodas;
    protected int qtdMotor;
    protected int qtdOcupante;
    protected double potencia;
    protected double pesoTotal;
    protected double pesoLiquido;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String chassi;
    protected String placa;
    protected String assentos;
    protected String tipoCombustivel;
    protected String codigoRenavam;
    protected String nomeProprietario;
    protected String estadoUF;
    protected String cidadeUF;
    protected String tipoVeiculo;
    protected String fabricante;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getQtdMotor() {
        return qtdMotor;
    }
    public void setQtdMotor(int qtdMotor) {
        this.qtdMotor = qtdMotor;
    }
    public int getQtdOcupante() {
        return qtdOcupante;
    }
    public void setQtdOcupante(int qtdOcupante) {
        this.qtdOcupante = qtdOcupante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getAssentos() {
        return assentos;
    }
    public void setAssentos(String assentos) {
        this.assentos = assentos;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public BaseVeiculos(int codigo, int anoModelo, int anoFabricacao, int eixos, int rodas, int qtdMotor,
            int qtdOcupante, double potencia, double pesoTotal, double pesoLiquido, String nome, String modelo,
            String cor, String chassi, String placa, String assentos, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String fabricante) {
        this.codigo = codigo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.eixos = eixos;
        this.rodas = rodas;
        this.qtdMotor = qtdMotor;
        this.qtdOcupante = qtdOcupante;
        this.potencia = potencia;
        this.pesoTotal = pesoTotal;
        this.pesoLiquido = pesoLiquido;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.assentos = assentos;
        this.tipoCombustivel = tipoCombustivel;
        this.codigoRenavam = codigoRenavam;
        this.nomeProprietario = nomeProprietario;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.tipoVeiculo = tipoVeiculo;
        this.fabricante = fabricante;
    }

    

}