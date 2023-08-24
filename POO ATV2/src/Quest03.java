import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) throws Exception {

        Scanner medias = new Scanner(System.in);
        int num1, num2, num3, media;

        System.out.println("Digite o primeiro numero: ");
        num1 = medias.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = medias.nextInt();

        System.out.println("Digite o terceiro numero: ");
        num3 = medias.nextInt();

        media = (num1 + num2 + num3) / 3;

        System.out.println("A média dos 3 numeros é: " + media);

        medias.close();

    }

}
