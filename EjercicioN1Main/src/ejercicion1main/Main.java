/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion1main;
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

        System.out.print("Ingrese la longitud de la habitación en metros: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingrese la anchura de la habitación en metros: ");
        double anchura = scanner.nextDouble();

        double superficie = calcularSuperficie(longitud, anchura);

        System.out.println("La superficie de la habitación es: " + superficie + " metros cuadrados");

        scanner.close();
    }

    public static double calcularSuperficie(double longitud, double anchura) {
        return longitud * anchura;
    }
    
}
