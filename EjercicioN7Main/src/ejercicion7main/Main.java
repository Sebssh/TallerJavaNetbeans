/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion7main;
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

        System.out.print("Ingrese las horas trabajadas esta semana: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese la tasa de salario por hora: ");
        double tasaSalario = scanner.nextDouble();

        double salarioBruto;
        if (horasTrabajadas < 38) {
            salarioBruto = horasTrabajadas * tasaSalario;
        } else {
            int horasExtras = horasTrabajadas - 38;
            salarioBruto = (38 * tasaSalario) + (horasExtras * tasaSalario * 1.5);
        }

        double impuestos;
        if (salarioBruto <= 750) {
            impuestos = 0;
        } else {
            impuestos = salarioBruto * 0.10;
        }

        double salarioNeto = salarioBruto - impuestos;

        System.out.println("Salario bruto: " + salarioBruto + " euros");
        System.out.println("Impuestos: " + impuestos + " euros");
        System.out.println("Salario neto: " + salarioNeto + " euros");

        scanner.close();
    }
    
}
