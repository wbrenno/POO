package uniderp.poo.escola.dominio;
import java.time.LocalDate;

public class Aluno extends BasePessoa{
    private String matricula;
    private LocalDate dataMatricula;
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public Aluno(int cod, String nome, String endereço, String telefone, LocalDate dataNacimento, String cpf, String rg,
            LocalDate dataInsercao, String matricula, LocalDate dataMatricula) {
        super(cod, nome, endereço, telefone, dataNacimento, cpf, rg, dataInsercao);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

}
