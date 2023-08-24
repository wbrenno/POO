import java.util.Scanner;

public class Quest10 {
    public static void main(String[] args) throws Exception {
        Scanner calculo = new Scanner(System.in);
        int T, H, V;

        System.out.println("Me dê o tempo de viagem em Minutos: ");
        T = calculo.nextInt();
        H = T / 60;

        System.out.println("Me dê a sua velocidade média em km/h: ");
        V = calculo.nextInt();

        int distancia = H * V;
        double litrosConsumidos = distancia / 12.0;

        System.out.println("Distância Percorrida em km: " + distancia);
        System.out.println("Tempo decorrido em minutos: " + T);
        System.out.println("Velocidade média em km/h: " + V);
        System.out.println("Litros Consumidos: " + litrosConsumidos);

        calculo.close();
    }
}