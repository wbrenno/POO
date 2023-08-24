import java.util.Scanner;
public class Quest04 {
    public static void main(String[] args) throws Exception {
        Scanner sucant = new Scanner(System.in);
        int num;
        System.out.println("Escreve um número :");
        num = sucant.nextInt();


        System.out.println("O sucessor é :" + (num + 1));
        System.out.println("O antecessor é :" + (num - 1));

        sucant.close();
    }
}
