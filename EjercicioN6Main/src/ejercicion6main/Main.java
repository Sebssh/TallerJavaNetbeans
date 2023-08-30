/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion6main;
import java.util.Scanner;
/**
 *
 * @author sebig
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = calcularHipotenusa(cateto1, cateto2);
        double angulo1 = calcularAngulo(cateto1, hipotenusa);
        double angulo2 = 90 - angulo1;

        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Ángulo agudo 1: " + angulo1 + " grados");
        System.out.println("Ángulo agudo 2: " + angulo2 + " grados");

        scanner.close();
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    public static double calcularAngulo(double cateto1, double hipotenusa) {
        return Math.toDegrees(Math.asin(cateto1 / hipotenusa));
    }
    
}
