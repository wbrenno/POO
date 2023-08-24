import java.util.Scanner;
public class Quest05 {
    public static void main(String[] args) throws Exception {
        Scanner dados = new Scanner(System.in);

        String nome;
        int tel, end; 
        
        System.out.println("Escreve seu Nome :");
        nome = dados.nextLine();

        System.out.println("Escreve seu Telefone :");
        tel = dados.nextInt();

        System.out.println("Escreve seu Endereço :");
        end = dados.nextInt();

        System.out.println("Seu Nome: " + nome + "\nSeu Telefone: " + tel + "\nSeu Endereço: "  + end);

        dados.close();
    }
}