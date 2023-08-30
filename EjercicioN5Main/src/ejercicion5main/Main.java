/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion5main;

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
        
        int[] codigosProductos = {1, 2, 3, 4, 5}; // Ejemplo de códigos de productos
        double[] valoresVenta = {10.5, 15.0, 20.2, 8.75, 12.3}; // Ejemplo de valores de venta
        int[] cantidadesVendidas = {20, 15, 10, 30, 25}; // Ejemplo de cantidades vendidas

        int totalProductosVendidos = 0;
        double totalIngresos = 0.0;
        int productoMasVendido = -1;
        double maxCantidadVendida = Integer.MIN_VALUE;
        int productoMasCostoso = -1;
        double maxValorVenta = Double.MIN_VALUE;

        for (int i = 0; i < codigosProductos.length; i++) {
            totalProductosVendidos += cantidadesVendidas[i];
            totalIngresos += valoresVenta[i] * cantidadesVendidas[i];

            if (cantidadesVendidas[i] > maxCantidadVendida) {
                maxCantidadVendida = cantidadesVendidas[i];
                productoMasVendido = codigosProductos[i];
            }

            if (valoresVenta[i] > maxValorVenta) {
                maxValorVenta = valoresVenta[i];
                productoMasCostoso = codigosProductos[i];
            }
        }

        System.out.println("Total productos vendidos en el día: " + totalProductosVendidos);
        System.out.println("Total ingresos por ventas del día: $" + totalIngresos);
        System.out.println("Producto más vendido: Producto #" + productoMasVendido);
        System.out.println("Producto más costoso vendido: Producto #" + productoMasCostoso);
    }
    
}
