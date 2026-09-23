import java.util.Scanner;
public class 14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos;
        int segundosTotales;
        int horas;
        int minResto;
        int segResto;
        System.out.print("Ingrese los minutos: ");
        minutos = sc.nextInt();
        segundosTotales = minutos * 60;
        horas = minutos / 60;
        minResto = minutos % 60;
        segResto = segundosTotales % 60;
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos restantes: " + minResto);
        System.out.println("Segundos restantes: " + segResto);
        System.out.println("Segundos totales: " + segundosTotales);
        sc.close();
    }
}