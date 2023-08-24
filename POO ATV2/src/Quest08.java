import java.util.Scanner;

public class Quest08 {
           public static void main(String[] args) throws Exception {
        Scanner reajust = new Scanner(System.in);

        int salario;
        double rea; 
        
        System.out.println("Escreve o seu salário: ");
        salario = reajust.nextInt();
        
        System.out.println("Escreve o porcentual do seu reajuste: ");
        rea = reajust.nextDouble();

        rea = rea / 100.0;
        
        System.out.println("O seu novo Salario será de :" + (salario + salario * rea));

        reajust.close();
    }
}
