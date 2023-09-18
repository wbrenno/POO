package uniderp.poo.escola.dominio;

public class aviao extends BaseVeiculos{
    private String porta;

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public aviao(int codigo, int anoModelo, int anoFabricacao, int eixos, int rodas, int qtdMotor, int qtdOcupante,
            double potencia, double pesoTotal, double pesoLiquido, String nome, String modelo, String cor,
            String chassi, String placa, String assentos, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String fabricante,
            String porta) {
        super(codigo, anoModelo, anoFabricacao, eixos, rodas, qtdMotor, qtdOcupante, potencia, pesoTotal, pesoLiquido,
                nome, modelo, cor, chassi, placa, assentos, tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF,
                cidadeUF, tipoVeiculo, fabricante);
        this.porta = porta;
    }
    
    
}
