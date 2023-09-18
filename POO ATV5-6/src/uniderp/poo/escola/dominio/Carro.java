package uniderp.poo.escola.dominio;

public class Carro extends BaseVeiculos{
    private String Porta;

    public String getPorta() {
        return Porta;
    }

    public void setPorta(String porta) {
        Porta = porta;
    }

    public Carro(int codigo, int anoModelo, int anoFabricacao, int eixos, int rodas, int qtdMotor, int qtdOcupante,
            double potencia, double pesoTotal, double pesoLiquido, String nome, String modelo, String cor,
            String chassi, String placa, String assentos, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String fabricante) {
        super(codigo, anoModelo, anoFabricacao, eixos, rodas, qtdMotor, qtdOcupante, potencia, pesoTotal, pesoLiquido,
                nome, modelo, cor, chassi, placa, assentos, tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF,
                cidadeUF, tipoVeiculo, fabricante);
    }
    
}
