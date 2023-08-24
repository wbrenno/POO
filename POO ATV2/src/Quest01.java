import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) throws Exception {
        int num1, num2, soma;

        Scanner somas = new Scanner (System.in);{
        
        System.out.println("Digite o primeiro numero: ");
        num1 = somas.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = somas.nextInt();
        
        soma = num1 + num2;

        System.out.println("O resultado da soma é : " + soma);

        somas.close();

        }

    }
}
