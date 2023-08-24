import java.util.Scanner;

public class Quest07 {
        public static void main(String[] args) throws Exception {
        Scanner reajust = new Scanner(System.in);

        int base, altura; 
        
        System.out.println("Escreve a base: ");
        base = reajust.nextInt();

        System.out.println("Escreve a altura: ");
        altura = reajust.nextInt();
        
        System.out.println("Perimetro :" + (base + altura) + "\nÁrea :" + (base * altura));

        reajust.close();
    }
}
