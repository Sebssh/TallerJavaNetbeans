/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion2main;
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

        System.out.print("Introduce la hora en formato HH:mm: ");
        String input = scanner.nextLine();

        if (input.length() == 5 && input.charAt(2) == ':') {
            try {
                int horas = Integer.parseInt(input.substring(0, 2));
                int minutos = Integer.parseInt(input.substring(3));

                if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
                    String meridiano = (horas >= 12) ? "pm" : "am";

                    if (horas == 0) {
                        horas = 12;
                    } else if (horas > 12) {
                        horas -= 12;
                    }

                    System.out.println("Hora en notación de 12 horas: " + horas + ":" + String.format("%02d", minutos) + " " + meridiano);
                } else {
                    System.out.println("La hora o los minutos son inválidos.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de hora incorrecto.");
            }
        } else {
            System.out.println("Formato de entrada incorrecto. Debe ser HH:mm");
        }

        scanner.close();
    }
    
}
