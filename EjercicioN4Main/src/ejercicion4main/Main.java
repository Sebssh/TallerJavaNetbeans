/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion4main;
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

        System.out.print("Introduce la cantidad límite: ");
        int limite = scanner.nextInt();

        int suma = 0;
        int numero = 1;
        while (suma <= limite) {
            suma += numero;
            numero++;
        }
        System.out.println("El número natural más pequeño (N) cuya suma excede " + limite + " es: " + (numero - 1));

        scanner.close();
    }
    
}
