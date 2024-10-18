/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;


public class Cuotas {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Plazo de pago (en meses): ");
        int plazoPago = scanner.nextInt();

        System.out.print("Valor del Prestamo: ");
        double valorPrestamo = scanner.nextDouble();

        scanner.nextLine(); 

        double interesMensual = (valorPrestamo * 0.05) / plazoPago; // Interés mensual aplicado al 5%
        double comisionCuota = (valorPrestamo * 0.02); // Comisión por cuota del 2%
        double seguroMensual = (valorPrestamo * 0.01); // Porcentaje de seguro mensual del 1%

        double cuotabase = (valorPrestamo * interesMensual) / (1 - (1 + interesMensual) * (-plazoPago));
        double cuotaconcomision = cuotabase + (cuotabase * comisionCuota);
        double cuotaconseguro = cuotaconcomision + (cuotaconcomision * seguroMensual);
        double totalAPagar = cuotabase + cuotaconcomision + cuotaconseguro;

        System.out.println("**** CUOTAS MENSUALES ****");
        System.out.printf("Cuota de Pago Mensual: HNL %.2f%n", cuotabase);
        System.out.printf("Total a Pagar: HNL %.2f%n", totalAPagar);
    }
}