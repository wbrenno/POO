package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa{

   private String registro;
   private LocalDate dataContratacao;

   public String getRegistro() {
      return registro;
   }
   public void setRegistro(String registro) {
      this.registro = registro;
   }
   public LocalDate getDataContratacao() {
      return dataContratacao;
   }
   public void setDataContratacao(LocalDate dataContratacao) {
      this.dataContratacao = dataContratacao;
   }
   public Professor(int cod, String nome, String endereço, String telefone, LocalDate dataNacimento, String cpf,
         String rg, LocalDate dataInsercao, String registro, LocalDate dataContratacao) {
      super(cod, nome, endereço, telefone, dataNacimento, cpf, rg, dataInsercao);
      this.registro = registro;
      this.dataContratacao = dataContratacao;
   }
   
}
