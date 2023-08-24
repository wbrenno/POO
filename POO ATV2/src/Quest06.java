import java.util.Scanner;

public class Quest06 {
        public static void main(String[] args) throws Exception {
        Scanner reajust = new Scanner(System.in);

        int poupança; 
        
        System.out.println("Escreve seu Saldo: ");
        poupança = reajust.nextInt();

        System.out.println("Seu Saldo com ajuste é: " + (poupança + poupança * 0.02));

        reajust.close();
    }
}
