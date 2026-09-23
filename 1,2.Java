import java.util.Scanner;
public class 1,2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double horas;
        double salarioBruto;
        double valorHora;
        double descuentoSS; 
        double retencion;
        double salarioNeto;
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        horas = sc.nextDouble();
        System.out.print("Ingrese el valor por hora: ");
        valorHora = sc.nextDouble();
        salarioBruto = horas * valorHora;
        descuentoSS = salarioBruto * 0.08;
        retencion = salarioBruto * 0.05;
        salarioNeto = salarioBruto - descuentoSS - retencion;
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Descuento SS: " + descuentoSS);
        System.out.println("Retención: " + retencion);
        System.out.println("Salario neto: " + salarioNeto);
        sc.close();
    }
}