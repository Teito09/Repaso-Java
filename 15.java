import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p1, p2, pf;
        double definitiva;
        String estado;
        System.out.print("Ingrese la primera nota: ");
        p1 = sc.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        p2 = sc.nextDouble();
        System.out.print("Ingrese la nota final: ");
        pf = sc.nextDouble();
        definitiva = (p1 * 0.30) + (p2 * 0.30) + (pf * 0.40);
        estado = (definitiva >= 3.0) ? "Aprobado" : "Reprobado";
        System.out.printf("Definitiva: %.2f%n", definitiva);
        System.out.println("Estado: " + estado);
        sc.close();
    }
}