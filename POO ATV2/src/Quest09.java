import java.util.Scanner;
public class Quest09 {
    public static void main(String[] args) throws Exception {
        Scanner celsius = new Scanner(System.in);

        int graus;
        
        System.out.println("Escreve em graus uma temperatura: ");
        graus = celsius.nextInt();
        
        
        System.out.println("A temperatura em F é de :" + (9 * graus + 160) / 5);
        
        celsius.close();
    }
}
