import java.util.Scanner;
public class Quest02 {
    public static void main(String[] args){

        Scanner produto = new Scanner(System.in);

        int num1, num2, prod;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = produto.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = produto.nextInt();
        
        prod = num1 * num2;

        System.out.println("O resultado da soma é : " + prod);

        produto.close();
      }
    }