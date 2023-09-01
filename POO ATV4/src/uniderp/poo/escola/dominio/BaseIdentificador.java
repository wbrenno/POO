package uniderp.poo.escola.dominio;

public abstract class BaseIdentificador{
    protected int cod;

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public BaseIdentificador(int cod) {
        this.cod = cod;
    }
    
}
