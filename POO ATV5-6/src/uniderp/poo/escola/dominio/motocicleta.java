package uniderp.poo.escola.dominio;

public class motocicleta extends BaseVeiculos{
    private String duas_rodas;

    public String getDuas_rodas() {
        return duas_rodas;
    }

    public void setDuas_rodas(String duas_rodas) {
        this.duas_rodas = duas_rodas;
    }

    public motocicleta(int codigo, int anoModelo, int anoFabricacao, int eixos, int rodas, int qtdMotor,
            int qtdOcupante, double potencia, double pesoTotal, double pesoLiquido, String nome, String modelo,
            String cor, String chassi, String placa, String assentos, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String fabricante,
            String duas_rodas) {
        super(codigo, anoModelo, anoFabricacao, eixos, rodas, qtdMotor, qtdOcupante, potencia, pesoTotal, pesoLiquido,
                nome, modelo, cor, chassi, placa, assentos, tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF,
                cidadeUF, tipoVeiculo, fabricante);
        this.duas_rodas = duas_rodas;
    }

    
}