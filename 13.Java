import java.util.Scanner;

public class 13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, radio;
        double areaRectangulo, perimetroRectangulo;
        double areaCirculo, circunferencia;
        System.out.print("Ingrese la base del rectángulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = sc.nextDouble();
        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextDouble();
        areaRectangulo = base * altura;
        perimetroRectangulo = 2 * (base + altura);
        areaCirculo = Math.PI * radio * radio;
        circunferencia = 2 * Math.PI * radio;
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Circunferencia: " + circunferencia);
        sc.close();
    }
}