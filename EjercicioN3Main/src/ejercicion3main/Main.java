/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion3main;
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
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        scanner.close();

        double suma = 0.0;

        for (int i = 1; i <= n; i++) {
            double termino = (double) i / Math.pow(2, i);
            suma += termino;
        }

        System.out.println("La suma de la serie es: " + suma);
    }

}
